Feature: My Feature

Scenario: Verify the title of the page and click on A/B Testing link

    Given I launch the URL "http://the-internet.herokuapp.com/"
    When I verify the title of the page as "The Internet"
    Then I click on the link "A/B Testing"

Scenario: Select Option1 value form drop down and confirm if its selected or not

    Given I navigate back to Home page
    When I click on the dropdown link
    And I select the option "Option 1"
    Then I verify the option "Option 1" is selected

Scenario: Verify the hyperlinks are presented on the Frames Page

    Given I navigate back to Home Page
    When I click on Frames
    Then I verify the hyperlink "Nested Frames" is presented
    And I verify the hyperlink "iFrame" is presented
