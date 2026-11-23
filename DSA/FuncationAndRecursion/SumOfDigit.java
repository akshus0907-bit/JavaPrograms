//sum of digit

 class Sum{
	public int DigitSum(int n){
		if(n==0){
			return 0;
		}
		int sum=0;
		int rem=0;
		rem=n%10;
		sum=sum+rem;
		n=n/10;
		return sum;
		
	}
}
public class SumOfDigit{
	public static  void main(String[]args){
		Sum s=new Sum();
		
		s.DigitSum(1234);
	}
}
