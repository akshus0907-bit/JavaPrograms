/*Question 60: Write a program using switch that takes a number (1-4) and displays a season:
1: Spring
2: Summer
3: Autumn
4: Winter
Input:
Number = 2

Output
Summer

Explanation:
Switch matches case 2 and prints “Summer"*/

import java.util.*;
public class Season{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int number=in.nextInt();
		switch(number){
			case 1:
			System.out.println("spring");
			break;
			case 2:
			System.out.println("Summer");
			break;
			case 3:
			System.out.println("Autumn");
			break;
			case 4:
			System.out.println("Winter");
			break;
			default:
			System.out.println("invalid input");
		}
	}
}
			