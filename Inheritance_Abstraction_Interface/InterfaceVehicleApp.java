/*Question 116: Write a Java program to calculate vehicle rent using interface.
Asked In Practice Assignment
Create interface Vehicle with method calculateRent().
Implement in Bike and Car.

Bike ? ?10/km
Car ? ?25/km

Input:
Enter vehicle (1-Bike, 2-Car): 2
Enter distance: 10

Output:
Total Rent : 250*/

import java.util.*;
interface Vehicle{
 void calculateRent();
}
 class Bike implements Vehicle{
	 double distace;
	 Bike(double distace){
	 this.distace=distace;
	 }
	 public void calculateRent(){
	 double rent =distace*10;
	 System.out.println(rent);
	 }
	 }
	  class Car implements Vehicle{
	 double distace1;
	 Car(double distace1){
	 this.distace1=distace1;
	 }
	 public void calculateRent(){
	 double rent =distace1*25;
	 System.out.println(rent);
	 }
	 }
	 public class InterfaceVehicleApp{
	 public static void main(String[]args){
	 Scanner in=new Scanner(System.in);
	 System.out.println("enter choice \n1.Bike \n2.car");
	 int choice=in.nextInt();
	 Vehicle v;
	 
	 switch(choice){
	 case 1:
	 System.out.println("enter distace");
	 double distance=in.nextDouble();
	  v=new Bike(distance);
	  v.calculateRent();
	  break;
	  
	  case 2:
	  System.out.println("enter distace");
	  double distace1=in.nextDouble();
	  v=new Car(distace1);
	  v.calculateRent();
	  break;
	  
	  default:
	  System.out.println("invalid choice");
	  }
	  }
	  }
	  
	 
	 