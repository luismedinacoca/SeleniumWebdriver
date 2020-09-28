Feature: clicks on the reset button, then all the information should be remove from the contact us form

Scenario: Enter information to the contact us form and click the reset button and information is removed
  Given I access webdriveruniversity
  When I click on the contact us button
  And I enter user firstname
  And I enter user lastname
  And I enter user email address
  And I enter comments
  When I click on the reset button
  Then all information which was listed by the user on the contact us form should now be removed