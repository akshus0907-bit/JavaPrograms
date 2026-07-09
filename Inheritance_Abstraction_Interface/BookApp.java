/*Question 6: Create a base class Book with attributes title and price.
Create a child class EBook that adds fileSize.
Store details of 3 EBooks using an array of objects and display all details.
Asked In Practice Assignment
Description
This program demonstrates inheritance with an array of objects.
The child class EBook extends Book, and multiple objects are stored in an array.

Input
Enter number of EBooks: 3

Enter Title: Java Basics
Enter Price: 300
Enter File Size: 5

Enter Title: Python Guide
Enter Price: 400
Enter File Size: 8

Enter Title: C Programming
Enter Price: 250
Enter File Size: 6
Output
Title: Java Basics, Price: 300, File Size: 5MB
Title: Python Guide, Price: 400, File Size: 8MB
Title: C Programming, Price: 250, File Size: 6MB*/

import java.util.*;
class Book{
 String title;
 int price;
 
 }
 class EBook extends Book{
  int fileSize;
  
  }
  public class BookApp{
  public static void main(String[]args){
  Scanner  in=new Scanner (System.in);
  System.out.println("enter number of Ebook ");
   int n=in.nextInt();
   in.nextLine();
   EBook e[]=new EBook[n];
   for(int i=0;i<n;i++){
   e[i]=new EBook();
    System.out.println("enter title");
	e[i].title=in.nextLine();
	
	System.out.println("enter price");
	e[i].price=in.nextInt();
	in.nextLine();
	
	System.out.println("enter fileSize");
	e[i].fileSize=in.nextInt();
	in.nextLine();
	}
	//display book 
	for(int i=0;i<n;i++){
	System.out.println("Title: " + e[i].title +
                   ", Price: " + e[i].price +
                   ", File Size: " + e[i].fileSize + "MB");
	}
	}
	}
	