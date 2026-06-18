/*Question 31: Write a java program to display 1 to nth Duck Number.
Input:

n = 5

Output:

10 20 30 40 50

Explanation:

Duck numbers contain zero inside the number.
The first five Duck Numbers are 10, 20, 30, 40, and 50.*/
import java.util.*;

public class DuckNoinDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int n = in.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {
            
            for (int temp = num; temp > 0; ) {
                if (temp % 10 == 0) {
                    System.out.print(num + " ");
                    count++;
                    break; 
                }
                temp = temp / 10;
            }
            num++;
        }
    }
}

		
		