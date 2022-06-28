package mavenTestNGHomework;

import CalculatorPackage.Calculator;
import lombok.extern.log4j.Log4j;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Log4j
public class HomeworkTest {

    // 1.uzdevums
    Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void startTest() {
        log.info("Tests ir sācies!");
    }

    @Test
    public void testAddMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 20), 30);
    }

    @Test
    public void testSubstractMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.substract(20, 10), 10);
    }

    @Test
    public void testDivideMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.divide(20, 10), 2);
    }

    @Test
    public void testMultiplyMethod() {
        calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(20, 10), 200);
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        log.info("Tests ir beidzies!");
    }
}

