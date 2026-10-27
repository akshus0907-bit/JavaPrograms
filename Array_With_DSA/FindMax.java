
import java.util.*;

public class FindMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = in.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        int max = a[0];
        int sm = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                sm = max;
                max = a[i];
            } 
            else if (a[i] > sm && a[i] < max) {
                sm = a[i];
            }
        }

        System.out.println("Maximum element = " + max);

        if (sm == Integer.MIN_VALUE) {
            System.out.println("Second maximum does not exist");
        } else {
            System.out.println("Second maximum = " + sm);
        }

        in.close();
    }
}
