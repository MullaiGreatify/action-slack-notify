package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_ManageAccountingAndAssetStep {

	PageObjectManager pom = new PageObjectManager();

	@When("the user adds a new vendor")
	public void theUserAddsANewVendor() throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().CreateNewVendor();

	}

	@Then("the user should see the new vendor in the vendor list")
	public void theUserShouldSeeTheNewVendorInTheVendorList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyNewVendorIsCreated();
	}

	@When("the user creates a new purchase order")
	public void theUserCreatesANewPurchaseOrder()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().CreatesNewPurchaseOrder();

	}

	@Then("the user should see the created purchase order in the purchase list")
	public void theUserShouldSeeTheCreatedPurchaseOrderInThePurchaseList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyPurchaseOrderIsCreated();
	}

	@When("the user creates a new payment")
	public void theUserCreatesANewPayment()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().CreatesNewPayment();
	}

	@Then("the user should see the created payment in the payment list")
	public void theUserShouldSeeTheCreatedPaymentInThePaymentList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyPaymentIsCreated();

	}

	@When("the user creates a new receipt")
	public void theUserCreatesANewReceipt()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().CreatesNewReceipt();
	}

	@Then("the user should see the created receipt in the receipt list")
	public void theUserShouldSeeTheCreatedReceiptInTheReceiptList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyReceiptIsCreated();
	}

	@When("the user updates the receipt details")
	public void theUserUpdatesTheReceiptDetails()
			throws NumberFormatException, FileNotFoundException, InterruptedException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().UpdatesTheReceiptDetails();

	}

	@Then("the user should see the updated receipt details in the receipt list")
	public void theUserShouldSeeTheUpdatedReceiptDetailsInTheReceiptList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyReceiptDetailsIsUpdated();

	}

	@When("the user deletes a receipt")
	public void theUserDeletesAReceipt() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().DeletesAReceipt();

	}

	@Then("the user should verify that the receipt is removed from the receipt list")
	public void theUserShouldVerifyThatTheReceiptIsRemovedFromTheReceiptList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyReceiptDetailsIsDeleted();

	}

	@When("the user updates the payment details")
	public void theUserUpdatesThePaymentDetails()
			throws NumberFormatException, FileNotFoundException, InterruptedException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().UpdatesThePaymentDetails();

	}

	@Then("the user should see the updated payment details in the payment list")
	public void theUserShouldSeeTheUpdatedPaymentDetailsInThePaymentList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyPaymentDetailsIsUpdated();

	}

	@When("the user deletes a payment")
	public void theUserDeletesAPayment() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().DeletePayment();
	}

	@Then("the user should verify that the payment is removed from the payment list")
	public void theUserShouldVerifyThatThePaymentIsRemovedFromThePaymentList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyPaymentDetailsIsDeleted();
	}

	@When("the user updates the purchase order details")
	public void theUserUpdatesThePurchaseOrderDetails()
			throws NumberFormatException, FileNotFoundException, InterruptedException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().UpdateThePurchaseOrderDetail();

	}

	@Then("the user should see the updated purchase order details in the PO list")
	public void theUserShouldSeeTheUpdatedPurchaseOrderDetailsInThePOList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyPurchaseOrderIsUpdated();

	}

	@When("the user deletes a purchase order")
	public void theUserDeletesAPurchaseOrder() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().DeleteAPurchaseOrder();

	}

	@Then("the user should verify that the purchase order is removed from the PO list")
	public void theUserShouldVerifyThatThePurchaseOrderIsRemovedFromThePOList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyPurchaseOrderIsDeleted();

	}

	@When("the user updates the vendor details")
	public void theUserUpdatesTheVendorDetails()
			throws NumberFormatException, FileNotFoundException, InterruptedException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().UpdateTheVendorDetails();

	}

	@Then("the user should see the updated vendor details in the vendor list")
	public void theUserShouldSeeTheUpdatedVendorDetailsInTheVendorList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().verifyVendorIsUpdated();

	}

	@When("the user deletes a vendor")
	public void theUserDeletesAVendor() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().DeleteTheVendor();

	}

	@Then("the user should verify that the vendor is removed from the vendor list")
	public void theUserShouldVerifyThatTheVendorIsRemovedFromTheVendorList() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().verifyVendorIsDeleted();

	}

	@When("the user create a new asset")
	public void theUserCreateANewAsset()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().CreateNewAsset();

	}

	@Then("the user should see the new asset in the manage asset")
	public void theUserShouldSeeTheNewAssetInTheManageAsset() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyAssetIsCreated();

	}

	@When("the user updates the asset")
	public void theUserUpdatesTheAsset()
			throws NumberFormatException, FileNotFoundException, InterruptedException, IOException, CsvException {

		pom.getManageAccountingAndAssetPage().UpdateTheAsseet();

	}

	@Then("the user should see the updated asset details in the manage asset")
	public void theUserShouldSeeTheUpdatedAssetDetailsInTheManageAsset() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyAssetIsUpdated();

	}

	@When("the user deletes a asset")
	public void theUserDeletesAAsset() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().DeleteTheAsset();

	}

	@Then("the user should verify that the asset is removed from the manage asset")
	public void theUserShouldVerifyThatTheAssetIsRemovedFromTheManageAsset() throws InterruptedException {

		pom.getManageAccountingAndAssetPage().VerifyAssetIsDeleted();

	}

}
