/*58 Recursive GCD LC 1979*/	
import java.util.*;
public class Q58{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		int result=gcd(a,b);
		System.out.println(result);
	}
	static int gcd(int a,int b){
		if(b==0){
			return a;
		}
		return gcd(b,a%b);
	}
}