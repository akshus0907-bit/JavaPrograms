 /*Q2. Write a java program to Find every subarray whose sum equals a given target value. 
     Print all such subarrays. 
     Explanation - 
Use recursive functions only. 
No nested loops. 
     Input - Size: 6 
     Array: 2 4 1 3 5 2 
     Target:6      
     Output - Subarrays 
2 4 
 
      Total = 1 */
	  import java.util.*;
	  public class SubArrSumQ2{
		  public static void main(String[]args){
			  Scanner in=new Scanner(System.in);
			  System.out.println("enter array size");
			  int n=in.nextInt();
			  int arr[]=new int[n];
			  System.out.println("enter array");
			  for(int i=0;i<n;i++){
				  arr[i]=in.nextInt();
			  }
			  System.out.println("enter target");
			  int target=in.nextInt();
			  int count=0;
			  System.out.println("sub array");
			  for(int i=0;i<n;i++){
				  int sum=0;
				  for(int j=i;j<n;j++){
					  sum=sum+arr[j];
					  if(sum==target){
						  for(int k=i;k<=j;k++){
							  System.out.print(arr[k]+ " ");
						  }
						  System.out.println();
						  count++;
					  }
				  }
			  }
			  System.out.println("total="+count);
			  in.close();
		  }
	  }