/*Question 112: Write a Java program to find area of shapes using interface.
Asked In Practice Assignment
Create an interface Shape with method area().
Implement it in classes Rectangle and Triangle.
Rectangle ? area = length × breadth
Triangle ? area = 0.5 × base × height
Let the user choose the shape.

Input:
Enter choice (1-Rectangle, 2-Triangle): 2
Enter base: 10
Enter height: 5

Output:
Area of Triangle : 25.0*/

import java.util.*;
  interface Shape{
	 
	void  area();
	
 }
 class Rectangle implements Shape{
	  double length,breadth;
	  
	  Rectangle(double length,double breadth){
		  this.length=length;
		  this.breadth=breadth;
	  }
	  public void area(){
		  double area=length*breadth;
		  System.out.println("Area of rectangle="+area);
	  }
 }
class Triangle implements Shape{
	double base,height;
	
	 Triangle(double base,double height){
		 this.base=base;
		 this.height=height;
	 }
	 public void area(){
		 double area=0.5*base*height;
		 System.out.println("Area of triangle="+area);
}
}
public class InterfaceShapeApp{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		  Shape s;
		System.out.println("enter your choice \n1.Recatnge Area \n2.Triangle Area");
		int choice=in.nextInt();
		switch (choice){
			case 1:
			System.out.println("enter length ");
			 double  length=in.nextDouble();
			 
			 System.out.println("enter breadth");
			 double breadth=in.nextDouble();
			 
			  s = new Rectangle(length, breadth);
                s.area();
                break;
		
		case 2:
		System.out.println("enter base");
		double base=in.nextDouble();
		
		System.out.println("enter heigth");
		double height=in.nextDouble();
		 s=new Triangle(base,height);
		 s.area();
		 break;
	
	   default:
		System.out.println("invalid number");
	
	   }
		}
}

		 