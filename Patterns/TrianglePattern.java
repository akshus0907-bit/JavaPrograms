/*Q6. Write a java program to print this pattern.
        *
      * *
    * * *
  * * * *
* * * * *


*/


import java.util.*;
public class TrianglePattern{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter number of row");
		int row=in.nextInt();
		
		
		
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(j<=row-i){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
				
			}
			System.out.println();
		
		}
	}
}