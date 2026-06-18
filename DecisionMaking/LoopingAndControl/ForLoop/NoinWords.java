/*Question 35: Write a java program to enter a number and print it in words.
Input:

Number = 123

Output:

One Two Three

Explanation:

Each digit is separated and converted into its word form.
1 ? One, 2 ? Two, 3 ? Three.*/
import java.util.*;

public class NoinWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();

        int rev = 0, Count = 0;
        int temp = n;

        
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
            Count++;
        }

        
        for (int i = 1; i <= Count; i++) {
            int digit = rev % 10; 
            
            switch (digit) { 
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
                case 0: System.out.print("Zero "); break;
            }
            rev = rev / 10;
        }
    }
}
