package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC7_ManageStaffStep {

	PageObjectManager pom = new PageObjectManager();

	@When("the user creates new Teaching Staff")
	public void theUserCreatesNewTeachingStaff()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageStaffPage().CreatesNewTeachingStaff();

	}

	@Then("the user should see the new Teaching Staff in the Teacher List")
	public void theUserShouldSeeTheNewTeachingStaffInTheTeacherList() throws InterruptedException {

		pom.getManageStaffPage().VerifyTeachingStaffIsCreated();
	}

	@When("the user updates the Teaching Staff details")
	public void theUserUpdatesTheTeachingStaffDetails()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageStaffPage().UpdateTheTeachingStaff();
	}

	@Then("the user should see the updated Teaching Staff details in the Teacher list")
	public void theUserShouldSeeTheUpdatedTeachingStaffDetailsInTheTeacherList() throws InterruptedException {

		pom.getManageStaffPage().VerifyTeachingStaffIsUpdated();

	}

	@When("the user deletes a Teaching Staff")
	public void theUserDeletesATeachingStaff()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException, InterruptedException {

		pom.getManageStaffPage().DeleteTheTeachingStaff();
	}

	@Then("the user should verify that the Teaching Staff is removed from the Teacher list")
	public void theUserShouldVerifyThatTheTeachingStaffIsRemovedFromTheTeacherList() throws InterruptedException {

		pom.getManageStaffPage().VerifyTeachingStaffIsDeleted();

	}

	@When("the user creates new Non-Teaching Staff")
	public void theUserCreatesNewNonTeachingStaff() {

		pom.getManageStaffPage().CreatesNewNonTeachingStaff();

	}

	@Then("the user should see the new Non-Teaching Staff in the Non-Teaching Staff List")
	public void theUserShouldSeeTheNewNonTeachingStaffInTheNonTeachingStaffList() {

		pom.getManageStaffPage().VerifyNonTeachingStaffIsCreated();

	}

	@When("the user updates the Non-Teaching Staff details")
	public void theUserUpdatesTheNonTeachingStaffDetails() {

		pom.getManageStaffPage().UpdateTheNonTeachingStaff();

	}

	@Then("the user should see the updated Non-Teaching Staff details in the Non-Teaching Staff list")
	public void theUserShouldSeeTheUpdatedNonTeachingStaffDetailsInTheNonTeachingStaffList() {

		pom.getManageStaffPage().VerifyNonTeachingStaffIsUpdated();

	}

	@When("the user deletes a Non-Teaching Staff")
	public void theUserDeletesANonTeachingStaff() {

		pom.getManageStaffPage().DeleteTheNonTeachingStaff();

	}

	@Then("the user should verify that the Non-Teaching Staff is removed from the Non-Teaching Staff list")
	public void theUserShouldVerifyThatTheNonTeachingStaffIsRemovedFromTheNonTeachingStaffList() {

		pom.getManageStaffPage().VerifyNonTeachingStaffIsDeleted();

	}

}
