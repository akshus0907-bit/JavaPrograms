/*Q4. Write a java program to print this pattern.
*
**
***
****
*****
*/


import java.util.*;
class TriangleStarPattern{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter row");
		int row=in.nextInt();
		
		System.out.println("enter colum");
		int col=in.nextInt();
		
		
		for(int i=0;i<row;i++){
			for(int j=1;j<=i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}