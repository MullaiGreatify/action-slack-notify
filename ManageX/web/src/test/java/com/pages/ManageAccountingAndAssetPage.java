package com.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.opencsv.exceptions.CsvException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAccountingAndAssetPage extends BaseClass {

	int rowNum = 1;

	public ManageAccountingAndAssetPage() {
		PageFactory.initElements(driver, this);
		implicitwait(30);
	}

	@FindBy(id = "schoolManagementSection")
	private WebElement schoolConfigMenu;
	@FindBy(id = "sideVisitors")
	private WebElement visitorLogMenu;
	@FindBy(id = "AccountingSidebar")
	private WebElement accountingSidebar;
	@FindBy(id = "sideVendorAcc")
	private WebElement sideVendorAcc;

	public WebElement getSideVendorAcc() {
		return sideVendorAcc;
	}

	public void setSideVendorAcc(WebElement sideVendorAcc) {
		this.sideVendorAcc = sideVendorAcc;
	}

	public WebElement getAccountingSidebar() {
		return accountingSidebar;
	}

	public void setAccountingSidebar(WebElement accountingSidebar) {
		this.accountingSidebar = accountingSidebar;
	}

	public WebElement getSchoolConfigMenu() {
		return schoolConfigMenu;
	}

	public void setSchoolConfigMenu(WebElement schoolConfigMenu) {
		this.schoolConfigMenu = schoolConfigMenu;
	}

	public WebElement getVisitorLogMenu() {
		return visitorLogMenu;
	}

	public void setVisitorLogMenu(WebElement visitorLogMenu) {
		this.visitorLogMenu = visitorLogMenu;
	}

	/*
	 * 1. Create New Vendor
	 */

	@FindBy(xpath = "//button[contains(.,'Add')]")
	private WebElement addBtn;
	@FindBy(id = "VendorName")
	private WebElement vendorNameTxt;
	@FindBy(id = "ContactNumber")
	private WebElement contactNumberTxt;
	@FindBy(id = "Address")
	private WebElement addressTxt;
	@FindBy(id = "MailID")
	private WebElement mailIDTxt;
	@FindBy(id = "gstNumber")
	private WebElement gstNumberTxt;
	@FindBy(id = "panNumber")
	private WebElement panNumberTxt;

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(WebElement addBtn) {
		this.addBtn = addBtn;
	}

	public WebElement getVendorNameTxt() {
		return vendorNameTxt;
	}

	public void setVendorNameTxt(WebElement vendorNameTxt) {
		this.vendorNameTxt = vendorNameTxt;
	}

	public WebElement getContactNumberTxt() {
		return contactNumberTxt;
	}

	public void setContactNumberTxt(WebElement contactNumberTxt) {
		this.contactNumberTxt = contactNumberTxt;
	}

	public WebElement getAddressTxt() {
		return addressTxt;
	}

	public void setAddressTxt(WebElement addressTxt) {
		this.addressTxt = addressTxt;
	}

	public WebElement getMailIDTxt() {
		return mailIDTxt;
	}

	public void setMailIDTxt(WebElement mailIDTxt) {
		this.mailIDTxt = mailIDTxt;
	}

	public WebElement getGstNumberTxt() {
		return gstNumberTxt;
	}

	public void setGstNumberTxt(WebElement gstNumberTxt) {
		this.gstNumberTxt = gstNumberTxt;
	}

	public WebElement getPanNumberTxt() {
		return panNumberTxt;
	}

	public void setPanNumberTxt(WebElement panNumberTxt) {
		this.panNumberTxt = panNumberTxt;
	}

	/*
	 * 2. Creates New Purchase Order
	 */

	@FindBy(id = "sidepurchaseAcc")
	private WebElement sidepurchaseAcc;
	@FindBy(xpath = "//button[contains(.,'Create New')]")
	private WebElement createNewBtn;
	@FindBy(id = "vendorPurchaseOrder")
	private WebElement vendorPurchaseOrder;
	@FindBy(css = "#createPODate")
	private WebElement createPODate;
	@FindBy(css = "#createExpiryDate")
	private WebElement createExpiryDate;
	@FindBy(id = "createPaymentDays")
	private WebElement createPaymentDays;
	@FindBy(id = "createDescription")
	private WebElement createDescription;
	@FindBy(id = "create_item_name1")
	private WebElement create_item_name;
	@FindBy(id = "create_item_quantity1")
	private WebElement create_item_quantity;
	@FindBy(id = "create_item_rate1")
	private WebElement create_item_rate;
	@FindBy(id = "create_item_tax1")
	private WebElement create_item_tax;

	public WebElement getSidepurchaseAcc() {
		return sidepurchaseAcc;
	}

	public void setSidepurchaseAcc(WebElement sidepurchaseAcc) {
		this.sidepurchaseAcc = sidepurchaseAcc;
	}

	public WebElement getCreateNewBtn() {
		return createNewBtn;
	}

	public void setCreateNewBtn(WebElement createNewBtn) {
		this.createNewBtn = createNewBtn;
	}

	public WebElement getVendorPurchaseOrder() {
		return vendorPurchaseOrder;
	}

	public void setVendorPurchaseOrder(WebElement vendorPurchaseOrder) {
		this.vendorPurchaseOrder = vendorPurchaseOrder;
	}

	public WebElement getCreatePODate() {
		return createPODate;
	}

	public void setCreatePODate(WebElement createPODate) {
		this.createPODate = createPODate;
	}

	public WebElement getCreateExpiryDate() {
		return createExpiryDate;
	}

	public void setCreateExpiryDate(WebElement createExpiryDate) {
		this.createExpiryDate = createExpiryDate;
	}

	public WebElement getCreatePaymentDays() {
		return createPaymentDays;
	}

	public void setCreatePaymentDays(WebElement createPaymentDays) {
		this.createPaymentDays = createPaymentDays;
	}

	public WebElement getCreateDescription() {
		return createDescription;
	}

	public void setCreateDescription(WebElement createDescription) {
		this.createDescription = createDescription;
	}

	public WebElement getCreate_item_name() {
		return create_item_name;
	}

	public void setCreate_item_name(WebElement create_item_name) {
		this.create_item_name = create_item_name;
	}

	public WebElement getCreate_item_quantity() {
		return create_item_quantity;
	}

	public void setCreate_item_quantity(WebElement create_item_quantity) {
		this.create_item_quantity = create_item_quantity;
	}

	public WebElement getCreate_item_rate() {
		return create_item_rate;
	}

	public void setCreate_item_rate(WebElement create_item_rate) {
		this.create_item_rate = create_item_rate;
	}

	public WebElement getCreate_item_tax() {
		return create_item_tax;
	}

	public void setCreate_item_tax(WebElement create_item_tax) {
		this.create_item_tax = create_item_tax;
	}

	/*
	 * 3. Create New Payment
	 */

	@FindBy(id = "sidepaymentAcc")
	private WebElement sidepaymentAcc;
	@FindBy(xpath = "//button[contains(.,'Create New')]")
	private WebElement createNewBtn2;
	@FindBy(id = "partyName")
	private WebElement partyName;
	@FindBy(id = "invoiceNumber")
	private WebElement invoiceNumber;
	@FindBy(css = ".category-token-error")
	private WebElement vendorCategory;
	@FindBy(id = "paymentAmount")
	private WebElement paymentAmount;
	@FindBy(id = "longText")
	private WebElement paymentDescription;

	public WebElement getSidepaymentAcc() {
		return sidepaymentAcc;
	}

	public void setSidepaymentAcc(WebElement sidepaymentAcc) {
		this.sidepaymentAcc = sidepaymentAcc;
	}

	public WebElement getCreateNewBtn2() {
		return createNewBtn2;
	}

	public void setCreateNewBtn2(WebElement createNewBtn2) {
		this.createNewBtn2 = createNewBtn2;
	}

	public WebElement getPartyName() {
		return partyName;
	}

	public void setPartyName(WebElement partyName) {
		this.partyName = partyName;
	}

	public WebElement getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(WebElement invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public WebElement getVendorCategory() {
		return vendorCategory;
	}

	public void setVendorCategory(WebElement vendorCategory) {
		this.vendorCategory = vendorCategory;
	}

	public WebElement getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(WebElement paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public WebElement getPaymentDescription() {
		return paymentDescription;
	}

	public void setPaymentDescription(WebElement paymentDescription) {
		this.paymentDescription = paymentDescription;
	}

	/*
	 * 4. Create New Receipt
	 */

	@FindBy(id = "sidereceiptAcc")
	private WebElement sidereceiptAcc;
	@FindBy(id = "incomePartyName")
	private WebElement incomePartyName;
	@FindBy(id = "incomeInvoiceNo")
	private WebElement incomeInvoiceNum;
	@FindBy(id = "incomeAmount")
	private WebElement incomeAmount;
	@FindBy(id = "incomeLongText")
	private WebElement incomeLongText;

	public WebElement getSidereceiptAcc() {
		return sidereceiptAcc;
	}

	public void setSidereceiptAcc(WebElement sidereceiptAcc) {
		this.sidereceiptAcc = sidereceiptAcc;
	}

	public WebElement getIncomePartyName() {
		return incomePartyName;
	}

	public void setIncomePartyName(WebElement incomePartyName) {
		this.incomePartyName = incomePartyName;
	}

	public WebElement getIncomeInvoiceNum() {
		return incomeInvoiceNum;
	}

	public void setIncomeInvoiceNum(WebElement incomeInvoiceNum) {
		this.incomeInvoiceNum = incomeInvoiceNum;
	}

	public WebElement getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(WebElement incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public WebElement getIncomeLongText() {
		return incomeLongText;
	}

	public void setIncomeLongText(WebElement incomeLongText) {
		this.incomeLongText = incomeLongText;
	}

	@FindBy(xpath = "//button[contains(.,'Submit')]")
	private WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement successOKBtn;

	public WebElement getSuccessOKBtn() {
		return successOKBtn;
	}

	public void setSuccessOKBtn(WebElement successOKBtn) {
		this.successOKBtn = successOKBtn;
	}

	@FindBy(css = ".swal-text")
	private WebElement successText;

	public WebElement getSuccessText() {
		return successText;
	}

	public void setSuccessText(WebElement successText) {
		this.successText = successText;
	}

	/*
	 * 5. Updates
	 */

	@FindBy(id = "DataTables_Table_0")
	private WebElement table;

	public WebElement getTable() {
		return table;
	}

	public void setTable(WebElement table) {
		this.table = table;
	}

	@FindBy(id = "edit_party_name")
	private WebElement edit_party_name;
	@FindBy(xpath = "//button[contains(.,'Update')]")
	private WebElement updateBtn;
	@FindBy(xpath = "//button[contains(.,'Yes, I am sure!')]")
	private WebElement confirmDeleteBtn;
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	private WebElement deleteBtn;

	@FindBy(id = "edit_vendor_name")
	private WebElement edit_vendor_name;

	public WebElement getEdit_vendor_name() {
		return edit_vendor_name;
	}

	public void setEdit_vendor_name(WebElement edit_vendor_name) {
		this.edit_vendor_name = edit_vendor_name;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(WebElement deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public WebElement getConfirmDeleteBtn() {
		return confirmDeleteBtn;
	}

	public void setConfirmDeleteBtn(WebElement confirmDeleteBtn) {
		this.confirmDeleteBtn = confirmDeleteBtn;
	}

	public WebElement getEdit_party_name() {
		return edit_party_name;
	}

	public void setEdit_party_name(WebElement edit_party_name) {
		this.edit_party_name = edit_party_name;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(WebElement updateBtn) {
		this.updateBtn = updateBtn;
	}

	@FindBy(id = "edit_PO_description")
	private WebElement edit_PO_description;

	public WebElement getEdit_PO_description() {
		return edit_PO_description;
	}

	public void setEdit_PO_description(WebElement edit_PO_description) {
		this.edit_PO_description = edit_PO_description;
	}

	/*
	 * 6. Create New Asset
	 */

	@FindBy(id = "asset")
	private WebElement assetMenu;

	@FindBy(id = "manageAsset")
	private WebElement manageAsset;
	@FindBy(xpath = "//button[contains(.,'Create New')]")
	private WebElement createNewBtn3;
	@FindBy(css = ".uploadImageField > p:nth-child(2)")
	private WebElement uploadImage;
	@FindBy(id = "asset_name")
	private WebElement assetName;
	@FindBy(id = "asset_value")
	private WebElement assetValue;
	@FindBy(id = "asset_type")
	private WebElement assetType;
	@FindBy(id = "asset_location")
	private WebElement assetLocation;
	@FindBy(id = "asset_coment")
	private WebElement assetComment;

	@FindBy(id = "po_number")
	private WebElement poNumber;
	@FindBy(id = "grn_number")
	private WebElement grnNumber;

	public WebElement getAssetMenu() {
		return assetMenu;
	}

	public void setAssetMenu(WebElement assetMenu) {
		this.assetMenu = assetMenu;
	}

	public WebElement getManageAsset() {
		return manageAsset;
	}

	public void setManageAsset(WebElement manageAsset) {
		this.manageAsset = manageAsset;
	}

	public WebElement getCreateNewBtn3() {
		return createNewBtn3;
	}

	public void setCreateNewBtn3(WebElement createNewBtn3) {
		this.createNewBtn3 = createNewBtn3;
	}

	public WebElement getUploadImage() {
		return uploadImage;
	}

	public void setUploadImage(WebElement uploadImage) {
		this.uploadImage = uploadImage;
	}

	public WebElement getAssetName() {
		return assetName;
	}

	public void setAssetName(WebElement assetName) {
		this.assetName = assetName;
	}

	public WebElement getAssetValue() {
		return assetValue;
	}

	public void setAssetValue(WebElement assetValue) {
		this.assetValue = assetValue;
	}

	public WebElement getAssetType() {
		return assetType;
	}

	public void setAssetType(WebElement assetType) {
		this.assetType = assetType;
	}

	public WebElement getAssetLocation() {
		return assetLocation;
	}

	public void setAssetLocation(WebElement assetLocation) {
		this.assetLocation = assetLocation;
	}

	public WebElement getAssetComment() {
		return assetComment;
	}

	public void setAssetComment(WebElement assetComment) {
		this.assetComment = assetComment;
	}

	public WebElement getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(WebElement poNumber) {
		this.poNumber = poNumber;
	}

	public WebElement getGrnNumber() {
		return grnNumber;
	}

	public void setGrnNumber(WebElement grnNumber) {
		this.grnNumber = grnNumber;
	}

	/*
	 * 7. Update Asset
	 */

	@FindBy(id = "edit_asset_name")
	private WebElement editAssetName;

	public WebElement getEditAssetName() {
		return editAssetName;
	}

	public void setEditAssetName(WebElement editAssetName) {
		this.editAssetName = editAssetName;
	}

	public void CreateNewVendor() throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSchoolConfigMenu());
		clickWithMultipleRetry(getSchoolConfigMenu(), 10, 1000);

		mouseOverActionMoveToElement(getVisitorLogMenu());

		explicitWaitClickable(30, getAccountingSidebar());
		clickWithMultipleRetry(getAccountingSidebar(), 10, 1000);

		explicitWaitClickable(30, getSideVendorAcc());
		clickWithMultipleRetry(getSideVendorAcc(), 10, 1000);

		explicitWaitClickable(30, getAddBtn());
		clickWithMultipleRetry(getAddBtn(), 10, 1000);

		explicitWaitClickable(30, getVendorNameTxt());
		clickWithMultipleRetry(getVendorNameTxt(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 0);
		System.out.println(cell);
		EnterInTextbox(getVendorNameTxt(), cell);

		explicitWaitClickable(30, getContactNumberTxt());
		clickWithMultipleRetry(getContactNumberTxt(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 1);
		System.out.println(cell2);
		EnterInTextbox(getContactNumberTxt(), cell2);

		explicitWaitClickable(30, getMailIDTxt());
		clickWithMultipleRetry(getMailIDTxt(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 2);
		System.out.println(cell3);
		EnterInTextbox(getMailIDTxt(), cell3);

		explicitWaitClickable(30, getGstNumberTxt());
		clickWithMultipleRetry(getGstNumberTxt(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 3);
		System.out.println(cell4);
		EnterInTextbox(getGstNumberTxt(), cell4);

		explicitWaitClickable(30, getPanNumberTxt());
		clickWithMultipleRetry(getPanNumberTxt(), 10, 1000);
		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 4);
		System.out.println(cell5);
		EnterInTextbox(getPanNumberTxt(), cell5);

		explicitWaitClickable(30, getAddressTxt());
		clickWithMultipleRetry(getAddressTxt(), 10, 1000);
		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 5);
		System.out.println(cell6);
		EnterInTextbox(getAddressTxt(), cell6);

		explicitWaitClickable(30, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

	}

	public void VerifyNewVendorIsCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Vendor Created Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void CreatesNewPurchaseOrder()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		int VendorIndex = 1;

		explicitWaitClickable(30, getSidepurchaseAcc());
		clickWithMultipleRetry(getSidepurchaseAcc(), 10, 1000);

		explicitWaitClickable(30, getCreateNewBtn());
		clickWithMultipleRetry(getCreateNewBtn(), 10, 1000);

		explicitWaitClickable(30, getVendorPurchaseOrder());
		clickWithMultipleRetry(getVendorPurchaseOrder(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 6);
		System.out.println(cell);
		selectDdnByIndex(getVendorPurchaseOrder(), VendorIndex);

		/**
		 * Handling Create Purchase Order Date Picker
		 */

//		String desiredDate;
//		String desiredMonth;
//		String desiredYear;
//
//		desiredDate = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 7);
//		System.out.println(desiredDate);
//		desiredMonth = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 8);
//		System.out.println(desiredMonth);
//		desiredYear = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 9);
//		System.out.println(desiredYear);
//
//		// Assume 'driver' is your WebDriver instance
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//		// Locate the datepicker input field and click on it
//		getCreatePODate().click();
//
//		// Wait for the DateTimePicker widget to be visible
//		WebElement dateTimePickerWidget = wait.until(
//				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bootstrap-datetimepicker-widget")));
//
//		WebElement pickerswitch = dateTimePickerWidget.findElement(By.className("picker-switch"));
//		pickerswitch.click();
//
//		WebElement monthSelector = dateTimePickerWidget.findElement(By.className("datepicker-months"));
//		WebElement findElement = monthSelector.findElement(By.className("picker-switch"));
//		findElement.click();
//
//		// Select the desired year
//		WebElement yearSelector = dateTimePickerWidget.findElement(By.className("datepicker-years"));
//
//		WebElement yearOption = yearSelector.findElement(By.xpath("//span[text()='" + desiredYear + "']"));
//
//		explicitWaitClickable(10, yearOption);
//		clickWithRetry(yearOption);
//
//		// Select the desired month
//
//		WebElement monthOption = monthSelector.findElement(By.xpath("//span[text()='" + desiredMonth + "']"));
//
//		explicitWaitClickable(10, monthOption);
//		clickWithRetry(monthOption);
//
//		// Select the desired date
//		WebElement dateSelector = dateTimePickerWidget.findElement(By.className("datepicker-days"));
//
//		WebElement dateOption = dateSelector.findElement(By.xpath("//td[contains(@data-day, '" + desiredDate + "')]"));
//
//		explicitWaitClickable(10, dateOption);
//		clickWithRetry(dateOption);

		/**
		 * Handling Create Delivery PO Date Picker
		 */

		String desiredDate1;
		String desiredMonth1;
		String desiredYear1;

		desiredDate1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 10);
		System.out.println(desiredDate1);
		desiredMonth1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 11);
		System.out.println(desiredMonth1);
		desiredYear1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 12);
		System.out.println(desiredYear1);

		// Assume 'driver' is your WebDriver instance
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate the datepicker input field and click on it
		getCreateExpiryDate().click();

		// Wait for the DateTimePicker widget to be visible
		WebElement dateTimePickerWidget1 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bootstrap-datetimepicker-widget")));

		WebElement pickerswitch1 = dateTimePickerWidget1.findElement(By.className("picker-switch"));
		pickerswitch1.click();

		WebElement monthSelector1 = dateTimePickerWidget1.findElement(By.className("datepicker-months"));
		WebElement findElement1 = monthSelector1.findElement(By.className("picker-switch"));
		findElement1.click();

		// Select the desired year
		WebElement yearSelector1 = dateTimePickerWidget1.findElement(By.className("datepicker-years"));

		WebElement yearOption1 = yearSelector1.findElement(By.xpath("//span[text()='" + desiredYear1 + "']"));

		explicitWaitClickable(10, yearOption1);
		clickWithRetry(yearOption1);

		// Select the desired month

		WebElement monthOption1 = monthSelector1.findElement(By.xpath("//span[text()='" + desiredMonth1 + "']"));

		explicitWaitClickable(10, monthOption1);
		clickWithRetry(monthOption1);

		// Select the desired date
		WebElement dateSelector1 = dateTimePickerWidget1.findElement(By.className("datepicker-days"));

		WebElement dateOption1 = dateSelector1
				.findElement(By.xpath("//td[contains(@data-day, '" + desiredDate1 + "')]"));

		explicitWaitClickable(10, dateOption1);
		clickWithRetry(dateOption1);

		explicitWaitClickable(30, getCreatePaymentDays());
		clickWithMultipleRetry(getCreatePaymentDays(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 13);
		System.out.println(cell1);
		EnterInTextbox(getCreatePaymentDays(), cell1);

		explicitWaitClickable(30, getCreateDescription());
		clickWithMultipleRetry(getCreateDescription(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 14);
		System.out.println(cell2);
		EnterInTextbox(getCreateDescription(), cell2);

		explicitWaitClickable(30, getCreate_item_name());
		clickWithMultipleRetry(getCreate_item_name(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 15);
		System.out.println(cell3);
		EnterInTextbox(getCreate_item_name(), cell3);

		explicitWaitClickable(30, getCreate_item_quantity());
		clickWithMultipleRetry(getCreate_item_quantity(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 16);
		System.out.println(cell4);
		EnterInTextbox(getCreate_item_quantity(), cell4);

		explicitWaitClickable(30, getCreate_item_rate());
		clickWithMultipleRetry(getCreate_item_rate(), 10, 1000);
		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 17);
		System.out.println(cell5);
		EnterInTextbox(getCreate_item_rate(), cell5);

		explicitWaitClickable(30, getCreate_item_tax());
		clickWithMultipleRetry(getCreate_item_tax(), 10, 1000);
		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 18);
		System.out.println(cell6);
		EnterInTextbox(getCreate_item_tax(), cell6);

		explicitWaitClickable(30, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

	}

	public void VerifyPurchaseOrderIsCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Purchase order created successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void CreatesNewPayment() throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSidepaymentAcc());
		clickWithMultipleRetry(getSidepaymentAcc(), 10, 1000);

		explicitWaitClickable(30, getCreateNewBtn2());
		clickWithMultipleRetry(getCreateNewBtn2(), 10, 1000);

		explicitWaitClickable(30, getPartyName());
		clickWithMultipleRetry(getPartyName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 19);
		System.out.println(cell);
		EnterInTextbox(getPartyName(), cell);

		explicitWaitClickable(30, getInvoiceNumber());
		clickWithMultipleRetry(getInvoiceNumber(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 20);
		System.out.println(cell1);
		EnterInTextbox(getInvoiceNumber(), cell1);

		explicitWaitClickable(30, getVendorCategory());
		clickWithMultipleRetry(getVendorCategory(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 21);
		System.out.println(cell2);
		selectDdnByText(getVendorCategory(), cell2);

		explicitWaitClickable(30, getPaymentAmount());
		clickWithMultipleRetry(getPaymentAmount(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 22);
		System.out.println(cell3);
		EnterInTextbox(getPaymentAmount(), cell3);

		explicitWaitClickable(30, getPaymentDescription());
		clickWithMultipleRetry(getPaymentDescription(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 23);
		System.out.println(cell4);
		EnterInTextbox(getPaymentDescription(), cell4);

		explicitWaitClickable(30, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

	}

	public void VerifyPaymentIsCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Expense Created Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void CreatesNewReceipt() throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSidereceiptAcc());
		clickWithMultipleRetry(getSidereceiptAcc(), 10, 1000);

		explicitWaitClickable(30, getCreateNewBtn2());
		clickWithMultipleRetry(getCreateNewBtn2(), 10, 1000);

		explicitWaitClickable(30, getIncomePartyName());
		clickWithMultipleRetry(getIncomePartyName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 19);
		System.out.println(cell);
		EnterInTextbox(getIncomePartyName(), cell);

		explicitWaitClickable(30, getIncomeInvoiceNum());
		clickWithMultipleRetry(getIncomeInvoiceNum(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 20);
		System.out.println(cell1);
		EnterInTextbox(getIncomeInvoiceNum(), cell1);

		explicitWaitClickable(30, getVendorCategory());
		clickWithMultipleRetry(getVendorCategory(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 24);
		System.out.println(cell2);
		selectDdnByText(getVendorCategory(), cell2);

		explicitWaitClickable(30, getIncomeAmount());
		clickWithMultipleRetry(getIncomeAmount(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 22);
		System.out.println(cell3);
		EnterInTextbox(getIncomeAmount(), cell3);

		explicitWaitClickable(30, getIncomeLongText());
		clickWithMultipleRetry(getIncomeLongText(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 23);
		System.out.println(cell4);
		EnterInTextbox(getIncomeLongText(), cell4);

		explicitWaitClickable(30, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

	}

	public void VerifyReceiptIsCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Receipt Created Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdatesTheReceiptDetails()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		/**
		 * Update the Receipt Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".edit_modal_content"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement editButton = getTable().findElement(By.cssSelector(".edit_modal_content"));
					explicitWaitClickable(10, editButton);
					clickWithRetry(editButton);
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getEdit_party_name());
		clickWithMultipleRetry(getEdit_party_name(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 23);
		System.out.println(cell4);
		EnterInTextbox(getEdit_party_name(), cell4);

		explicitWaitClickable(30, getUpdateBtn());
		clickWithMultipleRetry(getUpdateBtn(), 10, 1000);

	}

	public void VerifyReceiptDetailsIsUpdated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Receipt Updated Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeletesAReceipt() throws InterruptedException {

		/**
		 * Delete the Receipt Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".remove_ReceiptIncomeModal"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement deleteButton = getTable().findElement(By.cssSelector(".remove_ReceiptIncomeModal"));
					explicitWaitClickable(10, deleteButton);
					clickWithRetry(deleteButton);

					explicitWaitClickable(10, getConfirmDeleteBtn());
					clickWithRetry(getConfirmDeleteBtn());

				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void VerifyReceiptDetailsIsDeleted() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Receipt Deleted Successfully.", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdatesThePaymentDetails()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSidepaymentAcc());
		clickWithMultipleRetry(getSidepaymentAcc(), 10, 1000);

		/**
		 * Update the Payment Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".edit_modal_content"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement editButton = getTable().findElement(By.cssSelector(".edit_modal_content"));
					explicitWaitClickable(10, editButton);
					clickWithRetry(editButton);
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getEdit_party_name());
		clickWithMultipleRetry(getEdit_party_name(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 23);
		System.out.println(cell4);
		EnterInTextbox(getEdit_party_name(), cell4);

		explicitWaitClickable(30, getUpdateBtn());
		clickWithMultipleRetry(getUpdateBtn(), 10, 1000);

	}

	public void VerifyPaymentDetailsIsUpdated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Expense Updated Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeletePayment() throws InterruptedException {

		/**
		 * Delete the Payment Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".remove_paymentExpenseModal"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement deleteButton = getTable().findElement(By.cssSelector(".remove_paymentExpenseModal"));
					explicitWaitClickable(10, deleteButton);
					clickWithRetry(deleteButton);

					explicitWaitClickable(10, getConfirmDeleteBtn());
					clickWithRetry(getConfirmDeleteBtn());
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void VerifyPaymentDetailsIsDeleted() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Expense Deleted Successfully.", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateThePurchaseOrderDetail()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSidepurchaseAcc());
		clickWithMultipleRetry(getSidepurchaseAcc(), 10, 1000);

		/**
		 * Update the Purchase Order Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".edit_modal_content"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement editButton = getTable().findElement(By.cssSelector(".edit_modal_content"));
					explicitWaitClickable(10, editButton);
					clickWithRetry(editButton);
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getEdit_PO_description());
		clickWithMultipleRetry(getEdit_PO_description(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 23);
		System.out.println(cell4);
		EnterInTextbox(getEdit_PO_description(), cell4);

		explicitWaitClickable(30, getUpdateBtn());
		clickWithMultipleRetry(getUpdateBtn(), 10, 1000);

	}

	public void VerifyPurchaseOrderIsUpdated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Purchase order updated successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeleteAPurchaseOrder() throws InterruptedException {

		/**
		 * Delete the Purchase Order Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".remove_purchaseOrderModal"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement deleteButton = getTable().findElement(By.cssSelector(".remove_purchaseOrderModal"));
					explicitWaitClickable(10, deleteButton);
					clickWithRetry(deleteButton);

					explicitWaitClickable(10, getDeleteBtn());
					clickWithRetry(getDeleteBtn());
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void VerifyPurchaseOrderIsDeleted() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Purchase order has been deleted successfully!", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateTheVendorDetails()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getSideVendorAcc());
		clickWithMultipleRetry(getSideVendorAcc(), 10, 1000);

		/**
		 * Update the Vendor Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable()
						.findElements(By.cssSelector(".edit_text.edit_year.edit_modal_content"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement editButton = getTable()
							.findElement(By.cssSelector(".edit_text.edit_year.edit_modal_content"));
					explicitWaitClickable(10, editButton);
					clickWithRetry(editButton);
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getEdit_vendor_name());
		clickWithMultipleRetry(getEdit_vendor_name(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 23);
		System.out.println(cell4);
		EnterInTextbox(getEdit_vendor_name(), cell4);

		explicitWaitClickable(30, getUpdateBtn());
		clickWithMultipleRetry(getUpdateBtn(), 10, 1000);

	}

	public void verifyVendorIsUpdated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Vendor Updated Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeleteTheVendor() throws InterruptedException {

		/**
		 * Delete the Vendor Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".delete_text"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement deleteButton = getTable().findElement(By.cssSelector(".delete_text"));
					explicitWaitClickable(10, deleteButton);
					clickWithRetry(deleteButton);

					explicitWaitClickable(10, getConfirmDeleteBtn());
					clickWithRetry(getConfirmDeleteBtn());
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void verifyVendorIsDeleted() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Vendor Deleted Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void CreateNewAsset() throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getAssetMenu());
		clickWithMultipleRetry(getAssetMenu(), 10, 1000);
		explicitWaitClickable(30, getManageAsset());
		clickWithMultipleRetry(getManageAsset(), 10, 1000);
		explicitWaitClickable(30, getCreateNewBtn3());
		clickWithMultipleRetry(getCreateNewBtn3(), 10, 1000);

		/*
		 * Upload Asset Image
		 */

		File uploadFile = new File(getProjectPath() + getPropertyFileValue("bookImg"));
		WebElement labelElement = driver.findElement(By.cssSelector(".uploadImageField.assetImageField"));
		WebElement fileInput = labelElement.findElement(By.xpath("//input[@type='file' and @id='assetImage']"));
		fileInput.sendKeys(uploadFile.getAbsolutePath());

		explicitWaitClickable(30, getAssetName());
		clickWithMultipleRetry(getAssetName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 25);
		System.out.println(cell);
		EnterInTextbox(getAssetName(), cell);

		explicitWaitClickable(30, getAssetValue());
		clickWithMultipleRetry(getAssetValue(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 26);
		System.out.println(cell1);
		EnterInTextbox(getAssetValue(), cell1);

		explicitWaitClickable(30, getAssetType());
		clickWithMultipleRetry(getAssetType(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 27);
		System.out.println(cell2);
		EnterInTextbox(getAssetType(), cell2);

		explicitWaitClickable(30, getAssetLocation());
		clickWithMultipleRetry(getAssetLocation(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 28);
		System.out.println(cell3);
		EnterInTextbox(getAssetLocation(), cell3);

		explicitWaitClickable(30, getAssetComment());
		clickWithMultipleRetry(getAssetComment(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 29);
		System.out.println(cell4);
		EnterInTextbox(getAssetComment(), cell4);

		explicitWaitClickable(30, getPoNumber());
		clickWithMultipleRetry(getPoNumber(), 10, 1000);
		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 30);
		System.out.println(cell5);
		EnterInTextbox(getPoNumber(), cell5);

		explicitWaitClickable(30, getGrnNumber());
		clickWithMultipleRetry(getGrnNumber(), 10, 1000);
		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 31);
		System.out.println(cell6);
		EnterInTextbox(getGrnNumber(), cell6);

		explicitWaitClickable(30, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

	}

	public void VerifyAssetIsCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Asset Created Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateTheAsseet()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		/**
		 * Update the Asset Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".edit_text.edit"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement editButton = getTable().findElement(By.cssSelector(".edit_text.edit"));
					explicitWaitClickable(10, editButton);
					clickWithRetry(editButton);
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

		explicitWaitClickable(30, getEditAssetName());
		clickWithMultipleRetry(getEditAssetName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("Accounting&Asset"), rowNum, 31);
		System.out.println(cell);
		EnterInTextbox(getEditAssetName(), cell);

		explicitWaitClickable(30, getUpdateBtn());
		clickWithMultipleRetry(getUpdateBtn(), 10, 1000);

	}

	public void VerifyAssetIsUpdated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Asset Updated Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeleteTheAsset() throws InterruptedException {

		/**
		 * Delete the Vendor Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".delete_text.delete"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement deleteButton = getTable().findElement(By.cssSelector(".delete_text.delete"));
					explicitWaitClickable(10, deleteButton);
					clickWithRetry(deleteButton);

					explicitWaitClickable(10, getConfirmDeleteBtn());
					clickWithRetry(getConfirmDeleteBtn());
				}

				break;

			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void VerifyAssetIsDeleted() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Asset Deleted Successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getSuccessOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

}
