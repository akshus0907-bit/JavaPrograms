/*Question 7: Write a Java program to convert temperature from Fahrenheit to Celsius.
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F ? 32) × 5 / 9
Applying the formula gives the Celsius temperature.*/

public class ConvertTemperatureFtoC{
	public static void main (String x[]){
		float a=Float.parseFloat(x[0]);
		float celsius = ((a+32)*5/9);
		System.out.println("temperature in celsius is= "+celsius);
		
	}
}
