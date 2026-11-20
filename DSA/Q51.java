/*Question 51: Write a java program to take input array from user and perform all operations in array.
Input:
Array = [5732, 8659, 2534, 9625, 7354, 1325]

Output:
Ascending Digits = [2357, 5689, 2345, 2569, 3457, 1235]
Descending Digits = [7532, 9865, 5432, 9652, 7543, 5321]
Sum of Digits = [17, 28, 14, 22, 19, 11]

Explanation:
Each number is processed by sorting its digits in ascending or
 descending order and also by calculating the sum of its digits.*/
 
 import java.util.*;
 public class Q51{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter number of element in aaray");
		 int n=in.nextInt();
		 int a[]=new int[n];
		 System.out.println("enter array element");
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
			 int asc[] = new int[n];
			 int desc[] = new int[n];
			 int sum[] = new int[n];
			 for(int i=0;i<n;i++){
				 int num=a[i];
			 while(num>0){
				 digit=num%10;
				 num=num/10;
				int s = 0;
                s = s + digit;
			    sum[i] = s;