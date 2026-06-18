/*Question 10: Write a Java program to calculate the area of an equilateral triangle.
Input : Side = 6
Output : Area = 15.59
Explanation : Area is calculated using the formula for equilateral triangles.
formula = (root 3/4)*side*side*/

public class EquilateralTriangle{
	public static void main(String x[]){
		int side = Integer.parseInt(x[0]);
		double area=(Math.sqrt(3)/4)*(side*side);
		System.out.println("area of equilateral triangle is ="+area);
	}
}