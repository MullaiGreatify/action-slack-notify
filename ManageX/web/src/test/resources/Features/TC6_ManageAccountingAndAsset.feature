@AccountingAndAsset
Feature: Manage Vendor and Financial Operations like purchase, payment, receipt, journal voucher, asset in the School Admin Dashboard

  Background: 
    Given the user is logged into the School Admin Dashboard

  Scenario: Manage Vendor and Financial Operations in the School Admin Dashboard
    When the user adds a new vendor
    Then the user should see the new vendor in the vendor list
    When the user creates a new purchase order
    Then the user should see the created purchase order in the purchase list
    When the user creates a new payment
    Then the user should see the created payment in the payment list
    When the user creates a new receipt
    Then the user should see the created receipt in the receipt list
    When the user updates the receipt details
    Then the user should see the updated receipt details in the receipt list
    When the user deletes a receipt
    Then the user should verify that the receipt is removed from the receipt list
    When the user updates the payment details
    Then the user should see the updated payment details in the payment list
    When the user deletes a payment
    Then the user should verify that the payment is removed from the payment list
    When the user updates the purchase order details
    Then the user should see the updated purchase order details in the PO list
    When the user deletes a purchase order
    Then the user should verify that the purchase order is removed from the PO list
    When the user updates the vendor details
    Then the user should see the updated vendor details in the vendor list
    When the user deletes a vendor
    Then the user should verify that the vendor is removed from the vendor list
    When the user create a new asset
    Then the user should see the new asset in the manage asset
    When the user updates the asset
    Then the user should see the updated asset details in the manage asset
    When the user deletes a asset
    Then the user should verify that the asset is removed from the manage asset
