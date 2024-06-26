FROM golang:1.22-alpine3.19@sha256:65b5d2d0a312fd9ef65551ad7f9cb5db1f209b7517ef6d5625cfd29248bc6c85 AS builder

LABEL "com.github.actions.icon"="bell"
LABEL "com.github.actions.color"="yellow"
LABEL "com.github.actions.name"="Slack Notify"
LABEL "com.github.actions.description"="This action will send notification to Slack"
LABEL "org.opencontainers.image.source"="https://github.com/MullaiGreatify/action-slack-notify.git"

WORKDIR ${GOPATH}/src/github.com/MullaiGreatify/action-slack-notify
COPY main.go ${GOPATH}/src/github.com/MullaiGreatify/action-slack-notify

ENV CGO_ENABLED 0
ENV GOOS linux

RUN go build -a -installsuffix cgo -ldflags '-w  -extldflags "-static"' -o /go/bin/slack-notify main.go

# alpine:latest as of 2024-03-11
FROM alpine@sha256:77726ef6b57ddf65bb551896826ec38bc3e53f75cdde31354fbffb4f25238ebd

COPY --from=builder /go/bin/slack-notify /usr/bin/slack-notify

ENV VAULT_VERSION 1.0.2

RUN apk update \
	&& apk upgrade \
	&& apk add \
		bash \
		jq \
		ca-certificates \
		python3 \
		py3-pip \
		rsync \
	&& python3 -m pip install --break-system-packages shyaml \
	&& rm -rf /var/cache/apk/*

# Setup Vault
RUN wget https://releases.hashicorp.com/vault/${VAULT_VERSION}/vault_${VAULT_VERSION}_linux_amd64.zip && \
	unzip vault_${VAULT_VERSION}_linux_amd64.zip && \
	rm vault_${VAULT_VERSION}_linux_amd64.zip && \
	mv vault /usr/local/bin/vault

# fix the missing dependency - https://stackoverflow.com/a/35613430
RUN mkdir /lib64 && ln -s /lib/libc.musl-x86_64.so.1 /lib64/ld-linux-x86-64.so.2

COPY *.sh /

RUN chmod +x /*.sh

ENTRYPOINT ["/entrypoint.sh"]
