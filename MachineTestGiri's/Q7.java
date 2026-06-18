/*Q7. Mobile plan billing system: 
• Input: Minutes used in a month 
• Logic: 
o Up to 100 mins → Base ₹199 
o 101–300 mins → ₹199 + ₹1/min for extra 
o 301–500 mins → ₹199 + ₹1.5/min for extra 
o Above 500 mins → ₹199 + ₹2/min for extra 
• Output: Total monthly bill. */

import java.util.*;
public class Q7{
	public static void main(String[]args){
		Scanner in=new Scanner (System.in);
		System.out.println("enter minutes used in month");   //take input mins=200
		int mins=in.nextInt();
		double base=199;                                      //basic rs for 100 mins
		
		if(mins==100){
			System.out.println("total monthly billing="+base);
		}
		else if(mins>=101 && mins<=300){
			base=base+(mins-100)*1;
			System.out.println("total monthly billing="+base); // this condition is executed 199+1=200
		}
		else if(mins>301 &&mins<500){
			base=base+(mins-100)*1.5;
			System.out.println("total monthly billing="+base);
		}
		else if(mins>500){
			base=base+(mins-100)*2;
			System.out.println("total monthly billing="+base);
		}
		else{
			System.out.println("invalid input");
		}
	}
}