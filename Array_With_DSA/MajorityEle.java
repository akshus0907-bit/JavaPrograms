/*Question 23: Write a Java program to find the Majority Element of an array.
A majority element in an array of size n is an element that appears more than n/2 times. There can be at most one majority element in the array.
Input:
Array = [4, 8, 4, 6, 7, 4, 4, 8]

Output:
Majority Element = 4

Explanation:
Count the occurrences of every element using nested traversal and if any element
 appears more than n/2 times it is the majority element.*/
 
 import java.util.*;
 public class MajorityEle{
	 public static void main(String[]args){
		 Scanner in=new Scanner (System.in);
		 int n=in.nextInt();
		 int a[]=new int[n];
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		 int majo=0;
		 for(int i=0;i<a.length;i++){
			 if(a[i]>majo){
				 majo++;
			 }
			 a[i]=majo;
		 }
		 
			 System.out.println("majority element="+majo);
	 }
 }
		 
 