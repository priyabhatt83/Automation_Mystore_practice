@register
  Feature: user should able to register successfully after entering all the details

    Scenario: user should register successfully

      Given user is on homepage
      When user click on sign in button
      And enter email address
      And create account button
      And enter all details
      Then user should able to register successfully
#      And user should able to see welcome message