/*4. Write a Java program to create a `Calculator` class with `add()`, `subtract()`, `multiply()`, and
`divide()` methods.*/ 

 class Calculator{
	int add(int a,int b){
		return a+b;
	}
	double  subtract(double a,double b){
		return a-b;
	}
	int multiply(int a,int b){
		return a*b;
	}
	int divide(int a,int b){
		return a/b;
	}
	public static void main(String[]args){
		
		Calculator c=new Calculator();
		
		System.out.println("Addition is :"+ c.add(10,20));
		System.out.println("subtract is :"+ c.subtract(20,30));
		
		System.out.println("multiplication is :"+ c.multiply(2,3));
		System.out.println("divide is :"+ c.divide(6,3));
	}
}