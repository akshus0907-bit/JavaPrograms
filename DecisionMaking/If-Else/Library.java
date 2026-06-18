/*Question 44: Calculate fine for library book return:
? Input: Number of days late
? Logic:
? Up to 5 days ? ?2/day
? 6–10 days ? ?3/day
? 11–30 days ? ?5/day
? More than 30 days ? Membership canceled + ?500 fine
? Output: Total fine + membership status.
Input
Days Late = 12

Logic
Up to 5 days ? ?2 per day
6–10 days ? ?3 per day
11–30 days ? ?5 per day
More than 30 days ? ?500 fine + Membership canceled

Output
Total Fine = ?60
Membership Status = Active

Explanation
12 days falls in 11–30 range.
Fine = 12 × 5 = 60*/

import java.util.*;
public class Library{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("days Late");
		int days=in.nextInt();
		int Totalfine=0;
		if(days<5){
			Totalfine=days*2;
			System.out.println(Totalfine);
			System.out.println("membership Acttive");
		}
		else if(days>=6 &&days<=10){
			Totalfine=days*3;
			System.out.println(Totalfine);
			System.out.println("membership Acttive");
		}
		else if(days>=11 &&days<=30){
			Totalfine=days*5;
			System.out.println(Totalfine);
			System.out.println("membership Acttive");
		}
		else{
			System.out.println("500 fine \n membership canceled");
		}
	}
}
		
			