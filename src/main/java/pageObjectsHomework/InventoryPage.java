package pageObjectsHomework;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    private WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private final By backpackItem = By.id("item_4_title_link");
    private final By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingCart = By.id("shopping_cart_container");

@Then("I select backpack item")
    public void selectBackpackItem() {
    driver.findElement(backpackItem).click();
}
@Then("I click add to cart")
public void clickAddToCart() {
    driver.findElement(addToCart).click();
}

@Then("I click to shopping cart")
public void clickToShoppingCart() {
    driver.findElement(shoppingCart).click();
}

}
