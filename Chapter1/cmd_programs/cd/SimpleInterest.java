/*Question 12: Write a Java program to calculate simple interest.
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal × Rate × Time) / 100
Applying the formula gives 100.*/

public class SimpleInterest{
	public static void main(String x[]){
		
		float p = Float.parseFloat(x[0]);
		float r = Float.parseFloat(x[1]);
		float t= Float.parseFloat(x[2]);
		float  SI= (p*r*t)/100;
		System.out.println("Simple interest is = "+SI);
	}
}