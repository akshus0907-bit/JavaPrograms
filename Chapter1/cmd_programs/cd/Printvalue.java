/*Question 2: Write a Java program to input all basic data types (int, float, double, char, boolean) and print their values.
Input:
int = 10
float = 5.5
double = 99.99
char = A
boolean = true

Output:
10
5.5
99.99
A
true*/

public class Printvalue{
	public static void main(String x[]){
		int a= Integer.parseInt(x[0]);
		float b=Float.parseFloat(x[1]);
		double c=Double.parseDouble(x[2]);
		char d=x[3].charAt(0);// char sathi x[3] aani charAt 0 mahnje 0 index varcha numner
		boolean e=Boolean.parseBoolean(x[4]);
		System.out.println("integer ="+a+ "float = "+b+"double = "+c+"char = "+d+"boolean = "+e);
		
	}
}