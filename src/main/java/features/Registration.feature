@LectieAvansata
Feature: Registration flow feature

  Background:
    Given "https://demo-opencart.com/" is accessed

  @ExecutaAcestTC
  Scenario: The Registration page can be accessed from navigation bar
    When user clicks on register buttons from navigation bar
    Then "/index.php?route=account/register" is present within the current url

  Scenario: Open cart page is accessible
    Then "https://demo-opencart.com/" is present within the current url

  @LectieAvansata
  Scenario Outline: error message is displayed when providing invalid data for <affectedFiled>
    And user clicks on register buttons from navigation bar
    When the register fields are populated with the following data:
      | firstName       | <first name>   |
      | lastName        | <last name>    |
      | email           | <email>        |
      | phoneNumber     | <phone number> |
      | password        | Parola123!     |
      | confirmPassword | Parola123!     |
    And privacyCheckBox is clicked
    And Continue button is clicked
    Then the following key words are present within an error message
      | <errorMessage> |
    Examples:
      | affectedField | first name                        | last name | email              | phone number | errorMessage                                    |
      | Email         | Andrei                            | Secu      |                    | 079888688    | appear to be valid!                             |
      | First Name    |                                   | Secu      | emailbun@gmail.com | 2423423423   | First Name must be between 1 and 32 characters! |
      | Last Name     | Andrei                            |           | emailbun@gmail.com | 2423423423   | Last Name must be between 1 and 32 characters!  |
      | Phone         | Andrei                            | Secu      | emailbun@gmail.com |              | Telephone must be between 3 and 32 characters!  |
      | Phone         | Andrei                            | Secu      | emailbun@gmail.com | 79           | Telephone must be between 3 and 32 characters!  |
      | First Name    | 07izqFNuWZD4CaIlBu09S7Bm8Cp5Bbina | Secu      | emailbun@gmail.com | 2423423423   | First Name must be between 1 and 32 characters! |