//function interface

interface ABC{
	void show();
}

public class FunctionalInterface{
	public static void main(String[]args){
		ABC a=new ABC(){
			public void show(){
				System.out.println("i am interface show method");
			}
		};
		a.show();
	}
}