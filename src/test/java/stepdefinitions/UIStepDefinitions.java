package stepdefinitions;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import static utilities.Driver.waitForVisibility;

public class UIStepDefinitions {
    HomePage homePage = new HomePage();
    Logger logger = (Logger) LogManager.getLogger(UIStepDefinitions.class);

    @Given("user is on ToolsQA home page")
    public void user_is_on_tools_qa_home_page() {
        logger.info("Opening the base url");
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
        logger.info("Opened the url");
    }

    @When("user verifies the title of the home page")
    public void userVerifiesTheTitleOfTheHomePage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ToolsQA"));
        logger.info("Verify that being at homepage");
    }

    @And("user click on the Form")
    public void userClickOnTheForm() {
        Driver.clickWithJS(homePage.form);
        logger.info("Opened form page");
    }

    @And("user click on the Practice Form")
    public void userClickOnThePracticeForm() {
        Driver.clickWithJS(homePage.practiseForm);
        logger.info("Opened Practise Form");
    }
    @And("user send Name, Email, Current Address via csv")
    public void userSendNameEmailCurrentAddressViaCsv() throws IOException, CsvValidationException {
        String CSV_PATH = "src\\test\\resources\\testdata\\toolsqa_data.csv";
        String[] csvCell;
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));
        while ((csvCell = csvReader.readNext()) != null) {
            homePage.name.sendKeys(csvCell[0]);
            homePage.email.sendKeys(csvCell[1]);
            homePage.currentAddress.sendKeys(csvCell[2]);
            logger.info("information sent to the boxes");
        }
    }
    @Then("user enter other fields")
    public void userEnterOtherFields() throws IOException {
        homePage.lastName.sendKeys("Ocakdan");
        Driver.clickWithJS(homePage.gender);
        homePage.mobileNumber.sendKeys("05070212465");
        Driver.clickWithJS(homePage.submit);
        ReusableMethods.getScreenshot("screen");
        logger.info( "Took a screenshot");
    }
    @Then("close browser")
    public void closeBrowser() {
        Driver.closeDriver();
        logger.info("Test finished");
    }
}