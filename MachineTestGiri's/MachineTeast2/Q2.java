/*Q2. Write a Java program to find all abundant numbers up to n. */
import java.util.*;
public class Q2{
    public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter number");
	int n=in.nextInt();
	
	for(int j = 1;j <= n; j++){       

            int sum = 0;

	;
	for(int i=1;i<=j/2;i++){
		if(j%i==0){   //chaek divisor 
			sum=sum+i;
		}
	}
	if(sum>j){
		System.out.println(j+"=number is abundant");
	}
	}
	}
}
		
		
			
			
	
	
