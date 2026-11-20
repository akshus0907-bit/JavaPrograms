/*Question 34: Return the first element that repeats in the array.
Input:
Array = [10, 5, 3, 4, 3, 5, 6]

Output:
First repeating element = 5

Explanation:
Check elements from left to right and identify the element whose
 first occurrence appears earlier but repeats later in the array.*/
 
 import java.util.*;
 public class FirstRepatEle{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter array element");
		 int a[]=new int[5];
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		 boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("first repating element="+a[i]);
					flag=true;
					break;
				}
			}
			if(flag) break;
		}
	 if(!flag){
		 System.out.println("element not repeated");
	 }
	 }
 }	 