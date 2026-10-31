import java.util.*;

class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

class EmployeeComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {

        // First condition: Salary descending
        if (e1.salary != e2.salary) {
            return e2.salary - e1.salary;
        }

        // Second condition: Name ascending
        if (!e1.name.equals(e2.name)) {
            return e1.name.compareTo(e2.name);
        }

        // Third condition: ID ascending
        return e1.id - e2.id;
    }
}

public class TreeSetComparatorDemo {

    public static void main(String[] args) {

        TreeSet<Employee> set =
                new TreeSet<Employee>(new EmployeeComparator());

        set.add(new Employee(101, "Rahul", 50000));
        set.add(new Employee(102, "Amit", 60000));
        set.add(new Employee(103, "Sneha", 50000));
        set.add(new Employee(104, "Amit", 50000));
        set.add(new Employee(105, "Rahul", 50000));
        set.add(new Employee(106, "Priya", 70000));

        for (Employee e : set) {
            System.out.println(e);
        }
    }
}