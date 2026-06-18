/*51 Recursive factorial LC 509*/

import java.util.*;
public class Q51{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int result=fact(n);
		System.out.println(result);
	}
	static int fact(int a){
		if(a==1){
			return 1;
		}
		int fact=a*fact(a-1);
	
		return fact;
	}
}