/*3Create a List and print only even numbers.*/

import java.util.*;
public class EvenNumber{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(4);
		list.add(2);
		list.add(7);
		
		for(int i=0;i<list.size();i++){
			if(list.get(i)%2==0){
				System.out.println(list.get(i));
			}
		}
	}
}
		
		