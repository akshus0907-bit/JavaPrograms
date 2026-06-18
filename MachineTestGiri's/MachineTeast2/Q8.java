/*Q8. You are given a sorted integer array that may contain duplicate values.
 Your task is to remove all duplicate elements so that each number appears only once and print
 the total count of unique elements.
 Description: Use two pointers: • One pointer keeps track of unique elements position.  
 • Another pointer scans the array. Whenever a new unique element is found, place it in the correct position. 
 Input: arr = [1, 1, 2, 2, 3, 4, 4, 5] 
 Output: Unique Elements: [1, 2, 3, 4, 5] 
 Count = 5 */
 
 import java.util.*;
 public class Q8{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int a[]=new int[n];   //take input
		 int b[]=new int[n];
		 
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		 int count=0;
		 for(int i=1;i<a.length;i++){
			 for(int j=0;j<a.length;j++){
				 if(a[i]!=a[j]){    //check a[i]!=a[1]
					 count++;     //increase count
				 }
			 }
			 for(int i=0;i<a.lenght;i++){
				 System.out.println(a[i]+" "+ j+1);
			 }
		 }
	 }
 }
				 
		 