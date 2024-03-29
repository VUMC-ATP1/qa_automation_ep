package pageObjectsHomework;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    private final By checkoutButton = By.id("checkout");
    @Then("I click to checkout button")
    public void checkoutButtonClick() {
        driver.findElement(checkoutButton).click();
    }
}
