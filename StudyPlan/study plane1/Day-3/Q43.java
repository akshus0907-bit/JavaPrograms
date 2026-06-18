/*43 Function to check prime number LC 204*/

import java.util.*;
public class Q43{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int a=in.nextInt();
		
		String result=prime(a);
		System.out.println(result);
	}
	static String prime(int n){
		if(n<=1){
			return "not prime";
		}
		for(int i=2;i<n;i++){
			if(n%i==0){
				return "not prime";
			}
		}
		return "prime";
	}
}