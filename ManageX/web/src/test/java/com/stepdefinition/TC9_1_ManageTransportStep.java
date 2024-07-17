package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.opencsv.exceptions.CsvException;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC9_1_ManageTransportStep {

	PageObjectManager pom = new PageObjectManager();

	@When("the user creates new Vehicle")
	public void theUserCreatesNewVehicle()
			throws FileNotFoundException, InterruptedException, IOException, CsvException, AWTException {

//		pom.getManageTransportPage().CreateNewVehicle();
	}

	@Then("the user should see the created Vehicles")
	public void theUserShouldSeeTheCreatedVehicles() {

//		pom.getManageTransportPage().VerifyVehicleCreated();
	}

	@When("the user creates a new Route")
	public void theUserCreatesANewRoute() throws FileNotFoundException, IOException, CsvException, AWTException {

		pom.getManageTransportPage().CreateNewRoute();
	}

	@Then("the user should see the created Route")
	public void theUserShouldSeeTheCreatedRoute() throws InterruptedException {

		pom.getManageTransportPage().VerifyVehicleRouteCreated();
	}

	@When("the user Assign new Students to the created route")
	public void theUserAssignNewStudentsToTheCreatedRoute() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see Students are assigned to the route")
	public void theUserShouldSeeStudentsAreAssignedToTheRoute() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user updates the Vehicles details")
	public void theUserUpdatesTheVehiclesDetails() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see the updated vehicle details")
	public void theUserShouldSeeTheUpdatedVehicleDetails() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user updates the Vehicle route")
	public void theUserUpdatesTheVehicleRoute() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see the updated Vehicle route")
	public void theUserShouldSeeTheUpdatedVehicleRoute() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user Re-Assigns the students in the route")
	public void theUserReAssignsTheStudentsInTheRoute() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see the Reassigned Students")
	public void theUserShouldSeeTheReassignedStudents() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user deletes the created Vehicles")
	public void theUserDeletesTheCreatedVehicles() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should verify that the Vehicles are deleted")
	public void theUserShouldVerifyThatTheVehiclesAreDeleted() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user deletes the created vehicles routes")
	public void theUserDeletesTheCreatedVehiclesRoutes() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should verify that the vehicles routes are deleted")
	public void theUserShouldVerifyThatTheVehiclesRoutesAreDeleted() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
