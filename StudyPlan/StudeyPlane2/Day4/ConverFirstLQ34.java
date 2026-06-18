/*34. Convert the first character to uppercase.*/
import java.util.*;
public class ConverFirstlQ34{
	private String str;
	public void setString(String s){
		str =s;
	}
	public String getString(){
		return str;
	}
	public String converFirst(){
		String result="";
		String first=str.charAt(0);
		if(first>='a'&&first<'z'){
			result=result+(char)(first-32);
			