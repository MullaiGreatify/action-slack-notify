@ManageStaffs
Feature: Manage Teaching Staff and Non-Teaching Staff in the School Admin Dashboard

  Background: 
    Given the user is logged into the School Admin Dashboard

  Scenario: Manage Teaching and Non-Teaching Staff in the School Admin Dashboard
    When the user creates new Teaching Staff
    Then the user should see the new Teaching Staff in the Teacher List
    When the user updates the Teaching Staff details
    Then the user should see the updated Teaching Staff details in the Teacher list
    When the user deletes a Teaching Staff
    Then the user should verify that the Teaching Staff is removed from the Teacher list

    When the user creates new Non-Teaching Staff
    Then the user should see the new Non-Teaching Staff in the Non-Teaching Staff List
    When the user updates the Non-Teaching Staff details
    Then the user should see the updated Non-Teaching Staff details in the Non-Teaching Staff list
    When the user deletes a Non-Teaching Staff
    Then the user should verify that the Non-Teaching Staff is removed from the Non-Teaching Staff list
