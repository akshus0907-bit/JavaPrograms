/*Q5. Write a java program to find the total number of notes in a given amount.  
            Enter the amount: 2528 
Expected output : 500=5 , 100=0 , 50=0 , 20=1 , 10=0 , 5=1 , 2=1 , 1=1*/

import java.util.*;
public class Q5{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		System.out.println("enter the amount");          //take input n=2528
		int n=in.nextInt();
		int notes;
		
		notes=n/500;                                         //2528/500 =5
		n=n%500;                                             
		System.out.println("500="+notes);                    //print notes of 500
		
		notes=n/100;                                              //2528/100
		n=n%100;
		System.out.println("100="+notes);                           //0
		
		notes=n/50;                                                 
		n=n%50;
		System.out.println("50="+notes);                            
		
		notes=n/20;
		n=n%10;
		System.out.println("20="+notes);
		
		notes=n/10;
		n=n%10;
		System.out.println("10="+notes);
		
		notes=n/5;
		n=n%5;
		System.out.println("5="+notes);
		
		notes=n/2;
		n=n%2;
		System.out.println("2="+notes);
		
		notes =n/1;
		n=n%1;
		System.out.println("1="+notes);
	}
}
			
		
		
		
		
		
		