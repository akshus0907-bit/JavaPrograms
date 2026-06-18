/*Question 5: Write a Java program to create a Rectangle class and calculate area using constructor.

Description: Create Rectangle class with length and width. Initialize values using 
constructor and calculate area using formula length × width.
INPUT:
Enter Length: 10
Enter Width: 5

OUTPUT:
Area of Rectangle is: 50

EXPLANATION:
Create Rectangle class with fields length and width. Use constructor public 
Rectangle(int length, int width) to initialize values. Calculate area as length * width. 
Create method to display area. Create object new Rectangle(10, 5) and display area.*/

import java.util.*;
public class Rectangle{
	private int length;
	private int width;
	
	Rectangle(int l,int w){
		length=l;
		width=w;
	}
	void displayArea(){
		int Area=length*width;
		System.out.println("Area of rectangle="+Area);
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter length");
		int l=in.nextInt();
		System.out.println("enter width");
		int w=in.nextInt();
		Rectangle r=new Rectangle(l,w);
		r.displayArea();
	}
}
