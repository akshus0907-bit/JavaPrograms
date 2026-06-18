/*Question 6: Write a Java program to convert length from centimeter into meter and kilometer.'
Input:
Centimeter = 150
Output:
Meter = 1.5
Kilometer = 0.0015
Explanation:
1 meter = 100 centimeters
1 kilometer = 100000 centimeters
The given value is converted using standard unit conversion formulas.*/


public class ConvertLength{
	public static void main(String x[]){
		float c = Float.parseFloat(x[0]);
		float meter = c/100;
		System.out.println("lenght in meter is = "+meter);
		float kilometer = c/100000;
		System.out.println("lenght in kilometer is ="+kilometer);
		
		
	}
	
	
}