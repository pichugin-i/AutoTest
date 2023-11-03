package demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    private WebElement clickElem;

    @FindBy(xpath = "//li[@id='item-0']")
    private WebElement clickTextBox;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement fieldName;

    @FindBy(xpath = "//*[@id='userEmail']")
    private WebElement fieldEmail;

    @FindBy(id = "currentAddress")
    private WebElement fieldCurrentAdr;

    @FindBy(id = "permanentAddress")
    private WebElement fieldPermamentAdr;

    @FindBy(id = "submit")
    private WebElement button;

    @FindBy(name = "mobilePhone")
    public WebElement fieldPhone;


    public void createTextBox(String fieldNameValue, String fieldEmailValue, String currentAddressValue, String permanentAddressValue) {
        clickElem.click();
        clickTextBox.click();
        fieldName.sendKeys(fieldNameValue);
        fieldEmail.sendKeys(fieldEmailValue);
        fieldCurrentAdr.sendKeys(currentAddressValue);
        fieldPermamentAdr.sendKeys(permanentAddressValue);
        button.click();
    }
}