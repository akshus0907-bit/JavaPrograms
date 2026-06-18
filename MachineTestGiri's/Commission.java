/*Q6. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount.*/

import java.util.*;
public class Commission{
		public static void main(String[]args){
			Scanner in=new Scanner(System.in);
			System.out.println("enter sales amount");            //take input
			int sales=in.nextInt();
			int commission;
			if(sales<5000){                              //check sales
				commission=(2*sales)/100;                    //calculate commission
				System.out.println("Commission Amount="+commission);
			}
			else if(sales>=5000 && sales<1000){
				commission=(5*sales)/100;
				System.out.println("commission Amount="+commission);
			}
			else if(sales>1000){
				commission=(10*sales)/100;
				System.out.println("commission Amount="+commission);
			}
			else {
				System.out.println("invalid input");
			}
		}
}
				
