/*50 Function returning largest of three numbers*/

import java.util.*;
public class Q50{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter three number");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int result=max(a,b,c);
		System.out.println(result);
	}
	static int max(int a,int b,int c){
		if(a>=b && a>=c){
			return a;
		}
		else if(b>=a && b>=c){
			return b;
		}
		else{
			return c;
		}
	}
}