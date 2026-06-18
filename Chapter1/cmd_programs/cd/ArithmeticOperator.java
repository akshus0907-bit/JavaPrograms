/*
Question 3: Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Input:
Number1 = 20
Number2 = 5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0
*/

public class ArithmeticOperator{
	public static void main(String x[]){
		
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		
		int add = a+b;
		int sub=a-b;
		int mul=a*b;
		float div=a/b;
		float mod=a%b;
		
		System.out.println("addtion is = "+add + "\nsubtraction is =" +sub + "\nmultiplication is = "+mul +"\nmodulus is =" +mod);
	}
}