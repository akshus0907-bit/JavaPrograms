/*5. Display the Prime Numbers, Non-Prime Numbers, and the Final Merged Array.  
Do not use Java Collections or built-in sorting methods. Implement the sorting logic manually. 
Input - Enter the size of array - 8 
            Enter the array elements - 15 7 11 20 13 4 17 9 
Output - Prime Numbers : 7 11 13 17 
  Non Prime Numbers : 20 15 9 4 
  Final Array : 7 11 13 17 20 15 9 4*/
  
  import java.util.*;
  public class PrimeNumberQ5{
	  public static void main(String[]args){
		  Scanner in=new Scanner(System.in);
		  System.out.println("enter size os aaray");
		  int n=in.nextInt();
		  System.out.println("enter element");
		  int a[]=new int[n];
		  for(int i=0;i<n.length;i++){
			  a[i]=in.nextInt();
		  }
		  int count=0;
	  for(int i=0;i<a.length;i++){
		  if(a[i]%2==0){
			  count++;
		  }
		  
	  }
	  if(count==1){
		  System.out.println("number is prime");
	  }
		  
			  