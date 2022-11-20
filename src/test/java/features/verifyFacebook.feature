@login
Feature: Verify login facebook login page

  @no_param
  Scenario: Verify login page
    Given  User open facebook application
    And user input to username
    And user input to password
    Then Verify email textbox is displayed
    And Verify password textbox is displayed

  @param_mark
  Scenario: Verify login page
#    PHỔ BIẾN
    Given  User open facebook application
    And user input to username which is "layngo10791@gmail.com"
    And user input to password which is "123456"
    Then Verify email textbox is displayed
    And Verify password textbox is displayed

  @param_nomark
  Scenario: Verify login page
    Given  User open facebook application
    And user input to username which is layngo10791@gmail.com
    And user input to password which is 123456
    Then Verify email textbox is displayed
    And Verify password textbox is displayed

  @multiparam
  Scenario: Verify login page
    Given  User open facebook application
    And user input to username which is "layngo10791@gmail.com" and user input to password which is "123456"
    Then Verify email textbox is displayed
    And Verify password textbox is displayed

  @datatable_step
  Scenario Outline: Verify login page
    Given  User open facebook application
    And user input to username and password

#      | Username                | Password  |
#      | khanhlinhtree@gmail.com | linh1808/ |
      | Username   | Password   |
      | <Username> | <Password> |
    When  user clicks on button submit
    Then Verify submitted info is displayed
      | Username   | Address   |
      | <Username> | <Address> |
    When Open customer page
    And Input to customer name textbox <CustomerName>
    And Input to city textbox <City>
    And Input to other required fields
      | Phone   | Email   |
      | <Phone> | <Email> |
    And Close application
    Examples:
      | Username                | Password  | CustomerName | City   | Address     | Phone      | FacebookName    | Email         |
      | khanhlinhtree@gmail.com | linh1808/ | Linh         | Ha Noi | De La Thanh | 0987654321 | Khánh Linh linh | abc@gmail.com |

  @datatable_scenerio
  Scenario Outline: Verify login page
    Given  User open facebook application
    And user input to username which is <Username>
    And user input to password which is <Password>
    Then user clicks on button submit
    And close application
    Examples:
      | Username   | Password   |
      | abc1@gmail.com | 1234561 |
      | abc2@gmail.com | 1234562 |
      | abc3@gmail.com | 1234563 |
      | abc4@gmail.com | 1234564 |


  @datatable_step2
  Scenario : Verify login page
    Given  User open facebook application
    And user input to username and input password

      | Username                | Password  |
      | khanhlinhtree@gmail.com | linh1808/ |
#      | Username   | Password   |
#      | <Username> | <Password> |
    When  user clicks on button submit
    And close application