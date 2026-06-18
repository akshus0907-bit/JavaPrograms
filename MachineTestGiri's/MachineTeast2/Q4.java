/*Q4. Write a java program to find the frequency of each digit in a given number. */

import java.util.*;
public class Q4{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int count[]=new int[10];
		while(n>0){
			int last=n%10;
			count[last]++;
			 n=n/10;
		}
		for(int i=0;i<10;i++){
			if (count[i]>0){
				System.out.println(i + " " +count[i]+ "time");
			}
		}
	}
}
