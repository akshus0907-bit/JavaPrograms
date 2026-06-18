/*41 Function to add two numbers LC 2235*/

import java.util.*;
public class Q41{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		  
		  int result=add(a,b);
		  System.out.println(result);
	}
	static int  add(int a,int b){
		int ans=a+b;
		return ans;
	}
}
