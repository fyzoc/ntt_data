# NTT_Data Test Automation 

"ToolsQA (demoqa.com)" page test automation.
It was built using selenium-cucumber framework.


# How To Run 
Inside the runner class you can mention the specific test case from the Feature file.
for instance: "@Test01" annotation is inside the Feature file. So if you want to execute this test case you need to change tags = "@Test01" in Runner class.

# How To Get ScreenShot
The framework has a method which name is "getScreenshot" which in utilities package in ReusableMethods class.
This method is used for taking specific screenshot.
When the test is executed, the test-output package and Screenshots are created.

# How to Read csv file
Also the project could read information from any csv file, where we create at 'testdata' package under resources.
It was added the required dependency to the xml file to make.

# Log4J Library
Utilized from Log4j library to track each and every step which supposed to be logged.
When the test is executed, the Logs package and a log.txt file are created. And the logs are attended to this file.

# Test Report
When the test is finished,it gives a cucumber-report.The target package and xml-report are created.


![0a34a69a-e937-4226-a84c-fba05fa35d49](https://user-images.githubusercontent.com/102401180/198977604-6640c8c0-9985-44e5-9990-f3aff9316595.jpg)

![055ed4a1-60da-4e0c-83eb-c05de612eaed](https://user-images.githubusercontent.com/102401180/198977632-b6e7953a-d3ac-4020-9f19-946059792dee.jpg)

