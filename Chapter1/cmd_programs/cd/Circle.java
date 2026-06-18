/*Question 5: Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference.
Input:
Radius = 7

Output:
Diameter = 14
Area = 153.86
Circumference = 43.96

Explanation:
Diameter = 2 × radius
Area = ? × r²
Circumference = 2 × ? × r
The formulas are applied using the given radius*/


public class Circle{
	public static  void  main(String x[])
	{
		
		float r= Float.parseFloat(x[0]);
		float diameter = 2*r;
		System.out.println("Diameter of circle is = "+diameter);
		
		double area = Math.PI*r*r;
		System.out.println("Area of circle is ="+area);
		
		double circumference = 2*Math.PI*r;
		System.out.println("Circumference of circle is ="+circumference);
		
	}
}