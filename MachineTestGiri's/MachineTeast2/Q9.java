/*Q9. You are given an integer array containing zero and non-zero values.
 Move all zero values to the end of the array while maintaining the original order of non-zero elements. 
 Description: Use two pointers: 
 • One pointer tracks the position for next non-zero element. 
 • Another pointer scans the array. 
 Place non-zero elements first and fill remaining positions with zeros.  
 Input: arr = [0,1,0,3,12]
 Output: [1,3,12,0,0] 
 Time Complexity: O(n)*/

import java.util.*;
public class Q9{
  public static void main(String[]args){
      Scanner in=new Scanner(System.in);
      System.out.println("enter aaray element"); //take input
	  int a[]=new int[5];
	  for(int i=0;i<a.length;i++){
		  a[i]=in.nextInt();
	  }
	  int count=0;
	  int j=0;
	  for(int i=0;i<a.length;i++){
		  if(a[i]!=0){     //if[a1]!=0
		  
		  int temp=a[i];  //then temp =a[i]
		  a[i]=a[j];
		  a[j]=temp;
		  j++;
	  }
	  }
	  
	  for(int i=0;i<a.length;i++){
		  System.out.println(a[i]);   //prinln array with shirt zero at last
	  }
  }
}