package seleniumHomework;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class sauceDemoTests {

    ChromeDriver driver;

    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutOverViewPage checkoutOverViewPage;
    CheckoutPage checkoutPage;
    CheckoutSuccessPage checkoutSuccessPage;

    private final String SAUCEDEMO_URL = "https://www.saucedemo.com/";

    @BeforeTest
    public void setProperties() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get(SAUCEDEMO_URL);
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        checkoutOverViewPage = new CheckoutOverViewPage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutSuccessPage = new CheckoutSuccessPage(driver);
    }

    @Test
    public void firstTest() {
            driver.get(SAUCEDEMO_URL);
            loginPage.setUserNameField("standard-user");
            loginPage.setPasswordField("secret-sauce");
            loginPage.clickLogin();
            inventoryPage.selectBackpackItem();
            inventoryPage.clickAddToCart();
            inventoryPage.clickToShoppingCart();
            cartPage.checkoutButtonClick();
            checkoutPage.setFirstNameField("Elīna");
            checkoutPage.setLastNameField("Paeglīte");
            checkoutPage.setZipCodeField("LV-1000");
            checkoutPage.continueButtonClick();
            checkoutOverViewPage.finishButtonClick();
            checkoutSuccessPage.backHomeButtonClick();
        }

        @Test
        public void secondTest() {
            driver.get(SAUCEDEMO_URL);
            loginPage.setUserNameField("standard-user");
            loginPage.setPasswordField("secret-sauce");
            loginPage.clickLogin();
            inventoryPage.clickToShoppingCart();
            cartPage.checkoutButtonClick();
        }

        @AfterMethod(alwaysRun = true)
        public void tearDown() {

        driver.close();
        }
}
