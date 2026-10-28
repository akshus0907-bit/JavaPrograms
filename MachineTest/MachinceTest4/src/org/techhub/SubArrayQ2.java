

package org.techhub;

public class SubArrayQ2 {
	
	public static void main(String[]args) {
		 int arr[]= {1,2,3,-2,5,-3,2};            //given array
		 int target=5;                           //target  to find the sum 
		 for(int i=0;i<arr.length;i++) {          
			 int sum=0;                             //initial sum is 0
			 for(int j=i;j<arr.length;j++) {
				 sum=sum+arr[j];                      // to find the sub array sum 
				 
				 if(sum==target) {                     //sum==5 then 
					 for(int k=0;k<j;k++) {
						 System.out.println(arr[k]);     //print subarray
						 
						 if(k<j) {
							 System.out.println(",");
						 }
					 }
					 System.out.println("\t ");
				 }
			 }
			 
		 }
	
	}
}













