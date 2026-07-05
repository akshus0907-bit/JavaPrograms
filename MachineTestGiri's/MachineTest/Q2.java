/*2. Write a java program to Find every subarray whose sum equals a given target value. 
     Print all such subarrays. 
     Explanation - 
Use recursive functions only. 
No nested loops. 
     Input - Size: 6 
     Array: 2 4 1 3 5 2 
     Target:6      
     Output - Subarrays 
2 4 
1 3 2 
4 1 1 
      Total = 3 */
	  import java.util.*;
public class Q2{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of element");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int totalsum=0;
		System.out.println("enter target");
		int target=in.nextInt();
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				int sum=0;
			
			for(int k=i;k<=j;k++){
				 sum=sum+a[k];
				if(sum>=target){
					System.out.println(sum-a[k]+" "+a[k+i+1]);
				}
			}
			}
		}
	}
}
					



/*import java.util.*;
public class Q2{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter inpute size");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element in aaray");
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		int sum=0;
		System.out.println("enter target element");
		int target=in.nextInt();
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length;j++){
				
		sum=sum+a[i]+a[j+1];
		if(sum>target){
			System.out.println(a[i]+ " "+a[j+1]);
		}
			}
		}
	}
}*/