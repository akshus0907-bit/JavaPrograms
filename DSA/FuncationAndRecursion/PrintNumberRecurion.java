//print number from 1 to n 

 class NumberApp{
	
		
		public void PrintNumber(int n){
			if(n==0){
				return;

			}
			PrintNumber(n-1);
			System.out.println(n);
		}
	
}

public class PrintNumberRecurion{
	public static void main(String[]args){
		NumberApp a=new NumberApp();
		a.PrintNumber(5);
	}
}