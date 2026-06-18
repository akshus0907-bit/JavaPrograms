/*Question 6: Write a Java program to store 5 numbers in an array using constructor and find maximum number.

Description: Create NumberArray class having an integer array. Initialize array using constructor.
 Find maximum number using logic.
INPUT:
Enter 5 numbers: 10 45 22 89 34

OUTPUT:
Maximum number is: 89

EXPLANATION:
Create NumberArray class with int[] array field. Use constructor public NumberArray(int[] nums)
 to initialize array. Create method findMax() to find maximum using loop.
 Compare each element and store maximum. Display maximum value.*/
 
 import java.util.*;
 public class MaxArr{
	 private int a[]=new int[5];
	 
	 MaxArr(int[]nums){
		a=nums;
	 }
	 void findMax(){
		 int max=0;
		 for(int i=0;i<a.length;i++){
			 if(a[i]>max){
				 max=a[i];
			 }
		 }
		 System.out.println("max="+max);
	 }
		 public static void main(String[]args){
			 Scanner in=new Scanner(System.in);
			 int nums[]=new int[5];
			 System.out.println("enter 5 element in aaray");
			 for(int i=0;i<nums.length;i++){
				 nums[i]=in.nextInt();
			 }
			 MaxArr  m=new MaxArr(nums);
			 m.findMax();
		 }
 }
			 
