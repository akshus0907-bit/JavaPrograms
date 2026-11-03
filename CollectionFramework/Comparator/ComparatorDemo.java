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
}

class SalaryComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(1, "Akash", 30000));
        list.add(new Employee(2, "Rahul", 20000));
        list.add(new Employee(3, "Sneha", 40000));

        Collections.sort(list, new SalaryComparator());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(
                list.get(i).id + " " +
                list.get(i).name + " " +
                list.get(i).salary
            );
        }
    }
}