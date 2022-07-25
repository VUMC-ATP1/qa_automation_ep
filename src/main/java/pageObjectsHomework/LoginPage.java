package pageObjectsHomework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By userNameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login-button");

    public WebElement getUserNameField() {
        return driver.findElement(userNameField);
    }
    @Given("I have navigate to login page and enter {string}")
    public void setUserNameField(String value) { getUserNameField().sendKeys(value); }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField); }

    @Then("I enter {string}")
    public void setPasswordField(String value) { getPasswordField().sendKeys(value); }

    public WebElement loginButton() {
        return driver.findElement(loginButton); }
    @Then("I click login button")
    public void clickLogin() { driver.findElement(loginButton).click(); }

}
