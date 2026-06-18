/*46 Function to find GCD LC 1979*/
import java.util.*;
public class Q46{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		
		int result=gcd(a,b);
		System.out.println(result);
	}
	static int gcd(int a,int b){
		while(b!=0){
		int temp=b;
		b=a%b;
		a=temp;
		}
		 
		 return a;
	}
}