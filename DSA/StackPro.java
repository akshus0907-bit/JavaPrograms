//stack program

import java.util.*;

public class StackPro{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		 System.out.println("enter size of array");
		 int size=in.nextInt();
		 
		 int a[]=new int[size];
		 System.out.println("enter element in aaray");
		 for(int i=0;i<a.length;i++){
			 a[i]=in.nextInt();
		 }
		 int  top=-1;
		 
		 do{
			 
			 System.out.println("1.push element\n2.pop element\n3.display element\n4.exit");
			 
			 System.out.println("enter your choice");
			 int choice=in.nextInt();
			 
			 switch(choice){
				 
				case 1:
					if(top==a.length-1){
						System.out.println("overflow");
					}
					else{
						top=top+1;
						System.out.println("enter elemetn");
						int value=in.nextInt();
						a[top]=value;
					}
					break;
					
				case 2:
						if(top==-1){
							System.out.println("underflow");
						}
						else{
							int value=a[top];
							
							System.out.println("value is poped"+value);
							top=top-1;
						}
						break;
						
				case 3:
						if(top==-1){
							System.out.println("underflow");
						}
						else{
							for(int i=top;i<a.length;i++){
								System.out.println(a[i]);
							}
						}
						break;
						
						
				case 4:
							System.exit(0);
						
						   break;
						
						
				default:
							System.out.println("wrong choice");
			 }
			 
		 }while(true);
	}
}