/*Count uppercase and lowercase letters separately.*/

import java.util.*;
public class CountLUQ32{
	private String str;
	public void setString(String s){
		str=s;
	}
	public String getString(){
		return str;
	}
	public void countLU(){
		int lower=0;
		int upper=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='a' &&ch<='z'){
				lower++;
			}
			else if(ch>='A' &&ch<='Z'){
				upper++;
			}
			else{
				System.out.println("invalid");
			}
		}
		System.out.println("lower="+lower + "\nupper "+upper);
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		CountLUQ32 c=new CountLUQ32();
		System.out.println("enter string");
		String s=in.nextLine();
		c.setString(s);
		c.countLU();
	}
}

			