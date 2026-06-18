/*Q4.Take a three-digit number and print whether the middle digit is greater than the sum of the 
first and last digits using the conditional & ternary operator. 
 
Example: 
• Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater 
• Input: num = 853 → Middle digit 5 vs (8+3)=11 → Not Greater */

import java.util.*;
public class Q4{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		int last=n%10;              //separeted last digit 123%10 =3
		int middle=(n/10)%10;        //seperated middle digit 123/10=12  12%10=2
		int first=n/100;             //giive last digit 123/100=1
		
		int sum=last+first;          //print sum 3+1=5
		
		/*String s=(middle==sum)?"middle digit is equal":(middle>sum)?"middle digit is greater":"middle digit is small";
		System.out.println(s);*/
		
		if(middle==sum){                                              //check sum  and middle number 2==5 =not 
			System.out.println("middle number is equal to sum");
		}
		else if(middle >sum){
			System.out.println("middle number is greater than sum");
		}
		else{
			System.out.println("middle number is samll");                 //this statement is printed
		}
	}
}
		
		