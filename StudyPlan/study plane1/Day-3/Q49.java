/*49 Function to print Fibonacci series LC 509*/
import java.util.*;
public class Q49{
	public static  void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		fibonacci(n);
	}
	static void fibonacci(int n){
		int a=0;
		int b=1;
		System.out.println(a+ "\n"+b);
		for(int i=3;i<n;i++){
			int c=a+b;
			System.out.println(c+ " ");
		 a=b;
		 b=c;
		}
	}
}