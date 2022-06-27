import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void employeeNameTest() {
        Employee emp = new Employee();
        emp.setName("Elīna");
        Assert.assertEquals(emp.getName(), "Elīna", "Looks like mistake");
    }
    @Test
    public void employeeSurnameTest() {
        Employee emp = new Employee();
        emp.setSurname("Paeglīte");
        Assert.assertEquals(emp.getSurname(), "Paeglīte");
    }
    @Test
    public void employeeYearTest() {
        Employee emp = new Employee();
        emp.setYear(2022);
        Assert.assertEquals(emp.getYear(), 2022);
    }
    @Test
    public void employeeRoleTest() {
        Employee emp = new Employee();
        emp.setRole("QA");
        Assert.assertEquals(emp.getRole(), "QA");
    }
    @Test
    public void testAllArguments() {
        Employee emp = new Employee("Elīna", "Paeglīte", 2022, "QA");
                Assert.assertEquals(emp.getName(), "Elīna");
                Assert.assertEquals(emp.getSurname(), "Paeglīte");
                Assert.assertEquals(emp.getYear(), 2022);
                Assert.assertEquals(emp.getRole(), "QA");
    }
}
