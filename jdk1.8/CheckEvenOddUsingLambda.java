//check even and odd number using funcational interface

interface EvenOdd{
	void Check(int a);
}
public class CheckEvenOddUsingLambda{
	public static void main(String[]args){
		EvenOdd e=(x)->{
			if(x%2==0){
				System.out.println("even ");
			}
			else{
				System.out.println("odd");
			}
			
		};
		
		e.Check(10);
	}
}