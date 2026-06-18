/*Question 8: Write a Java program to convert temperature from Celsius to Fahrenheit.
Input:
Celsius = 37

Output:
Fahrenheit = 98.6

Explanation:
The formula used is:
F = (C × 9 / 5) + 32
The Celsius value is converted into Fahrenheit using this formula.*/

public class ConvertTemperatureCtoF{
	public static void main(String x[]){
		float c=Float.parseFloat(x[0]);
		float fahrenheit=(c*9/5)+32;
		System.out.println("Temperature in fehrenheit is ="+fahrenheit);
	}
}