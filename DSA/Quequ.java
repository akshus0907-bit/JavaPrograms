//queue program using aaray

import java.util.*;
public class Quequ{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of arrya");
		int size=in.nextInt();
		
		int a[]=new int[size];
		
		
		int rear=-1;
		int front=0;
		do{
		System.out.println("1.insert \n2.delete\n3.display\n4.exit");
		
		System.out.println("enter choice");
		int choice=in.nextInt();
		
		switch(choice){
			case 1:
			
				if(rear==(a.length-1)){
					System.out.println("overflow");
				}
				else{
					System.out.println("enter value");
					int value=in.nextInt();
					
					rear=rear+1;
					a[rear]=value;
				}
				break;
				
			case 2:
			
				if((rear==-1 && front==0)||(front==(rear+1))){
					System.out.println("empty");
				}
				else{
					
					int value=a[front];
					
					front=front+1;
					System.out.println("value is delted"+value);
				}
				break;
				
			case 3:
				if((rear==-1&& front==0)|| (front==(rear+1))){
					System.out.println("empty");
				}
				else{
					for(int i=front;i<=rear;i++){
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