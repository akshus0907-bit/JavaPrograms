
import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        if (this.salary > e.salary) {
            return 1;
        } else if (this.salary < e.salary) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class SortSalary {
    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();

        al.add(new Employee(1, "abc", 300));
        al.add(new Employee(2, "pqr", 900));
        al.add(new Employee(3, "xyz", 400));

        Collections.sort(al);

        for (Employee s : al) {
            System.out.println(s);
        }
    }
}
