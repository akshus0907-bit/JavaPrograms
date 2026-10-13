/*Q33. Write a java program to print this pattern.
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/

class NumberPatternQ33{
	public static void main(String[]args){
		int count=0;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(count+j );
				
			}
			count++;
			
			
			System.out.println();
		}
	}
}