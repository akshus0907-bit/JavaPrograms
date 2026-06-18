/*Question 41: Classify temperature reading:
? Input: Temperature in Celsius
? Logic:
? <0 ? Freezing
? 0–20 ? Cold
? 21–35 ? Warm
? 35 ? Hot
? Output: Display weather type.
Input:
Temperature = 15°C

Output:
Cold

Explanation:
Temp < 0 ? Freezing
0–20 ? Cold
21–35 ? Warm
35 ? Hot*/

import java.util.*;
public class Temperature{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter temperature ");
		int temp=in.nextInt();
		if(temp<0){
			System.out.println("Freezing");
		}
		else if(temp>=0&&temp<=20){
			System.out.println("cold");
		}
		else if(temp>20 && temp<35){
			System.out.println("warm");
		}else{
			System.out.println("hot");
		}
	}
}