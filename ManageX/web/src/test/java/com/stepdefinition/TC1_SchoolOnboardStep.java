package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WindowType;

import com.base.BaseClass;
import com.mailosaur.MailosaurException;
import com.opencsv.exceptions.CsvException;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_SchoolOnboardStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("the user is logged into the Super Admin Dashboard")
	public void theUserIsLoggedIntoTheSuperAdminDashboard()
			throws FileNotFoundException, IOException, InterruptedException, NumberFormatException {

		getDriver(getPropertyFileValue("browser"));
		implicitwait(30);
		maxWindow();

//		pom.getSchoolOnboardPage().LogintoSuperAdminDashboard();

	}

	@When("the user navigates to the {string} page in the Super Admin Dashboard")
	public void theUserNavigatesToThePageInTheSuperAdminDashboard(String string) {

//		pom.getSchoolOnboardPage().NavigatetoManageSchoolsPage();
	}

	@When("the user generates a new School Profile invite from the Super Admin Dashboard")
	public void theUserGeneratesANewSchoolProfileInviteFromTheSuperAdminDashboard()
			throws FileNotFoundException, IOException, CsvException {

//		pom.getSchoolOnboardPage().GeneratesNewSchoolProfileInvite();
	}

	@Then("the user should verify the {string} popup message in the Super Admin Dashboard.")
	public void theUserShouldVerifyThePopupMessageInTheSuperAdminDashboard(String string) throws InterruptedException {

//		pom.getSchoolOnboardPage().VerifySuccessMessageInSuperAdmin();

	}

	@Then("the user fetch {string} and {string} from Mailosaur portal")
	public void theUserFetchAndFromMailosaurPortal(String string, String string2)
			throws IOException, MailosaurException {

//		pom.getSchoolOnboardPage().FetchUsernameAndPasswordFromMailosaur();
	}

	@Then("the user logs in to the School Admin Dashboard using the mailed credentials")
	public void theUserLogsInToTheSchoolAdminDashboardUsingTheMailedCredentials()
			throws InterruptedException, FileNotFoundException, IOException {

//		driver.switchTo().newWindow(WindowType.TAB);
//		switchToNewTab1(driver);

//		Thread.sleep(3000);

		pom.getSchoolOnboardPage().LogIntoSchoolAdminDashboard();

//		pom.getSchoolOnboardPage().UpdatePassword();

		Thread.sleep(3000);
	}

	@Then("the user should verify the School Admin Mail-ID on the Onboard page.")
	public void theUserShouldVerifyTheSchoolAdminMailIDOnTheOnboardPage() throws FileNotFoundException, IOException {

//		pom.getSchoolOnboardPage().VerifySchoolNameAndMailIDOnOnboardPage();

	}

	@Then("the user onboards the school using the corresponding CSV file")
	public void theUserOnboardsTheSchoolUsingTheCorrespondingCSVFile()
			throws FileNotFoundException, IOException, AWTException, InterruptedException, CsvException {

//		pom.getSchoolOnboardPage().OnboardSchoolUsingCSVFile();

	}

	@Then("the user should verify the {string} popup message in the School Admin Dashboard.")
	public void theUserShouldVerifyThePopupMessageInTheSchoolAdminDashboard(String string) {

//		pom.getSchoolOnboardPage().SuccessfullOnboardPopup();

	}

}
