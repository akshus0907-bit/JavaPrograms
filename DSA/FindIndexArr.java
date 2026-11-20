/*Question 21: Given an integer array and a specific element, write a Java program to find the index position of that element in the array. 
If the element is not found, print -1.
Input:
Array = [10, 20, 30, 40, 50]
Element to find = 30

Output:
Element found at index = 2

Explanation:
Traverse the array from index 0 and compare each element with the target value;
 when a match is found return its index otherwise return -1 if the element is not present.*/
 
 import java.util.*;
 public class FindIndexArr{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter array element");
		// int size=in.nextInt();
		 int a[]=new int[5];
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		 
		 System.out.println("enter element to find");
		 int n=in.nextInt();
		 System.out.println("element found at index=");
		 for(int i=0;i<a.length;i++){
			 if(a[i]==n){
				 System.out.println(i+ " ");
			 }
		 }
	 }
 }