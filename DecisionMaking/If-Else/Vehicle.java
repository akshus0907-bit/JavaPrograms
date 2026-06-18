/*Question 32: An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make 
the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input : • 200 -> Value of V
• 540 -> Value of W
Output : • TW =130   FW=70
Explanation: 130+70 = 200 vehicles (70*4)+(130*2)= 540 wheels.
Input:
V = 200
W = 540

Output
TW = 130
FW = 70

Explanation:
Total vehicles = TW + FW
Total wheels = 2×TW + 4×FW

130 + 70 = 200
(130×2) + (70×4) = 260 + 280 = 540*/

import java.util.*;
public class Vehicle{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter total vehicle and total wheels");
		int vehicle=in.nextInt();
		int wheels=in.nextInt();
		
		int fw=(wheels-2*vehicle)/2;
		int tw=vehicle-fw;
		System.out.println("tw="+tw +" " +fw);
	}
}	