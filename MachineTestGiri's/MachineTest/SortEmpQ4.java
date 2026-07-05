 
/* 
Q4. A company stores employee names. 
     Find all names that satisfy the following conditions: 
• Starts with a vowel  
• Ends with a consonant  
• Contains at least two vowels  
     Print all matching names along with total count. 
     Explanation - Comparison should be case-insensitive. 
     Input - Enter number of employees: 5 
     Names: Amit  Omkar  Eesha  Aniket  Uday 
     Output - Matching Names 
Amit 
Aniket 

     Total = 2*/
	 
	 import java.util.*;
	 public class SortEmpQ4{
		 String name;
		  public void SetName(String n){
			  name =n;
		  }
		  public String getname(){
			  return name;
		  }
		  void display(){
			 
			  System.out.println("matchine name"+getname());
		  }
	 class Employee{
		 public static void main(String[]args){
			 Scanner in=new Scanner(System.in);
			 SortEmpQ4 s=new SortEmpQ4[]
			 System.out.println("enter number of employee");
			 int n=in.nextInt();
			 for(int i=0;i<n.length;i++){
				 s[i]=new s[name];
			 }
			 
			 s.display();
		 }
	 }
	 
	 }
			 
		 
		 