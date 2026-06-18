/*52 Recursive Fibonacci LC 509*/
import java.util.*;
public class Q52{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int result=fab(n);
		System.out.println(result);
	}
	static int fab(int n){
		
		
		if(n<=1){
			return n;
		}
		return fab(n-1)+fab(n-2);
	}
}
		