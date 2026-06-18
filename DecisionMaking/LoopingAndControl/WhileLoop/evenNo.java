/*Question 4: Write a java program to print all even numbers between 1 to 100.- using while loop
Input:

No input required

Output:

2 4 6 8 ... 100

Explanation:

Even numbers are divisible by 2.
The program checks each number from 1 to 100 and prints it if it is divisible by 2.*/

public class evenNo{
	public static void main(String[]args){
		int n=1;
		while(n<100){
			if(n%2==0){
				System.out.println(n);
			}
				n++;
		}
	}
}