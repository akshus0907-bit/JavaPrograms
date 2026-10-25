//Remove duplicate elements using HashSet


import java.util.*;
public class RemoveDuplicate{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		
		
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(30);
		al.add(20);
		
		
		HashSet<Integer>hs=new HashSet<>();
		
		for(int i=0;i<al.size();i++){
			hs.add(al.get(i));
		}
		System.out.println(hs);
	}
}