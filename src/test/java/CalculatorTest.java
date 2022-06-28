import CalculatorPackage.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(10, 20), 30.00, "Looks like method have some issues");
    }
    @Test
    public void testSubstractMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.substract(20, 10), 10.00);
    }
    @Test
    public void testDivideMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(20, 10), 2.00);
    }
    @Test
    public void testMultiplyMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(20, 10), 200.00);
    }



}
