
import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
    private int id;
    private String name;
    private String department;
    private double salary;
    private int experience;

    // Constructor
    Employee(int id, String name, String department,
             double salary, int experience)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    // Getters
    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    String getDepartment()
    {
        return department;
    }

    double getSalary()
    {
        return salary;
    }

    int getExperience()
    {
        return experience;
    }

    // Setters
    void setName(String name)
    {
        this.name = name;
    }

    void setDepartment(String department)
    {
        this.department = department;
    }

    void setSalary(double salary)
    {
        this.salary = salary;
    }

    void setExperience(int experience)
    {
        this.experience = experience;
    }

    void display()
    {
        System.out.println(id + " " + name + " "
            + department + " " + salary + " " + experience);
    }
}

class EmployeeManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();

        int choice;

        do
        {
            System.out.println("\n1.Add 2.Display 3.Update");
            System.out.println("4.Delete 5.Search 0.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1)
            {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                System.out.print("Experience: ");
                int exp = sc.nextInt();

                list.add(new Employee(id, name, dept, salary, exp));
                System.out.println("Employee added");
            }
            else if (choice == 2)
            {
                for (Employee e : list)
                {
                    e.display();
                }
            }
            else if (choice == 3)
            {
                System.out.print("Enter employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                boolean found = false;

                for (Employee e : list)
                {
                    if (e.getId() == id)
                    {
                        System.out.print("New name: ");
                        e.setName(sc.nextLine());

                        System.out.print("New department: ");
                        e.setDepartment(sc.nextLine());

                        System.out.print("New salary: ");
                        e.setSalary(sc.nextDouble());

                        System.out.print("New experience: ");
                        e.setExperience(sc.nextInt());

                        found = true;
                        System.out.println("Employee updated");
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Employee not found");
                }
            }
            else if (choice == 4)
            {
                System.out.print("Enter employee ID: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < list.size(); i++)
                {
                    if (list.get(i).getId() == id)
                    {
                        list.remove(i);
                        found = true;
                        System.out.println("Employee deleted");
                        break;
                    }
                }

                if (!found)
                {
                    System.out.println("Employee not found");
                }
            }
            else if (choice == 5)
            {
                System.out.print("Enter department: ");
                String dept = sc.nextLine();

                System.out.print("Enter minimum salary: ");
                double minSalary = sc.nextDouble();

                boolean found = false;

                for (Employee e : list)
                {
                    if (e.getDepartment().equalsIgnoreCase(dept)
                        && e.getSalary() >= minSalary)
                    {
                        e.display();
                        found = true;
                    }
                }

                if (!found)
                {
                    System.out.println("No matching employees");
                }
            }

        } while (choice != 0);

        sc.close();
    }
}
