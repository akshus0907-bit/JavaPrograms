/*Q3. Write a java program to Check Number Is Spy Number or Not without using loop.  
 
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product 
of all digits. 
     Input : 1412 
     Output : Spy Number*/
	 
	import java.util.*;
	 public class SpyNo{
		 public static void main(String[]args){
			 Scanner in=new Scanner(System.in);
			 System.out.println("enter number");
			 int n=in.nextInt();
			
			 int r;
			 int sum=0;
			 int product=1;
			 if(n==0){
				 System.out.println("spy number");
			 }
			//while(n>0){
				 r=n%10;   //separed last numeber n=1412   r=2
				 sum=sum+r;      //  printed sum=0+2
				 product =product*r;  //product=1*2=2
				 n=n/10;                  //n=1412/10=141 remover last digit 
				 
				 r=n%10;
				 sum=sum+r;
				 product =product*r;
				 n=n/10;
				 
				 r=n%10;
				 sum=sum+r;
				 product =product*r;
				 n=n/10;
				 
				 r=n%10;
				 sum=sum+r;
				 product =product*r;
				 n=n/10;
			 
			 if(sum==product){
				 System.out.println("number is spy number");
			 }
			 else if(sum!=product)
			 {
				 System.out.println("number is not spy number");
			 }
			 else{
				 System.out.println("invalid input");
			 }
			 
		 }
	 }
	 
			 
				 