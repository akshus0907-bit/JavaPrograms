/*42 Function to swap two numbers —*/

import java.util.*;
public class Q42{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter two number");
		int a=in.nextInt();
		int b=in.nextInt();
		
		swap(a,b);
	}
	static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+ " " +b);
	}
}