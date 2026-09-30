/*3. Write a Java program to illustrate method overloading with multiple methods sharing the same
name but different parameter lists.*/


class MethodOverloading{
	
		
		static void add(){
			System.out.println("without parameter :");
		}
		
		static void add(int a,int b){
			System.out.println("addition of two interger :"+(a+b));
			
		}
		static void add(double  a,double b){
			System.out.println("float addition :"+(a+b));
		}

		

		public static void main(String[]args){
			add();
			add(10,20);
			add(20.9,33.3);
		}
	}

	
		
			