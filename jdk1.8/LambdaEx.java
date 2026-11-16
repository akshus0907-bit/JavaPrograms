//lambda expression with parathenses and return

interface ABC{
	int add(int a,int b);
}
public class LambdaEx{
	public static void main(String[]args){
		
		ABC a1=(x,y)->{
			return x+y;
			
			
		};
		int result=a1.add(10,20);
		System.out.println(result);
	}
}