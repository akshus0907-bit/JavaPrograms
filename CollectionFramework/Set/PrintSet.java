//print set
import java.util.*;
class PrintSet{
	public static void main(String[]args){
		Set<Integer>s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		
		System.out.println(s);
	}
}