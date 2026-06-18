/*Q5. Given an integer array and a specific element, write a Java program to find 
the index position of that element in the array. If the element is not found, print -1. 
 Input :- Array: {10, 20, 30, 40, 50}  
 Element to find: 30
 Output :- Element found at index: 2 */
 
 import java.util.*;
 public class Q5{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter array element");
		 int a[]=new int[5];
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		   int flag=-1;  // default value of flage is 1 
		 System.out.println("enter element to find=");
		 int n=in.nextInt();
		 System.out.println("number fount at index=");
		 for(int i=0;i<a.length;i++){
			 if(a[i]==n){   
				 flag=i;
				 break;
			 }
		 }
		 
			 System.out.println(flag);
	 }
 }
 