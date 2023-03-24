package Stream;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private boolean isPayedPerHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public void setPayedPerHour(boolean payedPerHour) {
        isPayedPerHour = payedPerHour;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    public Employee(String name, int age, double salary, boolean isPayedPerHour, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isPayedPerHour = isPayedPerHour;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + ", isPayedPerHour=" + isPayedPerHour + ", department='" + department + '\'' + '}';
    }
}
