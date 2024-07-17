package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.google.api.client.util.Key;
import com.opencsv.exceptions.CsvException;

public class ManageTransportPage extends BaseClass {

	public ManageTransportPage() {
		PageFactory.initElements(driver, this);
	}

	int rowNum = 1;

	/*
	 * 1. Creates New Vehicles Manually And Using CSV File
	 */

	@FindBy(css = "#fleetManagementSection")
	private WebElement TransportManagementMenuBar;
	@FindBy(xpath = "//span[contains(.,'Manage Transport')]")
	private WebElement ManageTransportMenuBar;
	@FindBy(id = "sideVisitors")
	private WebElement VisitorMenuBar;

	public WebElement getVisitorMenuBar() {
		return VisitorMenuBar;
	}

	public void setVisitorMenuBar(WebElement visitorMenuBar) {
		VisitorMenuBar = visitorMenuBar;
	}

	public WebElement getTransportManagementMenuBar() {
		return TransportManagementMenuBar;
	}

	public void setTransportManagementMenuBar(WebElement transportManagementMenuBar) {
		TransportManagementMenuBar = transportManagementMenuBar;
	}

	public WebElement getManageTransportMenuBar() {
		return ManageTransportMenuBar;
	}

	public void setManageTransportMenuBar(WebElement manageTransportMenuBar) {
		ManageTransportMenuBar = manageTransportMenuBar;
	}

	@FindBy(css = ".vehicle_add_validation")
	private WebElement btnAddVehicles;
	@FindBy(css = ".vehicle_input #name16")
	private WebElement txtVehicleID;
	@FindBy(id = "name17")
	private WebElement txtVehicleRegNum;
	@FindBy(id = "name18")
	private WebElement txtVehicleBoughtDate;
	@FindBy(css = ".manufacturer")
	private WebElement ddnManufacturerName;
	@FindBy(id = "name20")
	private WebElement txtVehicleModel;
	@FindBy(id = "name21")
	private WebElement txtVehicleGPSID;
	@FindBy(id = "name22")
	private WebElement txtVehicleCapacity;
	@FindBy(css = ".vehicle_input:nth-child(1) #name22")
	private WebElement txtVehicleFCNoNum;
	@FindBy(id = "name23")
	private WebElement txtFcStartDate;
	@FindBy(id = "name24")
	private WebElement txtFcEndDate;
	@FindBy(id = "name25")
	private WebElement txtTotalFc;
	@FindBy(id = "name26")
	private WebElement txtInsuranceNum;
	@FindBy(id = "name27")
	private WebElement txtInsuranceStartDate;
	@FindBy(id = "name28")
	private WebElement txtInsuranceEndDate;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[1]")
	private WebElement AtcFCDoc;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[2]")
	private WebElement AtcInsuranceDoc;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[3]")
	private WebElement AtcRCDoc;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[4]")
	private WebElement AtcPollutionDocument;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[5]")
	private WebElement AtcVehicleImage1;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[6]")
	private WebElement AtcVehicleImage2;
	@FindBy(xpath = "(//p[@id='csv_file_name'])[7]")
	private WebElement AtcVehicleImage3;

	public WebElement getBtnAddVehicles() {
		return btnAddVehicles;
	}

	public void setBtnAddVehicles(WebElement btnAddVehicles) {
		this.btnAddVehicles = btnAddVehicles;
	}

	public WebElement getTxtVehicleID() {
		return txtVehicleID;
	}

	public void setTxtVehicleID(WebElement txtVehicleID) {
		this.txtVehicleID = txtVehicleID;
	}

	public WebElement getTxtVehicleRegNum() {
		return txtVehicleRegNum;
	}

	public void setTxtVehicleRegNum(WebElement txtVehicleRegNum) {
		this.txtVehicleRegNum = txtVehicleRegNum;
	}

	public WebElement getTxtVehicleBoughtDate() {
		return txtVehicleBoughtDate;
	}

	public void setTxtVehicleBoughtDate(WebElement txtVehicleBoughtDate) {
		this.txtVehicleBoughtDate = txtVehicleBoughtDate;
	}

	public WebElement getDdnManufacturerName() {
		return ddnManufacturerName;
	}

	public void setDdnManufacturerName(WebElement ddnManufacturerName) {
		this.ddnManufacturerName = ddnManufacturerName;
	}

	public WebElement getTxtVehicleModel() {
		return txtVehicleModel;
	}

	public void setTxtVehicleModel(WebElement txtVehicleModel) {
		this.txtVehicleModel = txtVehicleModel;
	}

	public WebElement getTxtVehicleGPSID() {
		return txtVehicleGPSID;
	}

	public void setTxtVehicleGPSID(WebElement txtVehicleGPSID) {
		this.txtVehicleGPSID = txtVehicleGPSID;
	}

	public WebElement getTxtVehicleCapacity() {
		return txtVehicleCapacity;
	}

	public void setTxtVehicleCapacity(WebElement txtVehicleCapacity) {
		this.txtVehicleCapacity = txtVehicleCapacity;
	}

	public WebElement getTxtVehicleFCNoNum() {
		return txtVehicleFCNoNum;
	}

	public void setTxtVehicleFCNoNum(WebElement txtVehicleFCNoNum) {
		this.txtVehicleFCNoNum = txtVehicleFCNoNum;
	}

	public WebElement getTxtFcStartDate() {
		return txtFcStartDate;
	}

	public void setTxtFcStartDate(WebElement txtFcStartDate) {
		this.txtFcStartDate = txtFcStartDate;
	}

	public WebElement getTxtFcEndDate() {
		return txtFcEndDate;
	}

	public void setTxtFcEndDate(WebElement txtFcEndDate) {
		this.txtFcEndDate = txtFcEndDate;
	}

	public WebElement getTxtTotalFc() {
		return txtTotalFc;
	}

	public void setTxtTotalFc(WebElement txtTotalFc) {
		this.txtTotalFc = txtTotalFc;
	}

	public WebElement getTxtInsuranceNum() {
		return txtInsuranceNum;
	}

	public void setTxtInsuranceNum(WebElement txtInsuranceNum) {
		this.txtInsuranceNum = txtInsuranceNum;
	}

	public WebElement getTxtInsuranceStartDate() {
		return txtInsuranceStartDate;
	}

	public void setTxtInsuranceStartDate(WebElement txtInsuranceStartDate) {
		this.txtInsuranceStartDate = txtInsuranceStartDate;
	}

	public WebElement getTxtInsuranceEndDate() {
		return txtInsuranceEndDate;
	}

	public void setTxtInsuranceEndDate(WebElement txtInsuranceEndDate) {
		this.txtInsuranceEndDate = txtInsuranceEndDate;
	}

	public WebElement getAtcFCDoc() {
		return AtcFCDoc;
	}

	public void setAtcFCDoc(WebElement atcFCDoc) {
		AtcFCDoc = atcFCDoc;
	}

	public WebElement getAtcInsuranceDoc() {
		return AtcInsuranceDoc;
	}

	public void setAtcInsuranceDoc(WebElement atcInsuranceDoc) {
		AtcInsuranceDoc = atcInsuranceDoc;
	}

	public WebElement getAtcRCDoc() {
		return AtcRCDoc;
	}

	public void setAtcRCDoc(WebElement atcRCDoc) {
		AtcRCDoc = atcRCDoc;
	}

	public WebElement getAtcPollutionDocument() {
		return AtcPollutionDocument;
	}

	public void setAtcPollutionDocument(WebElement atcPollutionDocument) {
		AtcPollutionDocument = atcPollutionDocument;
	}

	public WebElement getAtcVehicleImage1() {
		return AtcVehicleImage1;
	}

	public void setAtcVehicleImage1(WebElement atcVehicleImage1) {
		AtcVehicleImage1 = atcVehicleImage1;
	}

	public WebElement getAtcVehicleImage2() {
		return AtcVehicleImage2;
	}

	public void setAtcVehicleImage2(WebElement atcVehicleImage2) {
		AtcVehicleImage2 = atcVehicleImage2;
	}

	public WebElement getAtcVehicleImage3() {
		return AtcVehicleImage3;
	}

	public void setAtcVehicleImage3(WebElement atcVehicleImage3) {
		AtcVehicleImage3 = atcVehicleImage3;
	}

	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement successPopup;
	@FindBy(css = ".swal-text")
	private WebElement successPopupText;

	public WebElement getSuccessPopupText() {
		return successPopupText;
	}

	public void setSuccessPopupText(WebElement successPopupText) {
		this.successPopupText = successPopupText;
	}

	public WebElement getSuccessPopup() {
		return successPopup;
	}

	public void setSuccessPopup(WebElement successPopup) {
		this.successPopup = successPopup;
	}

	/*
	 * Bulk upload Vehicle using Csv
	 */

	@FindBy(xpath = "//button[contains(.,'Uplode CSV')]")
	private WebElement btnUploadCSV;
	@FindBy(id = "csv_view_add")
	private WebElement UploadCSV;
	@FindBy(xpath = "//button[contains(.,'Submit')]")
	private WebElement btnSubmitCSV;

	public WebElement getUploadCSV() {
		return UploadCSV;
	}

	public void setUploadCSV(WebElement uploadCSV) {
		UploadCSV = uploadCSV;
	}

	public WebElement getBtnSubmitCSV() {
		return btnSubmitCSV;
	}

	public void setBtnSubmitCSV(WebElement btnSubmitCSV) {
		this.btnSubmitCSV = btnSubmitCSV;
	}

	public WebElement getBtnUploadCSV() {
		return btnUploadCSV;
	}

	public void setBtnUploadCSV(WebElement btnUploadCSV) {
		this.btnUploadCSV = btnUploadCSV;
	}

	/*
	 * 2. Verify Vehicle Is Created
	 */

	/*
	 * 3. Create new Route
	 */

	@FindBy(xpath = "//button[contains(.,'Routes')]")
	private WebElement RouteTab;
	@FindBy(xpath = "//button[contains(.,'Add Route')]")
	private WebElement btnAddRoute;
	@FindBy(css = ".route_name")
	private WebElement txtRouteName;
	@FindBy(css = ".vehicle_list_dropdown")
	private WebElement ddnVehicleName;
	@FindBy(css = ".trip_start_time")
	private WebElement datepickerStartTime;
	@FindBy(xpath = "//input[@id='checkbox_1']")
	private WebElement radiobtnPickup;
	@FindBy(css = ".starting_point")
	private WebElement txtStartingPoint;
	@FindBy(css = ".ending_point")
	private WebElement txtEndingPoint;
	@FindBy(css = ".driver_name")
	private WebElement ddnDriverName;
	@FindBy(css = ".caretaker")
	private WebElement ddnCaretakerName;
	@FindBy(xpath = "//input[@name='route_fee_type'and @id='checkbox_4']")
	private WebElement radiobtnFeeType;
	@FindBy(css = ".add_route_fixed_fee")
	private WebElement txtFeeAmount;
	@FindBy(css = ".route_location")
	private WebElement txtRouteLoc;
	@FindBy(css = ".arriving_time")
	private WebElement txtRouteTime;
	@FindBy(css = ".fa-map-marker")
	private WebElement GPSPicker;
	@FindBy(xpath = "//button[contains(.,'Submit')]")
	private WebElement submitBtn;
	@FindBy(xpath = "(//button[contains(.,'Add')])[11]")
	private WebElement addBtn;

	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement successOKBtn;
	@FindBy(css = ".swal-text")
	private WebElement successText;

	public WebElement getSuccessOKBtn() {
		return successOKBtn;
	}

	public void setSuccessOKBtn(WebElement successOKBtn) {
		this.successOKBtn = successOKBtn;
	}

	public WebElement getSuccessText() {
		return successText;
	}

	public void setSuccessText(WebElement successText) {
		this.successText = successText;
	}

	public WebElement getGPSPicker() {
		return GPSPicker;
	}

	public void setGPSPicker(WebElement gPSPicker) {
		GPSPicker = gPSPicker;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(WebElement addBtn) {
		this.addBtn = addBtn;
	}

	public WebElement getRouteTab() {
		return RouteTab;
	}

	public void setRouteTab(WebElement routeTab) {
		RouteTab = routeTab;
	}

	public WebElement getBtnAddRoute() {
		return btnAddRoute;
	}

	public void setBtnAddRoute(WebElement btnAddRoute) {
		this.btnAddRoute = btnAddRoute;
	}

	public WebElement getTxtRouteName() {
		return txtRouteName;
	}

	public void setTxtRouteName(WebElement txtRouteName) {
		this.txtRouteName = txtRouteName;
	}

	public WebElement getDdnVehicleName() {
		return ddnVehicleName;
	}

	public void setDdnVehicleName(WebElement ddnVehicleName) {
		this.ddnVehicleName = ddnVehicleName;
	}

	public WebElement getDatepickerStartTime() {
		return datepickerStartTime;
	}

	public void setDatepickerStartTime(WebElement datepickerStartTime) {
		this.datepickerStartTime = datepickerStartTime;
	}

	public WebElement getRadiobtnPickup() {
		return radiobtnPickup;
	}

	public void setRadiobtnPickup(WebElement radiobtnPickup) {
		this.radiobtnPickup = radiobtnPickup;
	}

	public WebElement getTxtStartingPoint() {
		return txtStartingPoint;
	}

	public void setTxtStartingPoint(WebElement txtStartingPoint) {
		this.txtStartingPoint = txtStartingPoint;
	}

	public WebElement getTxtEndingPoint() {
		return txtEndingPoint;
	}

	public void setTxtEndingPoint(WebElement txtEndingPoint) {
		this.txtEndingPoint = txtEndingPoint;
	}

	public WebElement getDdnDriverName() {
		return ddnDriverName;
	}

	public void setDdnDriverName(WebElement ddnDriverName) {
		this.ddnDriverName = ddnDriverName;
	}

	public WebElement getDdnCaretakerName() {
		return ddnCaretakerName;
	}

	public void setDdnCaretakerName(WebElement ddnCaretakerName) {
		this.ddnCaretakerName = ddnCaretakerName;
	}

	public WebElement getRadiobtnFeeType() {
		return radiobtnFeeType;
	}

	public void setRadiobtnFeeType(WebElement radiobtnFeeType) {
		this.radiobtnFeeType = radiobtnFeeType;
	}

	public WebElement getTxtFeeAmount() {
		return txtFeeAmount;
	}

	public void setTxtFeeAmount(WebElement txtFeeAmount) {
		this.txtFeeAmount = txtFeeAmount;
	}

	public WebElement getTxtRouteLoc() {
		return txtRouteLoc;
	}

	public void setTxtRouteLoc(WebElement txtRouteLoc) {
		this.txtRouteLoc = txtRouteLoc;
	}

	public WebElement getTxtRouteTime() {
		return txtRouteTime;
	}

	public void setTxtRouteTime(WebElement txtRouteTime) {
		this.txtRouteTime = txtRouteTime;
	}

	/*
	 * 4. Student Mapping
	 */

//	@FindBy(xpath = "//button[contains(.,'Student Mapping')]")
//	private WebElement stdMappingTab;
//	@FindBy(xpath = "//a[contains(text(),'Assign Student')]")
//	private WebElement assignStudentHypLink;
//	@FindBy(id = "list1")
//	private WebElement stdMappingTab;
//	@FindBy(xpath = "//a[contains(text(),'Assign Student')]")
//	private WebElement assignStudentHypLink;
//	@FindBy(xpath = "//button[contains(.,'Student Mapping')]")
//	private WebElement stdMappingTab;
//	@FindBy(xpath = "//a[contains(text(),'Assign Student')]")
//	private WebElement assignStudentHypLink;
	
	
	
	
	/**
	 * Method Start Here
	 * 
	 * @throws InterruptedException
	 * @throws CsvException
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws AWTException
	 */

	public void CreateNewVehicle()
			throws InterruptedException, FileNotFoundException, IOException, CsvException, AWTException {

		mouseOverActionMoveToElement(getVisitorMenuBar());

		explicitWaitClickable(20, getTransportManagementMenuBar());
		clickWithMultipleRetry(getTransportManagementMenuBar(), 10, 1000);
		explicitWaitClickable(20, getManageTransportMenuBar());
		clickWithMultipleRetry(getManageTransportMenuBar(), 10, 1000);

		explicitWaitClickable(20, getBtnAddVehicles());
		clickWithMultipleRetry(getBtnAddVehicles(), 10, 1000);

		explicitWaitClickable(20, getTxtVehicleID());
		clickWithMultipleRetry(getTxtVehicleID(), 10, 1000);
		String cell0 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 0);
		System.out.println(cell0);
		EnterInTextbox(getTxtVehicleID(), cell0);

		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 1);
		System.out.println(cell1);
		EnterInTextbox(getTxtVehicleRegNum(), cell1);

		/**
		 * Handling Vehicle Bought Date Date-Picker
		 */

		String desiredDate = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 2);
		String desiredMonth = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 3);
		String desiredYear = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 4);
		System.out.println(desiredDate + desiredMonth + desiredYear);
		selectDate(desiredDate, desiredMonth, desiredYear, getTxtVehicleBoughtDate());

		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 5);
		System.out.println(cell5);
		selectDdnByText(getDdnManufacturerName(), cell5);

		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 6);
		System.out.println(cell6);
		EnterInTextbox(getTxtVehicleModel(), cell6);

		String cell7 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 7);
		System.out.println(cell7);
		EnterInTextbox(getTxtVehicleGPSID(), cell7);

		String cell8 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 8);
		System.out.println(cell8);
		EnterInTextbox(getTxtVehicleCapacity(), cell8);

		explicitWaitClickable(20, getTxtVehicleFCNoNum());
		clickWithMultipleRetry(getTxtVehicleFCNoNum(), 10, 1000);
		String cell9 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 9);
		System.out.println(cell9);
		EnterInTextbox(getTxtVehicleFCNoNum(), cell9);

		String desiredDate2 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 10);
		String desiredMonth2 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 11);
		String desiredYear2 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 12);
		System.out.println(desiredDate2 + desiredMonth2 + desiredYear2);
		selectDate(desiredDate2, desiredMonth2, desiredYear2, getTxtFcStartDate());

		String desiredDate3 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 13);
		String desiredMonth3 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 14);
		String desiredYear3 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 15);
		System.out.println(desiredDate3 + desiredMonth3 + desiredYear3);
		selectDate(desiredDate3, desiredMonth3, desiredYear3, getTxtFcEndDate());

		String cell16 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 16);
		System.out.println(cell16);
		EnterInTextbox(getTxtTotalFc(), cell16);

		String cell17 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 17);
		System.out.println(cell17);
		EnterInTextbox(getTxtInsuranceNum(), cell17);

		String desiredDate4 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 18);
		String desiredMonth4 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 19);
		String desiredYear4 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 20);
		System.out.println(desiredDate4 + desiredMonth4 + desiredYear4);
		selectDate(desiredDate4, desiredMonth4, desiredYear4, getTxtInsuranceStartDate());

		String desiredDate5 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 21);
		String desiredMonth5 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 22);
		String desiredYear5 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 23);
		System.out.println(desiredDate5 + desiredMonth5 + desiredYear5);
		selectDate(desiredDate5, desiredMonth5, desiredYear5, getTxtInsuranceEndDate());

		/*
		 * Upload FC Document
		 */

//		explicitWaitClickable(20, getAtcFCDoc());
//		clickWithRetry(getAtcFCDoc());
//		String cell24 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 24);
//		System.out.println(cell24);
//
//		robot.delay(1500);
//
//		openSearchTabRobot(robot);
//		robot.delay(1000);
//
//		StringSelection stringSelection1 = new StringSelection(cell24);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
//
//		pasteTextRobot(robot);
//
//		robot.delay(1000);
//
//		EnterRobot(robot);
//
//		robot.delay(1000);
//
//		EnterRobot(robot);

		File uploadFile = new File(getProjectPath() + getPropertyFileValue("fcDocPDF"));

		WebElement labelElement = driver.findElement(By.className("upload_filed"));

		WebElement fileInput = labelElement.findElement(By.xpath("//input[@type='file' and @id='fc_doc']"));

//		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));

		fileInput.sendKeys(uploadFile.getAbsolutePath());

		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload Insurance Document
		 */

		File uploadFile1 = new File(getProjectPath() + getPropertyFileValue("insuranceDocPDF"));

		WebElement labelElement1 = driver.findElement(By.className("upload_filed"));
		WebElement fileInput1 = labelElement1.findElement(By.xpath("//input[@type='file' and @id='insurance_doc']"));

		fileInput1.sendKeys(uploadFile1.getAbsolutePath());

//		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload RC Document
		 */

		File uploadFile2 = new File(getProjectPath() + getPropertyFileValue("rcDocPDF"));

		WebElement labelElement2 = driver.findElement(By.className("upload_filed"));
		WebElement fileInput2 = labelElement2.findElement(By.xpath("//input[@type='file' and @id='rc_doc']"));

		fileInput2.sendKeys(uploadFile2.getAbsolutePath());

		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload Pollution Document
		 */

		File uploadFile3 = new File(getProjectPath() + getPropertyFileValue("pollutionDocPdf"));

		WebElement labelElement3 = driver.findElement(By.className("upload_filed"));
		WebElement fileInput3 = labelElement3.findElement(By.xpath("//input[@type='file' and @id='poll_cert']"));

		fileInput3.sendKeys(uploadFile3.getAbsolutePath());

//		explicitWaitClickable(20, getSuccessPopup());
		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);

		/*
		 * Upload Vehicle Image 1
		 */

		File uploadFile4 = new File(getProjectPath() + getPropertyFileValue("vehicleImgDoc"));

		WebElement labelElement4 = driver.findElement(By.className("upload_filed"));
		WebElement fileInput4 = labelElement4.findElement(By.xpath("//input[@type='file' and @id='vehicle_1']"));

		fileInput4.sendKeys(uploadFile4.getAbsolutePath());

		/*
		 * Upload Vehicle Image 2
		 */

		File uploadFile5 = new File(getProjectPath() + getPropertyFileValue("vehicleImgDoc"));

		WebElement labelElement5 = driver.findElement(By.className("upload_filed"));
		WebElement fileInput5 = labelElement5.findElement(By.xpath("//input[@type='file' and @id='vehicle_2']"));

		fileInput5.sendKeys(uploadFile5.getAbsolutePath());

		/*
		 * Upload Vehicle Image 3
		 */

		File uploadFile6 = new File(getProjectPath() + getPropertyFileValue("vehicleImgDoc"));

		WebElement labelElement6 = driver.findElement(By.className("upload_filed"));
		WebElement fileInput6 = labelElement6.findElement(By.xpath("//input[@type='file' and @id='vehicle_2']"));

		fileInput6.sendKeys(uploadFile6.getAbsolutePath());

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				WebElement AddVehicleBtn = driver.findElement(By.cssSelector(".vehicle_add"));
				AddVehicleBtn.click();

				break;
			} catch (Exception e) {
				System.out.println("Handling Exception - Attempt " + attempt);
				Thread.sleep(500);

			}
		}

	}

	public void VerifyVehicleCreated() {

		explicitWaitClickable(10, getSuccessPopup());

		String successPopupMsz = getText(getSuccessPopupText());
		System.out.println(successPopupMsz);
		Assert.assertEquals("Vehicle created successfully", successPopupMsz);
		HighlightOutput("Assertion Passed Success Popup Message is " + successPopupMsz);

		clickWithMultipleRetry(getSuccessPopup(), 10, 1000);
	}

	public void CreateNewRoute() throws FileNotFoundException, IOException, CsvException, AWTException {

		mouseOverActionMoveToElement(getVisitorMenuBar());

		explicitWaitClickable(20, getTransportManagementMenuBar());
		clickWithMultipleRetry(getTransportManagementMenuBar(), 10, 1000);
		explicitWaitClickable(20, getManageTransportMenuBar());
		clickWithMultipleRetry(getManageTransportMenuBar(), 10, 1000);

		explicitWaitClickable(20, getRouteTab());
		clickWithMultipleRetry(getRouteTab(), 10, 1000);

		explicitWaitClickable(20, getBtnAddRoute());
		clickWithMultipleRetry(getBtnAddRoute(), 10, 1000);

		explicitWaitClickable(20, getTxtRouteName());
		clickWithMultipleRetry(getTxtRouteName(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 32);
		System.out.println(cell1);
		EnterInTextbox(getTxtRouteName(), cell1);

		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 33);
		System.out.println(cell2);
		selectDdnByText(getDdnVehicleName(), cell2);

		/*
		 * Handling Start Time Picker
		 */

		explicitWaitClickable(20, getDatepickerStartTime());
		clickWithMultipleRetry(getDatepickerStartTime(), 10, 1000);
		getDatepickerStartTime().sendKeys(Keys.SPACE, Keys.DELETE);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 34);
		System.out.println(cell3);
		EnterInTextbox(getDatepickerStartTime(), cell3);

		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 35);
		System.out.println(cell4);

		explicitWaitClickable(20, getTxtStartingPoint());
		clickWithMultipleRetry(getTxtStartingPoint(), 10, 1000);
		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 36);
		System.out.println(cell5);
		EnterInTextbox(getTxtStartingPoint(), cell5);

		explicitWaitClickable(20, getTxtEndingPoint());
		clickWithMultipleRetry(getTxtEndingPoint(), 10, 1000);
		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 37);
		System.out.println(cell6);
		EnterInTextbox(getTxtEndingPoint(), cell6);

		String cell7 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 38);
		System.out.println(cell7);
		selectDdnByText(getDdnDriverName(), cell7);

		String cell8 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 39);
		System.out.println(cell8);
		selectDdnByText(getDdnCaretakerName(), cell8);

		String cell9 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 40);
		System.out.println(cell9);

		explicitWaitClickable(20, getTxtFeeAmount());
		clickWithMultipleRetry(getTxtFeeAmount(), 10, 1000);
		String cell10 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 41);
		System.out.println(cell10);
		EnterInTextbox(getTxtFeeAmount(), cell10);

		explicitWaitClickable(20, getTxtRouteLoc());
		clickWithMultipleRetry(getTxtRouteLoc(), 10, 1000);
		String cell11 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 42);
		System.out.println(cell11);
		EnterInTextbox(getTxtRouteLoc(), cell11);

		explicitWaitClickable(20, getTxtRouteTime());
		clickWithMultipleRetry(getTxtRouteTime(), 10, 1000);
		getTxtRouteTime().sendKeys(Keys.SPACE, Keys.DELETE);
		String cell12 = readSpecificCell(getProjectPath() + getPropertyFileValue("manageTransport"), rowNum, 43);
		System.out.println(cell12);
		EnterInTextbox(getTxtRouteTime(), cell12);

		explicitWaitClickable(20, getGPSPicker());
		clickWithMultipleRetry(getGPSPicker(), 10, 1000);

		explicitWaitClickable(20, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

		explicitWaitClickable(20, getAddBtn());
		clickWithMultipleRetry(getAddBtn(), 10, 1000);

	}

	public void VerifyVehicleRouteCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getSuccessOKBtn());

				String successPopupMsz = getText(getSuccessText());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Vehicle route added successfully", successPopupMsz);
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
