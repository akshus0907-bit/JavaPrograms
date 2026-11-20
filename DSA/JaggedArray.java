//jagged array

import java.util.*;
public class JaggedArray{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		int a[][]=new int[3][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[2];
		
		System.out.println("enter value in arrya");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=in.nextInt();
			}
		}
		
		System.out.println("display the matrix");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
			System.out.println("\n");
		}
	}
}