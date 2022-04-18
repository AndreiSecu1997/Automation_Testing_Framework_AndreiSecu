Feature: Contact Page Test Cases
  
  Scenario: Send a meesage via contact page
    Given "https://demo.opencart.com/index.php?route=information/contact" is accessed
    When "Andrei Secu" is entered into Name input field
    And the system sleeps for 5000 ms