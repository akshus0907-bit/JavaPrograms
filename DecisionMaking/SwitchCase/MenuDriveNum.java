/*9. Create a menu-driven program using switch that repeatedly allows the user to:
 1. Reverse Number
 2. Sum of Digits
 3. Check Prime
 4. Check Palindrome
 5. Check Armstrong
 6. Exit
 Continue displaying the menu until the user selects Exit*/
 
 import java.util.*;
 public class MenuDriveNum{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter number");
		 int n=in.nextInt();
		
		do{
			
			
		System.out.println("1.Reverse Number \n2.Sum of Digits\n3.Check Prime\n4.check Palindrome\n5.check Armstrong \n6.exit");
			
			System.out.println("enter your choice");
			 int choice=in.nextInt();
			 int rev=0;
			
			 switch(choice){
			 
			 case 1:
			int  temp=n;
			    while(temp>0){
			      int digit=temp%10;
				  rev=rev*10+digit;
				  temp=temp/10;
				  
				}
				System.out.println("reverse number :"+rev);
				  break;
				  
			 case 2:
			 int temp1=n;
			   int sum=0;
			    while(temp1>0){
					
					
					int digit=temp1%10;
					sum=sum+digit;
					temp1=temp1/10;
				}
				System.out.println("sum of digti :"+sum);
				break;
				
			 case 3: 
       int temp3; 
    for(int i=1;i<=temp3;i++){ 

        boolean prime=true;

        if(temp3%i==0){

            prime=false;
            break;
        }

        if(prime){
            System.out.println("number is prime");
        }
    }

    break;
			 
		  
		 
					
			 }	 
		}while(true);
	 }
 }