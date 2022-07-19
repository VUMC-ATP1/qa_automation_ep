package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By zipPostalCodeInput = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public WebElement getFirstNameField() {
        return driver.findElement(firstNameInput);
    }
    public void setFirstNameField(String value) { getFirstNameField().sendKeys(value); }

    public WebElement getLastNameField() {
        return driver.findElement(lastNameInput);
    }
    public void setLastNameField(String value) { getLastNameField().sendKeys(value); }

    public WebElement getZipCodeField() {
        return driver.findElement(zipPostalCodeInput);
    }
    public void setZipCodeField(String value) { getZipCodeField().sendKeys(value); }

    public void continueButtonClick() {
        driver.findElement(continueButton).click();
    }

}
