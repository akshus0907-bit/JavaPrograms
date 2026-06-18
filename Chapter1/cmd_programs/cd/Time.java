/*Question 17: Write a Java program to convert seconds into hours, minutes, and seconds.
Input:
Seconds = 3665

Output:
Hours = 1
Minutes = 1
Seconds = 5

Explanation:
1 hour = 3600 seconds.
3665 ÷ 3600 gives 1 hour.
Remaining seconds are converted into minutes and seconds using division and modulus operations.*/
import java.util.*;
public class Time{
	public static void main(String[]arge){
		Scanner in =new Scanner(System.in);
		System.out.println("enter time in seconds:");
		int t=in.nextInt();
		int hour=t/3600;
		int rem= t%3600;
		int min = rem/60;
		int sec =t%60;
		
		System.out.println( "hour=: "+hour+ "\n minutes=:"+min+ "\nseconds "+sec);3
	}
}