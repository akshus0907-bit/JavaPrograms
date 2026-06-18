/*Question 52: Write a java program to display following series :
2 729 4 512 6 343 8 216 10 125 12 64 14 27 16 8 18 1
Input:

n = 9 (number of pairs)

Output:

2 729 4 512 6 343 8 216 10 125 12 64 14 27 16 8 18 1

Description:

The series alternates between:

Even numbers increasing (2,4,6,8...)

Cubes decreasing (9³, 8³, 7³, 6³...1³)*/
import java.util.*;
public class Q52{
	public static void main(String[]args){
		Scanner  in =new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int cube = n;   // starting from 9

        for (int i = 1; i <= n; i++) {
            System.out.print((i * 2) + " ");           // even number
            System.out.print((cube * cube * cube) + " "); // cube
            cube--;  // decrease cube base
        }
    }
}