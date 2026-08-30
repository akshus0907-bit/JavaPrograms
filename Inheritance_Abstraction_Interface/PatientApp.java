/*Question 7: Create a base class Patient with attributes name and age.
Create a child class InPatient that adds roomNumber.
Store details of 2 patients using an array of objects and display them.
Asked In Practice Assignment
Description
This assignment uses inheritance to extend patient details and stores multiple records
using an array of objects.

Input
Enter number of Patients: 2

Enter Name: Ravi
Enter Age: 45
Enter Room Number: 101

Enter Name: Meena
Enter Age: 30
Enter Room Number: 102
Output
Name: Ravi, Age: 45, Room No: 101
Name: Meena, Age: 30, Room No: 102*/
import java.util.*;
 class Patient{
	 String name;
	 int age;
	 
	 void display(){
		 System.out.println("name="+name+"\nage="+age);
	 }
 }
 class Inpatient extends Patient{
	 int roomNumber;
	 
	 void display(){
		 super.display();
		 System.out.println("room number"+roomNumber);
	 }
 }
 public class PatientApp{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter number of patient");
		 int n=in.nextInt();
		 in.nextLine();
		 
		 Inpatient p[]=new Inpatient[n];
		 for(int i=0;i<n;i++) {
			p[i] = new Inpatient();

			System.out.print("Enter Name: ");
			p[i].name = in.nextLine();

			System.out.print("Enter Age: ");
			p[i].age = in.nextInt();

			System.out.print("Enter Room Number: ");
			p[i].roomNumber = in.nextInt();

			in.nextLine();   
}
		 for(int i=0;i<n;i++){
          p[i].display();
		 }
	 }
 }	 