
// nesaprotu, kāpēc nestrādā - neaizveras web lapa, bet it kā visu liku kā nodarbības paraugā

package mavenTestNGHomework;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

@Log4j
public class BrowserTest {
    ChromeDriver driver;

    private final String DELFI_URL = "https://www.delfi.lv/";

    @BeforeTest
    public void setProperties() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        log.info("Tests ir sācies!");
        driver = new ChromeDriver();
        driver.get(DELFI_URL);
    }

    @Test
    public void chromeDriverTestUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), DELFI_URL);
    }

    @Test
    public void chromeDriverTestTitle() {
        Assert.assertEquals(driver.getTitle(), "DELFI - Vadošais ziņu portāls Latvijā - DELFI");
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("Tests ir beidzies!");
        driver.close();
    }
}
