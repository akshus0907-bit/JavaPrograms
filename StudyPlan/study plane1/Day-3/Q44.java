/*44 Function to calculate factorial LC 172*/
import java.util.*;
public class Q44{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int a=in.nextInt();
		int result=fact(a);
		System.out.println(result);
	}
	static int fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
}