Feature: ToolsQA page
@Test01
  Scenario: Test ToolsQA page
  Given user is on ToolsQA home page
  When user verifies the title of the home page
  And user click on the Form
  And user click on the Practice Form
  And user send Name, Email, Current Address via csv
  Then user enter other fields
  Then close browser
