/*Question 41: Write a Java program to find the maximum among three numbers.
Input:
A = 10
B = 25
C = 15

Output:
Maximum = 25

Explanation:
The program compares all three numbers using conditional statements and prints the largest value.
*/
import java.util.*;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        
        String d = (a > b && a > c) ? "maximum="+a : (b > c) ? "maximum="+b : "maximum="+c;
        
        System.out.println(d);
    }
}

