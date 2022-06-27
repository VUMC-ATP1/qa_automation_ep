public class Employee {
    // name, surname, year, role
    // all args / no args constructor
    // getter, setter
    // test in under/java package

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String name;
    public String surname;
    public int year;
    public String role;

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public String getRole() {
        return role;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee(String name, String surname, int year, String role) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.role = role;
    }

    public Employee() {
    }
}
