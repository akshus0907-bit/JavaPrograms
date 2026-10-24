
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Teacher
{
    private String name;
    private double salary;

    Teacher(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    String getName()
    {
        return name;
    }

    double getSalary()
    {
        return salary;
    }

    void display()
    {
        System.out.println(name + " - " + salary);
    }
}

class TeacherSorting
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Teacher> map =
            new HashMap<Integer, Teacher>();

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter teacher ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter teacher name: ");
            String name = sc.nextLine();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            map.put(id, new Teacher(name, salary));
        }

        // Convert Map values into a List
        List<Teacher> list =
            new ArrayList<Teacher>(map.values());

        // Sort by salary in ascending order
        list.sort(new Comparator<Teacher>()
        {
            public int compare(Teacher t1, Teacher t2)
            {
                return Double.compare(
                    t1.getSalary(), t2.getSalary());
            }
        });

        System.out.println("Teachers sorted by salary:");

        for (Teacher t : list)
        {
            t.display();
        }

        sc.close();
    }
}
