/*Question 9: Write a Java program to enter two angles of a triangle and find the third angle.
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180°.
Third Angle = 180 - (Angle1 + Angle2).*/

public class Triangle{
	public static void main(String x[]){
		int Angle1=Integer.parseInt(x[0]);
		int Angle2=Integer.parseInt(x[1]);
		
		int ThirdAngle=180-(Angle1 + Angle2);
		System.out.println("Third angle of a triangle is ="+ThirdAngle);
	}
}