/*5. Write a Java program using an Abstract class. Create an abstract class Shape with an abstract 
method area(), and implement it in a Circle class. */

import java.util.*;
abstract class  Shape{
	void area(){
	}
}
class Circle extends  Shape{
	
	public void area(){
		Scanner in=new Scanner(System.in);
	System.out.println("enter radius");
		double  r=in.nextDouble();
        double area=3.14*r*r;
     System.out.println(area);
	}
}
public class AbstractionShap{
	public static void main(String[]args){
		
		Shape s=new Circle();
		
		
	     s.area();
	}
}