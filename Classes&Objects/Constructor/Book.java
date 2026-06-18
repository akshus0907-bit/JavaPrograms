/*Question 3: Write a Java program to demonstrate constructor overloading using a Book class.

Description: Create Book class with bookId, bookName and price. Create one default 
constructor and one parameterized constructor. Display values initialized by both constructors.
INPUT:
(Default constructor gives default values)
Enter Book Id: 11
Enter Book Name: Java Basics
Enter Price: 450

OUTPUT:
Book from Default Constructor:
Book Id: 0
Book Name: Unknown
Price: 0

Book from Parameterized Constructor:
Book Id: 11
Book Name: Java Basics
Price: 450

EXPLANATION:
Create two constructors: public Book() { bookId=0; bookName="Unknown"; price=0;
 } and public Book(int id, String name, int p) { bookId=id; bookName=name; price=p; }. 
 Demonstrate both by creating two objects.*/

import java.util.*;
public class Book{
	private int BookId;
	private String BookName;
	private int price;
	
	Book(){
		BookId=0;
		BookName="Unknown";
		price=0;
	}
	Book(int i,String n,int p){
		BookId=i;
		BookName=n;
		price=p;
	}
	void display(){
		System.out.println("Book id="+BookId+"\nBookName="+BookName+"\nprice="+price);
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter book id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter book name");
		String n=in.nextLine();
		System.out.println("enter price");
		int p=in.nextInt();
		Book b=new Book();
		Book b1=new Book(id,n,p);
		b.display();
		b1.display();
	}
}
	
	