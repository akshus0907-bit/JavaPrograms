/*Question 122: Write a Java program to implement payroll system using interface
Asked In Practice Assignment
Create a POJO class Employee with fields id, name, basicSalary, and overtimeHours.
Create an interface Payroll with method calculateSalary(Employee e).

Overtime rate = ?200/hour
If total salary > 50000 ? deduct 10% tax

Input:
Enter id: 101
Enter name: Amit
Enter basic salary: 48000
Enter overtime hours: 10

Output:
Gross Salary : 50000
Tax : 5000
Net Salary : 45000*/
import java.util.*;

class Employee {
    private int id;
    private String name;
    private int basicSalary;
    private int overtimeHours;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }
}

interface Payroll {
    void calculateSalary(Employee e);
}

class PayrollImpl implements Payroll {

    public void calculateSalary(Employee e) {

        double overtimePay = e.getOvertimeHours() * 200;

        double grossSalary = e.getBasicSalary() + overtimePay;

        double tax = 0;

        if (grossSalary > 50000) {
            tax = grossSalary * 0.10;
        }

        double netSalary = grossSalary - tax;

        System.out.println("Gross Salary : " + grossSalary);
        System.out.println("Tax : " + tax);
        System.out.println("Net Salary : " + netSalary);
    }
}

public class InterfacePayrollSal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Employee e = new Employee();

        System.out.print("Enter Id : ");
        int id = in.nextInt();
        in.nextLine();

        System.out.print("Enter Name : ");
        String name = in.nextLine();

        System.out.print("Enter Basic Salary : ");
        int basicSalary = in.nextInt();

        System.out.print("Enter Overtime Hours : ");
        int overtimeHours = in.nextInt();

        e.setId(id);
        e.setName(name);
        e.setBasicSalary(basicSalary);
        e.setOvertimeHours(overtimeHours);

        PayrollImpl p = new PayrollImpl();
        p.calculateSalary(e);
    }
}