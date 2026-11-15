import java.util.*;
public class MissingNumber{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size=in.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter element");
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
		
		int n=a.length+1;
		
		int sum=n*(n+1)/2;
		int asum=0;
		
		for(int i=0;i<size;i++){
			asum=asum+a[i];
		}
		
		int missing=sum-asum;
		
		System.out.println("missing number is ="+missing);
		
	}
}                        