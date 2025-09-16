import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        List<Employee> li = Arrays.asList(
                new Employee(1, "Nishek", 10000), 
                new Employee(2, "Ravi", 6000),
                new Employee(3, "Balaji", 4000)
            );


            li.stream().filter(a->a.salary>5000).map(a->a.salary + (a.salary * 30/100)).forEach(a->System.out.println(a));

            
    }
}
