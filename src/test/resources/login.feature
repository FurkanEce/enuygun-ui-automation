Feature: Test

  Scenario: Welcome HomePage
    Given User goes to the enuygun page
    Then It is checked that the homepage is open
    When User clicks to the buy button

  Scenario Outline: Login Invalid
    Given User enters email address "<email>"
    And User enters password "<password>"
    And The user is not logged in invalid"<message>"
    Then The user clears email input and password input
    Examples:
      | email                     | password | message                   |
      | furkanece99qgmail.com     | 123456   | Lütfen, geçerli bir e-posta adresi girdiğinizden emin olun. |
      | kkk                       |          | Lütfen, geçerli bir e-posta adresi girdiğinizden emin olun. |
      |                           | 1234     | Bu alanı boş bırakamazsınız. |
      |                           |          | Bu alanı boş bırakamazsınız. |

  Scenario: Login Valid
    Given User enters registered email address
    And User enters registered password
    And User logs in
    Then Check that the user is logged in