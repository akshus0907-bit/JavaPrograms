/*48 Function to check Armstrong number LC 1134*/

import java.util.*;
public class Q48{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int a=in.nextInt();
		
		String result=armstrong(a);
		System.out.println(result);
	}
	static String armstrong(int a){
		int temp=a;
		int sum=0;
		while(a>0){
		int r=a%10;
		sum=sum+(r*r*r);
		a=a/10;
	}
	if(sum==temp){
		return "armstrong";
	}
	else{
		return "not armstrong";
	}
	}
}
		
	