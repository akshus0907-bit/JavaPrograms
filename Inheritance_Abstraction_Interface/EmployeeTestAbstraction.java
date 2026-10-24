
import java.util.Scanner;

abstract class Employee
{
    String name;
    double salary;

    Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();
}

interface Bonus
{
    double calculateBonus();
}

class PermanentEmployee extends Employee implements Bonus
{
    PermanentEmployee(String name, double salary)
    {
        super(name, salary);
    }

    public double calculateBonus()
    {
        return salary * 15 / 100;
    }

    double calculateSalary()
    {
        return salary + calculateBonus();
    }

    void display()
    {
        System.out.println("Permanent Employee");
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + calculateBonus());
        System.out.println("Final Salary = " + calculateSalary());
    }
}

class ContractEmployee extends Employee implements Bonus
{
    ContractEmployee(String name, double salary)
    {
        super(name, salary);
    }

    public double calculateBonus()
    {
        return salary * 5 / 100;
    }

    double calculateSalary()
    {
        return salary + calculateBonus();
    }

    void display()
    {
        System.out.println("Contract Employee");
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
        System.out.println("Bonus = " + calculateBonus());
        System.out.println("Final Salary = " + calculateSalary());
    }
}

class EmployeeTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Permanent employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Permanent salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Contract employee name: ");
        String name2 = sc.nextLine();

        System.out.print("Contract salary: ");
        double salary2 = sc.nextDouble();

        PermanentEmployee p =
            new PermanentEmployee(name1, salary1);

        ContractEmployee c =
            new ContractEmployee(name2, salary2);

        System.out.println();
        p.display();

        System.out.println();
        c.display();

        sc.close();
    }
}
