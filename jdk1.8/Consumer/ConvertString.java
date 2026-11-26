//convert string into upper case

import java.util.function.*;
public class ConvertString{
	public static void main(String[]args){
		
			
			((Consumer<String >)(String s)->System.out.println(s.toUpperCase())).accept("abc");
	}
}