package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy( xpath ="(//div[@class='card-up'])[2]")
    public WebElement form;
    @FindBy( xpath ="(//span[@class='text'])[10]")
    public WebElement practiseForm;
    @FindBy( xpath ="//input[@placeholder='First Name']" )
    public WebElement name;
    @FindBy( xpath ="//input[@placeholder='Last Name']" )
    public WebElement lastName;
    @FindBy( id ="userEmail" )
    public WebElement email;
    @FindBy( id ="gender-radio-2" )
    public WebElement gender;
    @FindBy( id ="userNumber" )
    public WebElement mobileNumber;
    @FindBy( xpath ="//textarea[@placeholder='Current Address']" )
    public WebElement currentAddress;
    @FindBy( xpath ="//button[@id='submit']" )
    public WebElement submit;
}
