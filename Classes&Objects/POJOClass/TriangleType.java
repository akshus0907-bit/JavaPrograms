/*Question 32: Write a Java program to implement a Triangle Validator using POJO class.
Create a POJO class Triangle with variables side1, side2, and side3.
Determine the triangle type:
- All sides equal => Equilateral
- Two sides equal => Isosceles
- All sides different => Scalene
Input:
Enter Side1 : 5
Enter Side2 : 5
Enter Side3 : 8

Output:
Triangle Type : Isosceles

Explanation:
A POJO class Triangle has private fields: side1, side2, side3.
Setters accept user input. Getters are used in the type-checking logic.
Conditions:
- if (side1 == side2 && side2 == side3) => Equilateral
- else if (side1 == side2 || side2 == side3 || side1 == side3) => Isosceles
- else => Scalene
Since side1 = 5 and side2 = 5 (two sides equal), the type is Isosceles.
side3 = 8 is different from side1 and side2.
This shows conditional logic applied to POJO class data.*/

import java.util.*;
public class TriangleType{
	private double Side1;
	private double Side2;
	private double Side3;
	
	public void setSide1(double s1){
		Side1=s1;
	}
	
	public void setSide2(double s2){
		Side2=s2;
	}

	public void setSide3(double s3){
		Side3=s3;
	}
	
	public double getSide1(){
		return Side1;
	}
	public double getSide2(){
		return Side2;
	}
	public double getSide3(){
		return Side3;
	}
	public String getType(){
		if(getSide1()==getSide2()&& getSide2()==getSide3()){
			return "Equilateral";
		}
		else if(getSide1()==getSide2()||getSide2()==getSide3()||getSide1()==getSide3()){
			return "Isosceles";
		}
		else{
			return "Scalene";
		}
	}
	public static void main(String[]args){
		TriangleType t=new TriangleType();
		Scanner in=new Scanner(System.in);
		System.out.println("enter side1");
		double Side1=in.nextDouble();
		System.out.println("enter side2");
		double Side2=in.nextDouble();
		System.out.println("enter side3");
		double Side3=in.nextDouble();
		t.setSide1(Side1);
		t.setSide2(Side2);
		t.setSide3(Side3);
		System.out.println("---------------------------------------");
		System.out.println("Triangle Type="+t.getType());
	}
}
	

