/*Q9. Write a menu-driven program in java using switch case.  
1. Check Number is positive , negative or zero.  
2. Check Number is even or odd.  
3. Find max number using 3 number. */

import java.util.*;
public class MenuDriven{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter choice\n1.check +ve,-ve,zero \n2.check even,odd\n3.check max");//enter choice
		int choice=in.nextInt();
		System.out.println("enter number");//take input
		int n=in.nextInt();
		
		
		
		
		 switch(choice){                                     
			 case 1:                                           //choice=1 case 1 executed
			 if(n>0){
				 System.out.println("number is positive");
			 }
			 else if(n<0){
				 System.out.println("number is negative");
			 }
			 else{
				 System.out.println("number is equal to zero"); 
			 }
			 break;                                                //break case 1
			 
			 case 2:                                             //choice=2 case 2 exectued
			 if(n%2==0){
				 System.out.println("number is even");
			 }
			 else{
				 System.out.println("number is odd");
			 }
			 break;                                           //break case 2
			 
			 
			 case 3:                                            //choise =3 case 3
			 System.out.println("enter three number");             //take 3 number as input
			 int a=in.nextInt();
			 int b=in.nextInt();
			 int c=in.nextInt();
			 
			 
			 
			 if(a>b &&a>c){
				 System.out.println("max="+a);
			 }
			 else if(b>c){
				 System.out.println("max="+b);
			 }
			 else{
				 System.out.println("max="+c);
			 }
			 break;
			 default:
			 System.out.println("invalid number");                  //default if input is wrong
		 }
	}
}