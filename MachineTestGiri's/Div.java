/*Q1. Write a program to check whether a number is divisible by 5 and 11 yes or not, using 
conditional & ternary operators. */

import java.util.*;
public class Div{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");           //n=55
		int n=in.nextInt();
		
		/*String b=(n%5==0 && n%11==0)?"number is divisible by 5 and 11" :"number is not divisible by 5 and 11";
		System.out.println(n);*/
		
		if(n%5==0 &&n%11==0){              //55%5==0  && 11%55==0
			System.out.println("number is Divisible by 5 and 11"); 
		}
		else{
			System.out.println("number is not Divisible by 5 and 11");
		}
	}
}