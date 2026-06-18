/*Question 13: Write a Java program to calculate compound interest.
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T * P
After calculation, the compound interest is 420.*/

public class CompoundInterest{
	public static void main(String x[]){
		int principal=Integer.parseInt(x[0]);
		int rate=Integer.parseInt(x[1]);
		int time=Integer.parseInt(x[2]);
		double Amount=principal*Math.pow((1+rate/100.0),time);
		double CI= Amount-principal;
		//principal * Math.pow((1+(rate/100),time)--->Amount--->Amount-principal-->Interest
		System.out.println("compound interest is ="+CI);
	}
}