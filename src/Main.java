import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Stream.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30, 50000, false, "Sales"));
        employees.add(new Employee("Jane Smith", 40, 60000, true, "Management"));
        employees.add(new Employee("Bob Johnson", 20, 40000, true, "IT"));
        employees.add(new Employee("Alice Lee", 35, 55000, false, "Marketing"));
        employees.add(new Employee("Tom Davis", 28, 48000, true, "Management"));

        List<Employee> result = employees.stream()
                .filter(e -> e.getDepartment().equals("Management"))
                .filter(e -> e.isPayedPerHour())
                .filter(e -> e.getAge() > 25)
                .limit(5)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}

