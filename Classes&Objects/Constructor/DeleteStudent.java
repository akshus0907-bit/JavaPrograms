/*Question 16: Write a Java program to delete a student record from an array using constructor objects.

Description: Create Student class with rollNo, name and percentage. Store student objects.
 Accept roll number to delete and remove that record (shift array).
INPUT:
Students:
1 Ravi 70
2 Kiran 65
3 Om 80

Enter roll to delete: 2

OUTPUT:
Remaining Students:
1 Ravi 70
3 Om 80

EXPLANATION:
Create Student class with rollNo, name, percentage. Store students in array using constructor. 
Accept roll number to delete. Find matching student in array. 
Shift remaining elements forward (remove element). Display remaining students without deleted record.*/
import java.util.*;
public class DeleteStudent{
	private int RollNo;
	private String Name;
	private int Percentage;
	
	DeleteStudent(int r,String n,int p){
		RollNo=r;
		Name=n;
		Percentage=p;
	}
	public int getRollNo(){
		return RollNo;
	}
	public String getName(){
		return Name;
	}
	public int getPercentage(){
		return Percentage;
		
	}
	public class StudentApp{
		public static void main(String[]args){
			Scanner in=new Scanner(System.in);
			DeleteStudent d[]=new DeleteStudent[3];
			System.out.println("enter student details");
			for(int i=0;i<3;i++){
				System.out.println("enter roll no , name and percentage");
				int rollno=in.nextInt();
				String name=in.next();
				int percentage=in.nextInt();
				
				d[i]=new DeleteStudent(rollno,name ,percentage);
			}
			System.out.println("enter roll number to delete");
			int key=in.nextInt();
			int pos=-1;
			for(int i=0;i<2;i++){
				s[i].getRollNo==key){
					pos=i;
					break;
				}
			}
			if(pos!=-1){
				for(int i=0;i<2;i++){
					s[i]=s[i+1];
				}
				System.out.println("remaining student");
				
				
			
