//method overloading 


import java.util.*;

class SumApp{
	public void sum(int a,int b){
		System.out.println(a+b);
	}
	public void sum(float a,float b){
		System.out.println(a+b);
	}
}
public class Sum{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		SumApp s=new SumApp();
		
		System.out.println("enter two number");
		float a=in.nextFloat();
		float b=in.nextFloat();
		
		s.sum(a,b);
	}
}