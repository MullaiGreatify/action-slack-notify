package com.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;
import com.opencsv.exceptions.CsvException;

public class ManageStaffPage extends BaseClass {

	int rowNum = 1;
	String teacherId;

	public ManageStaffPage() {
		PageFactory.initElements(driver, this);
		implicitwait(30);
	}
	/*
	 * 1. Creates New Teaching Staff
	 */

	@FindBy(id = "employeeManagementSection")
	private WebElement employeeManagementMenu;
	@FindBy(id = "sideTeacher")
	private WebElement teacherMenu;
	@FindBy(css = ".add_teacher_btn")
	private WebElement addTeacherBtn;
	@FindBy(id = "name")
	private WebElement teacherName;
	@FindBy(id = "date_pickers")
	private WebElement DOBDatePickers;
	@FindBy(css = ".teacher_gender_add")
	private WebElement teacherGenderDdn;
	@FindBy(css = ".teacher_id_add")
	private WebElement teacherIDTxt;
	@FindBy(css = ".teacher_email_add")
	private WebElement teacherEmailTxt;
	@FindBy(css = ".teacher_num_add")
	private WebElement teacherNumTxt;
	@FindBy(css = ".teacher_blood_grp_add")
	private WebElement teacherBloodGrpDdn;
	@FindBy(css = "label .select2-search__field")
	private WebElement subNameTxt;
	@FindBy(css = ".father_name_add")
	private WebElement fatherNameTxt;
	@FindBy(css = ".mother_name_add")
	private WebElement motherNameTxt;
	@FindBy(css = ".father_occ_add")
	private WebElement fatherOccTxt;
	@FindBy(css = ".mother_occ_add")
	private WebElement motherOccTxt;
	@FindBy(css = ".teacher_nationality_add")
	private WebElement nationalityTxt;
	@FindBy(css = ".teacher_religion_add")
	private WebElement religionTxt;
	@FindBy(css = ".teacher_caste_category_add")
	private WebElement caste_categoryDdn;
	@FindBy(css = ".lang_written_add")
	private WebElement langSpokenTxt;
	@FindBy(css = ".lang_spoken_add")
	private WebElement langWrittenTxt;
	@FindBy(css = ".teacher_address_add")
	private WebElement teacherAddressTxt;
	@FindBy(css = ".teacher_off_address_add")
	private WebElement teacherOfcAddressTxt;
	@FindBy(css = ".teacher_emer_num_add")
	private WebElement emergencyNumTxt;
	@FindBy(css = ".teacher_class_category_add")
	private WebElement class_categoryDdn;
	@FindBy(css = ".teacher_qualification_add")
	private WebElement qualificationTxt;
	@FindBy(css = ".teacher_year_of_passing_add")
	private WebElement yearOfPassingTxt;
	@FindBy(css = ".teacher_edu_marks_add")
	private WebElement eduMarksTxt;
	@FindBy(css = ".teacher_edu_university_add")
	private WebElement eduUnivTxt;
	@FindBy(css = ".teacher_ctc")
	private WebElement teacherCTC;
	@FindBy(css = ".teacher_bank_name_add")
	private WebElement bankNameTxt;
	@FindBy(css = ".teacher_branch_name_add")
	private WebElement branchNameTxt;
	@FindBy(css = ".teacher_account_number_add")
	private WebElement accountNumberTxt;

	@FindBy(css = ".teacher_ifsc_code_add")
	private WebElement ifscCodeTxt;
	@FindBy(css = ".teacher_uan_number_add")
	private WebElement uanNumTxt;
	@FindBy(css = ".teacher_epf_number_add")
	private WebElement epfNumTxt;
	@FindBy(css = ".teacher_esi_number_add")
	private WebElement esiNumTxt;
	@FindBy(xpath = "//button[contains(.,'Continue')]")
	private WebElement continueBtn;

	@FindBy(xpath = "//button[contains(.,'Submit')]")
	private WebElement submitBtn;
	@FindBy(xpath = "//button[contains(.,'OK')]")
	private WebElement OKBtn;
	@FindBy(tagName = "h6")
	private WebElement successText;

	public WebElement getSuccessText() {
		return successText;
	}

	public void setSuccessText(WebElement successText) {
		this.successText = successText;
	}

	public WebElement getOKBtn() {
		return OKBtn;
	}

	public void setOKBtn(WebElement oKBtn) {
		OKBtn = oKBtn;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public WebElement getEmployeeManagementMenu() {
		return employeeManagementMenu;
	}

	public void setEmployeeManagementMenu(WebElement employeeManagementMenu) {
		this.employeeManagementMenu = employeeManagementMenu;
	}

	public WebElement getTeacherMenu() {
		return teacherMenu;
	}

	public void setTeacherMenu(WebElement teacherMenu) {
		this.teacherMenu = teacherMenu;
	}

	public WebElement getAddTeacherBtn() {
		return addTeacherBtn;
	}

	public void setAddTeacherBtn(WebElement addTeacherBtn) {
		this.addTeacherBtn = addTeacherBtn;
	}

	public WebElement getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(WebElement teacherName) {
		this.teacherName = teacherName;
	}

	public WebElement getDOBDatePickers() {
		return DOBDatePickers;
	}

	public void setDOBDatePickers(WebElement dOBDatePickers) {
		DOBDatePickers = dOBDatePickers;
	}

	public WebElement getTeacherGenderDdn() {
		return teacherGenderDdn;
	}

	public void setTeacherGenderDdn(WebElement teacherGenderDdn) {
		this.teacherGenderDdn = teacherGenderDdn;
	}

	public WebElement getTeacherIDTxt() {
		return teacherIDTxt;
	}

	public void setTeacherIDTxt(WebElement teacherIDTxt) {
		this.teacherIDTxt = teacherIDTxt;
	}

	public WebElement getTeacherEmailTxt() {
		return teacherEmailTxt;
	}

	public void setTeacherEmailTxt(WebElement teacherEmailTxt) {
		this.teacherEmailTxt = teacherEmailTxt;
	}

	public WebElement getTeacherNumTxt() {
		return teacherNumTxt;
	}

	public void setTeacherNumTxt(WebElement teacherNumTxt) {
		this.teacherNumTxt = teacherNumTxt;
	}

	public WebElement getTeacherBloodGrpDdn() {
		return teacherBloodGrpDdn;
	}

	public void setTeacherBloodGrpDdn(WebElement teacherBloodGrpDdn) {
		this.teacherBloodGrpDdn = teacherBloodGrpDdn;
	}

	public WebElement getSubNameTxt() {
		return subNameTxt;
	}

	public void setSubNameTxt(WebElement subNameTxt) {
		this.subNameTxt = subNameTxt;
	}

	public WebElement getFatherNameTxt() {
		return fatherNameTxt;
	}

	public void setFatherNameTxt(WebElement fatherNameTxt) {
		this.fatherNameTxt = fatherNameTxt;
	}

	public WebElement getMotherNameTxt() {
		return motherNameTxt;
	}

	public void setMotherNameTxt(WebElement motherNameTxt) {
		this.motherNameTxt = motherNameTxt;
	}

	public WebElement getFatherOccTxt() {
		return fatherOccTxt;
	}

	public void setFatherOccTxt(WebElement fatherOccTxt) {
		this.fatherOccTxt = fatherOccTxt;
	}

	public WebElement getMotherOccTxt() {
		return motherOccTxt;
	}

	public void setMotherOccTxt(WebElement motherOccTxt) {
		this.motherOccTxt = motherOccTxt;
	}

	public WebElement getNationalityTxt() {
		return nationalityTxt;
	}

	public void setNationalityTxt(WebElement nationalityTxt) {
		this.nationalityTxt = nationalityTxt;
	}

	public WebElement getReligionTxt() {
		return religionTxt;
	}

	public void setReligionTxt(WebElement religionTxt) {
		this.religionTxt = religionTxt;
	}

	public WebElement getCaste_categoryDdn() {
		return caste_categoryDdn;
	}

	public void setCaste_categoryDdn(WebElement caste_categoryDdn) {
		this.caste_categoryDdn = caste_categoryDdn;
	}

	public WebElement getLangSpokenTxt() {
		return langSpokenTxt;
	}

	public void setLangSpokenTxt(WebElement langSpokenTxt) {
		this.langSpokenTxt = langSpokenTxt;
	}

	public WebElement getLangWrittenTxt() {
		return langWrittenTxt;
	}

	public void setLangWrittenTxt(WebElement langWrittenTxt) {
		this.langWrittenTxt = langWrittenTxt;
	}

	public WebElement getTeacherAddressTxt() {
		return teacherAddressTxt;
	}

	public void setTeacherAddressTxt(WebElement teacherAddressTxt) {
		this.teacherAddressTxt = teacherAddressTxt;
	}

	public WebElement getTeacherOfcAddressTxt() {
		return teacherOfcAddressTxt;
	}

	public void setTeacherOfcAddressTxt(WebElement teacherOfcAddressTxt) {
		this.teacherOfcAddressTxt = teacherOfcAddressTxt;
	}

	public WebElement getEmergencyNumTxt() {
		return emergencyNumTxt;
	}

	public void setEmergencyNumTxt(WebElement emergencyNumTxt) {
		this.emergencyNumTxt = emergencyNumTxt;
	}

	public WebElement getClass_categoryDdn() {
		return class_categoryDdn;
	}

	public void setClass_categoryDdn(WebElement class_categoryDdn) {
		this.class_categoryDdn = class_categoryDdn;
	}

	public WebElement getQualificationTxt() {
		return qualificationTxt;
	}

	public void setQualificationTxt(WebElement qualificationTxt) {
		this.qualificationTxt = qualificationTxt;
	}

	public WebElement getYearOfPassingTxt() {
		return yearOfPassingTxt;
	}

	public void setYearOfPassingTxt(WebElement yearOfPassingTxt) {
		this.yearOfPassingTxt = yearOfPassingTxt;
	}

	public WebElement getEduMarksTxt() {
		return eduMarksTxt;
	}

	public void setEduMarksTxt(WebElement eduMarksTxt) {
		this.eduMarksTxt = eduMarksTxt;
	}

	public WebElement getEduUnivTxt() {
		return eduUnivTxt;
	}

	public void setEduUnivTxt(WebElement eduUnivTxt) {
		this.eduUnivTxt = eduUnivTxt;
	}

	public WebElement getTeacherCTC() {
		return teacherCTC;
	}

	public void setTeacherCTC(WebElement teacherCTC) {
		this.teacherCTC = teacherCTC;
	}

	public WebElement getBankNameTxt() {
		return bankNameTxt;
	}

	public void setBankNameTxt(WebElement bankNameTxt) {
		this.bankNameTxt = bankNameTxt;
	}

	public WebElement getBranchNameTxt() {
		return branchNameTxt;
	}

	public void setBranchNameTxt(WebElement branchNameTxt) {
		this.branchNameTxt = branchNameTxt;
	}

	public WebElement getAccountNumberTxt() {
		return accountNumberTxt;
	}

	public void setAccountNumberTxt(WebElement accountNumberTxt) {
		this.accountNumberTxt = accountNumberTxt;
	}

	public WebElement getIfscCodeTxt() {
		return ifscCodeTxt;
	}

	public void setIfscCodeTxt(WebElement ifscCodeTxt) {
		this.ifscCodeTxt = ifscCodeTxt;
	}

	public WebElement getUanNumTxt() {
		return uanNumTxt;
	}

	public void setUanNumTxt(WebElement uanNumTxt) {
		this.uanNumTxt = uanNumTxt;
	}

	public WebElement getEpfNumTxt() {
		return epfNumTxt;
	}

	public void setEpfNumTxt(WebElement epfNumTxt) {
		this.epfNumTxt = epfNumTxt;
	}

	public WebElement getEsiNumTxt() {
		return esiNumTxt;
	}

	public void setEsiNumTxt(WebElement esiNumTxt) {
		this.esiNumTxt = esiNumTxt;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}

	/*
	 * Update the Teacher Details
	 */

	@FindBy(id = "DataTables_Table_0")
	private WebElement table;
	@FindBy(css = ".edits-content.edit_teacher")
	private WebElement editBtn;
	@FindBy(css = ".teacher_name_edit")
	private WebElement editNameTxt;
	@FindBy(css = ".teacher_emer_num_edit")
	private WebElement editEmergencyNumTxt;
	@FindBy(css = ".continue_update_teacher")
	private WebElement editContinueBtn;
	@FindBy(css = ".update_teacher")
	private WebElement editUpdateBtn;
	@FindBy(css = ".swal-button")
	private WebElement editOKBtn;
	@FindBy(css = ".swal-text")
	private WebElement editSucTxt;

	public WebElement getEditSucTxt() {
		return editSucTxt;
	}

	public void setEditSucTxt(WebElement editSucTxt) {
		this.editSucTxt = editSucTxt;
	}

	public WebElement getEditOKBtn() {
		return editOKBtn;
	}

	public void setEditOKBtn(WebElement editOKBtn) {
		this.editOKBtn = editOKBtn;
	}

	public WebElement getEditContinueBtn() {
		return editContinueBtn;
	}

	public void setEditContinueBtn(WebElement editContinueBtn) {
		this.editContinueBtn = editContinueBtn;
	}

	public WebElement getEditUpdateBtn() {
		return editUpdateBtn;
	}

	public void setEditUpdateBtn(WebElement editUpdateBtn) {
		this.editUpdateBtn = editUpdateBtn;
	}

	public WebElement getEditEmergencyNumTxt() {
		return editEmergencyNumTxt;
	}

	public void setEditEmergencyNumTxt(WebElement editEmergencyNumTxt) {
		this.editEmergencyNumTxt = editEmergencyNumTxt;
	}

	public WebElement getEditNameTxt() {
		return editNameTxt;
	}

	public void setEditNameTxt(WebElement editNameTxt) {
		this.editNameTxt = editNameTxt;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		this.editBtn = editBtn;
	}

	public WebElement getTable() {
		return table;
	}

	public void setTable(WebElement table) {
		this.table = table;
	}

	/*
	 * Delete Teacher
	 */

	@FindBy(css = ".dropdown-toggle > img")
	private WebElement disableTeacherToggle;
	@FindBy(id = "disable_teacher_btn")
	private WebElement disableTeacherBtn;
	@FindBy(css = ".teacher_id_drop")
	private WebElement teacherIdTxt;
	@FindBy(css = ".reason")
	private WebElement reasonTxt;
	@FindBy(css = ".description")
	private WebElement descriptionTxt;
	@FindBy(css = ".disable_teacher")
	private WebElement removeBtn;

	@FindBy(xpath = "//button[contains(.,'Yes, I am sure!')]")
	private WebElement confirmBtn;

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public void setConfirmBtn(WebElement confirmBtn) {
		this.confirmBtn = confirmBtn;
	}

	public WebElement getRemoveBtn() {
		return removeBtn;
	}

	public void setRemoveBtn(WebElement removeBtn) {
		this.removeBtn = removeBtn;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public WebElement getTeacherIdTxt() {
		return teacherIdTxt;
	}

	public void setTeacherIdTxt(WebElement teacherIdTxt) {
		this.teacherIdTxt = teacherIdTxt;
	}

	public WebElement getReasonTxt() {
		return reasonTxt;
	}

	public void setReasonTxt(WebElement reasonTxt) {
		this.reasonTxt = reasonTxt;
	}

	public WebElement getDescriptionTxt() {
		return descriptionTxt;
	}

	public void setDescriptionTxt(WebElement descriptionTxt) {
		this.descriptionTxt = descriptionTxt;
	}

	public WebElement getDisableTeacherToggle() {
		return disableTeacherToggle;
	}

	public void setDisableTeacherToggle(WebElement disableTeacherToggle) {
		this.disableTeacherToggle = disableTeacherToggle;
	}

	public WebElement getDisableTeacherBtn() {
		return disableTeacherBtn;
	}

	public void setDisableTeacherBtn(WebElement disableTeacherBtn) {
		this.disableTeacherBtn = disableTeacherBtn;
	}

	public void CreatesNewTeachingStaff()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getEmployeeManagementMenu());
		clickWithMultipleRetry(getEmployeeManagementMenu(), 10, 1000);
		explicitWaitClickable(30, getTeacherMenu());
		clickWithMultipleRetry(getTeacherMenu(), 10, 1000);
		explicitWaitClickable(30, getAddTeacherBtn());
		clickWithMultipleRetry(getAddTeacherBtn(), 10, 1000);

		explicitWaitClickable(30, getTeacherName());
		clickWithMultipleRetry(getTeacherName(), 10, 1000);
		String cell = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 0);
		System.out.println(cell);
		EnterInTextbox(getTeacherName(), cell);

		/**
		 * Handling Teacher DOB Date Picker
		 */

		String desiredDate1;
		String desiredMonth1;
		String desiredYear1;

		desiredDate1 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 3);
		System.out.println(desiredDate1);
		desiredMonth1 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 2);
		System.out.println(desiredMonth1);
		desiredYear1 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 1);
		System.out.println(desiredYear1);

		// Assume 'driver' is your WebDriver instance
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Locate the datepicker input field and click on it
		getDOBDatePickers().click();

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

		explicitWaitClickable(30, getTeacherGenderDdn());
		clickWithMultipleRetry(getTeacherGenderDdn(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 4);
		System.out.println(cell1);
		EnterInTextbox(getTeacherGenderDdn(), cell1);

		explicitWaitClickable(30, getTeacherIDTxt());
		clickWithMultipleRetry(getTeacherIDTxt(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 5);
		System.out.println(cell2);
		EnterInTextbox(getTeacherIDTxt(), cell2);

		explicitWaitClickable(30, getTeacherEmailTxt());
		clickWithMultipleRetry(getTeacherEmailTxt(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 6);
		System.out.println(cell3);
		EnterInTextbox(getTeacherEmailTxt(), cell3);

		explicitWaitClickable(30, getTeacherNumTxt());
		clickWithMultipleRetry(getTeacherNumTxt(), 10, 1000);
		String cell4 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 7);
		System.out.println(cell4);
		EnterInTextbox(getTeacherNumTxt(), cell4);

		explicitWaitClickable(30, getTeacherBloodGrpDdn());
		clickWithMultipleRetry(getTeacherBloodGrpDdn(), 10, 1000);
		String cell5 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 8);
		System.out.println(cell5);
		EnterInTextbox(getTeacherBloodGrpDdn(), cell5);

		explicitWaitClickable(30, getSubNameTxt());
		clickWithMultipleRetry(getSubNameTxt(), 10, 1000);
		String cell6 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 9);
		System.out.println(cell6);
		EnterInTextbox(getSubNameTxt(), cell6);
		getSubNameTxt().sendKeys(Keys.ENTER);

		explicitWaitClickable(30, getFatherNameTxt());
		clickWithMultipleRetry(getFatherNameTxt(), 10, 1000);
		String cell7 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 10);
		System.out.println(cell7);
		EnterInTextbox(getFatherNameTxt(), cell7);

		explicitWaitClickable(30, getFatherOccTxt());
		clickWithMultipleRetry(getFatherOccTxt(), 10, 1000);
		String cell9 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 11);
		System.out.println(cell9);
		EnterInTextbox(getFatherOccTxt(), cell9);

		explicitWaitClickable(30, getMotherNameTxt());
		clickWithMultipleRetry(getMotherNameTxt(), 10, 1000);
		String cell8 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 12);
		System.out.println(cell8);
		EnterInTextbox(getMotherNameTxt(), cell8);

		explicitWaitClickable(30, getMotherOccTxt());
		clickWithMultipleRetry(getMotherOccTxt(), 10, 1000);
		String cell10 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 13);
		System.out.println(cell10);
		EnterInTextbox(getMotherOccTxt(), cell10);

		explicitWaitClickable(30, getNationalityTxt());
		clickWithMultipleRetry(getNationalityTxt(), 10, 1000);
		String cell11 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 14);
		System.out.println(cell11);
		EnterInTextbox(getNationalityTxt(), cell11);

		explicitWaitClickable(30, getReligionTxt());
		clickWithMultipleRetry(getReligionTxt(), 10, 1000);
		String cell12 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 15);
		System.out.println(cell12);
		EnterInTextbox(getReligionTxt(), cell12);

		explicitWaitClickable(30, getCaste_categoryDdn());
		clickWithMultipleRetry(getCaste_categoryDdn(), 10, 1000);
		String cell13 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 16);
		System.out.println(cell13);
		EnterInTextbox(getCaste_categoryDdn(), cell13);

		explicitWaitClickable(30, getLangSpokenTxt());
		clickWithMultipleRetry(getLangSpokenTxt(), 10, 1000);
		String cell14 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 17);
		System.out.println(cell14);
		EnterInTextbox(getLangSpokenTxt(), cell14);

		explicitWaitClickable(30, getLangWrittenTxt());
		clickWithMultipleRetry(getLangWrittenTxt(), 10, 1000);
		String cell15 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 18);
		System.out.println(cell15);
		EnterInTextbox(getLangWrittenTxt(), cell15);

		explicitWaitClickable(30, getTeacherAddressTxt());
		clickWithMultipleRetry(getTeacherAddressTxt(), 10, 1000);
		String cell16 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 19);
		System.out.println(cell16);
		EnterInTextbox(getTeacherAddressTxt(), cell16);

		explicitWaitClickable(30, getTeacherOfcAddressTxt());
		clickWithMultipleRetry(getTeacherOfcAddressTxt(), 10, 1000);
		String cell17 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 20);
		System.out.println(cell17);
		EnterInTextbox(getTeacherOfcAddressTxt(), cell17);

		explicitWaitClickable(30, getEmergencyNumTxt());
		clickWithMultipleRetry(getEmergencyNumTxt(), 10, 1000);
		String cell18 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 21);
		System.out.println(cell18);
		EnterInTextbox(getEmergencyNumTxt(), cell18);

		explicitWaitClickable(30, getClass_categoryDdn());
		clickWithMultipleRetry(getClass_categoryDdn(), 10, 1000);
		String cell19 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 22);
		System.out.println(cell19);
		EnterInTextbox(getClass_categoryDdn(), cell19);

		explicitWaitClickable(30, getQualificationTxt());
		clickWithMultipleRetry(getQualificationTxt(), 10, 1000);
		String cell20 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 23);
		System.out.println(cell20);
		EnterInTextbox(getQualificationTxt(), cell20);

		explicitWaitClickable(30, getYearOfPassingTxt());
		clickWithMultipleRetry(getYearOfPassingTxt(), 10, 1000);
		String cell21 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 24);
		System.out.println(cell21);
		EnterInTextbox(getYearOfPassingTxt(), cell21);

		explicitWaitClickable(30, getEduMarksTxt());
		clickWithMultipleRetry(getEduMarksTxt(), 10, 1000);
		String cell22 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 25);
		System.out.println(cell22);
		EnterInTextbox(getEduMarksTxt(), cell22);

		explicitWaitClickable(30, getEduUnivTxt());
		clickWithMultipleRetry(getEduUnivTxt(), 10, 1000);
		String cell23 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 26);
		System.out.println(cell23);
		EnterInTextbox(getEduUnivTxt(), cell23);

		explicitWaitClickable(30, getTeacherCTC());
		clickWithMultipleRetry(getTeacherCTC(), 10, 1000);
		String cell24 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 27);
		System.out.println(cell24);
		EnterInTextbox(getTeacherCTC(), cell24);

		explicitWaitClickable(30, getBankNameTxt());
		clickWithMultipleRetry(getBankNameTxt(), 10, 1000);
		String cell25 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 28);
		System.out.println(cell25);
		EnterInTextbox(getBankNameTxt(), cell25);

		explicitWaitClickable(30, getBranchNameTxt());
		clickWithMultipleRetry(getBranchNameTxt(), 10, 1000);
		String cell26 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 29);
		System.out.println(cell26);
		EnterInTextbox(getBranchNameTxt(), cell26);

		explicitWaitClickable(30, getAccountNumberTxt());
		clickWithMultipleRetry(getAccountNumberTxt(), 10, 1000);
		String cell27 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 30);
		System.out.println(cell27);
		EnterInTextbox(getAccountNumberTxt(), cell27);

		explicitWaitClickable(30, getIfscCodeTxt());
		clickWithMultipleRetry(getIfscCodeTxt(), 10, 1000);
		String cell28 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 31);
		System.out.println(cell28);
		EnterInTextbox(getIfscCodeTxt(), cell28);

		explicitWaitClickable(30, getUanNumTxt());
		clickWithMultipleRetry(getUanNumTxt(), 10, 1000);
		String cell29 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 32);
		System.out.println(cell29);
		EnterInTextbox(getUanNumTxt(), cell29);

		explicitWaitClickable(30, getEpfNumTxt());
		clickWithMultipleRetry(getEpfNumTxt(), 10, 1000);
		String cell30 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 33);
		System.out.println(cell30);
		EnterInTextbox(getEpfNumTxt(), cell30);

		explicitWaitClickable(30, getEsiNumTxt());
		clickWithMultipleRetry(getEsiNumTxt(), 10, 1000);
		String cell31 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 34);
		System.out.println(cell31);
		EnterInTextbox(getEsiNumTxt(), cell31);

		explicitWaitClickable(30, getContinueBtn());
		clickWithMultipleRetry(getContinueBtn(), 10, 1000);

		/*
		 * Upload Documents
		 */

		File uploadFile1 = new File(getProjectPath() + getPropertyFileValue("profile_image"));
		WebElement labelElement = driver.findElement(By.className("bor_rights"));
		WebElement fileInput1 = labelElement.findElement(By.xpath("//input[@type='file' and @id='address_proof']"));
		fileInput1.sendKeys(uploadFile1.getAbsolutePath());

		WebElement labelElement1 = driver.findElement(By.className("bor_rights"));
		WebElement fileInput2 = labelElement1.findElement(By.xpath("//input[@type='file' and @id='birth_cert']"));
		fileInput2.sendKeys(uploadFile1.getAbsolutePath());

		WebElement labelElement3 = driver.findElement(By.className("bor_rights"));
		WebElement fileInput3 = labelElement3.findElement(By.xpath("//input[@type='file' and @id='pass_img']"));
		fileInput3.sendKeys(uploadFile1.getAbsolutePath());

		WebElement labelElement4 = driver.findElement(By.className("bor_rights"));
		WebElement fileInput4 = labelElement4.findElement(By.xpath("//input[@type='file' and @id='aadhar_img']"));
		fileInput4.sendKeys(uploadFile1.getAbsolutePath());

		WebElement labelElement5 = driver.findElement(By.className("bor_rights"));
		WebElement fileInput5 = labelElement5.findElement(By.xpath("//input[@type='file' and @id='domicile_cert']"));
		fileInput5.sendKeys(uploadFile1.getAbsolutePath());

		explicitWaitClickable(30, getSubmitBtn());
		clickWithMultipleRetry(getSubmitBtn(), 10, 1000);

		DeleteRowFromCSV(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum);

	}

	public void VerifyTeachingStaffIsCreated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getOKBtn());

				String successPopupMsz = getText(getOKBtn());
				System.out.println(successPopupMsz);
				Assert.assertEquals("OK", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void UpdateTheTeachingStaff()
			throws InterruptedException, NumberFormatException, FileNotFoundException, IOException, CsvException {

		explicitWaitClickable(30, getEmployeeManagementMenu());
		clickWithMultipleRetry(getEmployeeManagementMenu(), 10, 1000);
		explicitWaitClickable(30, getTeacherMenu());
		clickWithMultipleRetry(getTeacherMenu(), 10, 1000);

		/**
		 * Update the Asset Details In The Dynamic Web Table
		 */

		int maxRetries = 3;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {

				List<WebElement> editBtnCount = getTable().findElements(By.cssSelector(".teacher-list-id"));
				int editBtnCountSize = editBtnCount.size();
				System.out.println(editBtnCountSize);

				for (int i = 1; i <= 1; i++) {
					WebElement editButton = getTable().findElement(By.cssSelector(".teacher-list-id"));
					teacherId = editButton.getText();
					System.out.println(teacherId);
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
		explicitWaitClickable(30, getEditBtn());
		clickWithMultipleRetry(getEditBtn(), 10, 1000);

		explicitWaitClickable(30, getEditNameTxt());
		clickWithMultipleRetry(getEditNameTxt(), 10, 1000);
		String cell1 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 35);
		System.out.println(cell1);
		EnterInTextbox(getEditNameTxt(), cell1);

		mouseOverActionMoveToElement(getEditEmergencyNumTxt());

		/*
		 * Scroll Down
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", getEditEmergencyNumTxt());

		explicitWaitClickable(30, getEditContinueBtn());
		clickWithMultipleRetry(getEditContinueBtn(), 10, 1000);

		explicitWaitClickable(30, getEditUpdateBtn());
		clickWithMultipleRetry(getEditUpdateBtn(), 10, 1000);

	}

	public void VerifyTeachingStaffIsUpdated() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getEditOKBtn());

				String successPopupMsz = getText(getEditSucTxt());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Teacher update successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getEditOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void DeleteTheTeachingStaff()
			throws NumberFormatException, FileNotFoundException, IOException, CsvException, InterruptedException {

		explicitWaitClickable(30, getDisableTeacherToggle());
		clickWithMultipleRetry(getDisableTeacherToggle(), 10, 1000);
		explicitWaitClickable(30, getDisableTeacherBtn());
		clickWithMultipleRetry(getDisableTeacherBtn(), 10, 1000);

		explicitWaitClickable(30, getTeacherIdTxt());
		clickWithMultipleRetry(getTeacherIdTxt(), 10, 1000);
		EnterInTextbox(getTeacherIdTxt(), teacherId);

		explicitWaitClickable(30, getReasonTxt());
		clickWithMultipleRetry(getReasonTxt(), 10, 1000);
		String cell2 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 36);
		System.out.println(cell2);
		EnterInTextbox(getReasonTxt(), cell2);

		explicitWaitClickable(30, getDescriptionTxt());
		clickWithMultipleRetry(getDescriptionTxt(), 10, 1000);
		String cell3 = readSpecificCell(getProjectPath() + getPropertyFileValue("ManageTeacher"), rowNum, 37);
		System.out.println(cell3);
		EnterInTextbox(getDescriptionTxt(), cell3);

		/*
		 * upload disable teacher document
		 */

		File uploadFile1 = new File(getProjectPath() + getPropertyFileValue("disableTeacher"));
		WebElement labelElement = driver.findElement(By.className("upload_btn"));
		WebElement fileInput1 = labelElement
				.findElement(By.xpath("//input[@type='file' and @id='disable_teacher_pdf_upload']"));
		fileInput1.sendKeys(uploadFile1.getAbsolutePath());

		Thread.sleep(3000);

		explicitWaitClickable(30, getRemoveBtn());
		clickWithMultipleRetry(getRemoveBtn(), 10, 1000);

		Thread.sleep(3000);

		explicitWaitClickable(30, getConfirmBtn());
		clickWithMultipleRetry(getConfirmBtn(), 10, 1000);

		Thread.sleep(3000);

	}

	public void VerifyTeachingStaffIsDeleted() throws InterruptedException {

		int maxRetries = 5;
		for (int attempt = 1; attempt <= maxRetries; attempt++) {
			try {
				explicitWaitClickable(50, getEditOKBtn());

				Thread.sleep(3000);

				String successPopupMsz = getText(getEditSucTxt());
				System.out.println(successPopupMsz);
				Assert.assertEquals("Teacher disabled successfully", successPopupMsz);
				HighlightOutput("Assertion Passed Success Popup Message: " + successPopupMsz);

				clickWithMultipleRetry(getEditOKBtn(), 50, 2000);

				break;
			} catch (Exception e) {
				System.out.println("Exception occurred: " + e.getMessage() + attempt);
				e.printStackTrace();
				Thread.sleep(500);
			}
		}

	}

	public void CreatesNewNonTeachingStaff() {
		// TODO Auto-generated method stub

	}

	public void VerifyNonTeachingStaffIsCreated() {
		// TODO Auto-generated method stub

	}

	public void UpdateTheNonTeachingStaff() {
		// TODO Auto-generated method stub

	}

	public void VerifyNonTeachingStaffIsUpdated() {
		// TODO Auto-generated method stub

	}

	public void DeleteTheNonTeachingStaff() {
		// TODO Auto-generated method stub

	}

	public void VerifyNonTeachingStaffIsDeleted() {
		// TODO Auto-generated method stub

	}

}
