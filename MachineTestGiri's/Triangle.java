 //Write a program to check traingle is equilatral , isoscale or scalene. 
 import java.util.*;
 public class Triangle{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter three side of triangle");          //suppose three side are 2 2 2
		 int side1=in.nextInt();
		 int side2=in.nextInt();
		 int side3=in.nextInt();
		 
		 if(side1==side2 &&side1==side3){  
			 System.out.println("triangle is equilatral");   // op=equilatral
		 }
		 else if(side1==side2 ||side2==side3){
			 System.out.println("triangle is isoscale");
		 }
		 else{
			 System.out.println("triangle is scalene");
		 }
	 }
 }