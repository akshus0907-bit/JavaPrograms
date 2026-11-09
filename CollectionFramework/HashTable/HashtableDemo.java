
import java.util.Hashtable;
import java.util.Scanner;

public class HashtableDemo
{
    public static void main(String x[])
    {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        Scanner sc = new Scanner(System.in);

        ht.put(101, "Akshata");
        ht.put(102, "Rahul");
        ht.put(103, "Sneha");
        ht.put(104, "Pooja");

        System.out.println("Student Records:");
        System.out.println(ht);

        System.out.println("Enter Student ID to Search:");
        int id = sc.nextInt();

        if(ht.containsKey(id))
        {
            System.out.println("Student Found");
            System.out.println("Name: " + ht.get(id));
        }
        else
        {
            System.out.println("Student Not Found");
        }

        System.out.println("Enter Student ID to Remove:");
        int removeId = sc.nextInt();

        ht.remove(removeId);

        System.out.println("Updated Hashtable:");
        System.out.println(ht);

        sc.close();
    }
}
