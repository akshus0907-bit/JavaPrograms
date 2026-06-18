/*Question 61: Create a Java program to simulate a basic food ordering system using switch:
1: Burger
2: Pizza
3: Pasta
4: Sandwich
Display the price for the selected item.
Input:
Choice = 1

Output:
Burger - ?120

Explanation:
Case 1 represents Burger and prints its price.

Input:
Choice = 5

Output:
Invalid Selection

Explanation:
Since 5 is not in menu, default case executes.*/

import java.util.*;
public class FoodOrdering{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("1.burger\n2.pizza\n3.pasta\n4.sandwich");
		System.out.println("enter a choice");
		int choice=in.nextInt();
		switch(choice){
			case 1:
			System.out.println("burger=$120");
			break;
			case 2:
			System.out.println("pizza=$150");
			break;
			case 3:
			System.out.println("pasta=$200");
			break;
			case 4:
			System.out.println("sandwich=$250");
			break;
			default:
			System.out.println("incalid input");
		}
	}
}
			