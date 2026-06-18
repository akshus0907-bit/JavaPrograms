/*Q10. Write a Java program to find the maximum sum of a subarray where you are allowed to delete at most one element. 
Description • You can choose a continuous subarray. 
 • You may delete one element from the subarray to maximize the sum. 
 • If all elements are negative, return the maximum element. 
 Input :- arr = [1, -2, 0, 3] 
 Output :- 4 */
 
 import java.util.*;
 public class Q10{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 int a[]=new int[5];
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		 for(int i=0;i<a.length;i++){
			 int sum=0;
			 if(a[i]>=0){  //check a[i]>=0 or not
				 sum=sum+a[i];
			 }
		 }
	 }
 }
				 