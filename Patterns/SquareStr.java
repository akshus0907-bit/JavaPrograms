/*Q5. Write a java program to print this pattern.
*****
****
***
**
*
*/
import java.util.*;
class SquareStr{
	public static void main(String[]args){
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter number of row ");
		int row=in.nextInt();
		System.out.println("enter number of colum");
		int col=in.nextInt();
		
		for(int i=1;i<row;i++){
			for(int j=i;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
