/*7. Write a Java program to demonstrate Multiple Inheritance using Interfaces. Create two interfaces 
Printable and Showable and implement both in a single class. */

interface Printtable{
	void print();
	
}
interface Showable{
	void show();
}
 class writeable implements Printtable,Showable{
	public void print(){
		System.out.println("print something");
	}
	public void show(){
		System.out.println("show something");
	}
	void write(){
		System.out.println("write something");
	}
 }
 public class MultipleInterface{
	 public static void main(String[]args){
		writeable w=new writeable();
		 w.print();
		 w.show();
		 w.write();
	 }
 }
 