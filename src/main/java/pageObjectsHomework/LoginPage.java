package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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
    public void setUserNameField(String value) { getUserNameField().sendKeys(value); }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField); }
    public void setPasswordField(String value) { getPasswordField().sendKeys(value); }

    public WebElement loginButton() {
        return driver.findElement(loginButton); }
    public void clickLogin() { driver.findElement(loginButton).click(); }

}
