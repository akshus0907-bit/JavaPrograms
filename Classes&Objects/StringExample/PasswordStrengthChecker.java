/*39. Password Strength Checker
Class Name: PasswordChecker
Methods:
void setPassword(String password)
String checkStrength()
Description
Checks whether password is weak, medium, or strong.
Example
Input:"Abc@1234"
Output:"Strong Password"*/

import java.util.*;
public class PasswordStrengthChecker{
	private String Password;
	public void setPassword(String pass){
		Password=pass;
	}
	public String checkStrength(){
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		for(int i=0;i<Password.length();i++){
			char ch=Password.charAt(i);
			if(ch>='A' &&ch<='Z'){
				upper++;
			}
			else if(ch>'a'  && ch<='z'){
				lower++;
			}
			else if(ch>='0' &&ch<='9'){
				digit++;
			}
			else{
				special++;
			}
		}
		if(Password.length()>=8 &&upper>0 &&lower>0 &&digit>0 &&special>0){
			return "Strong password";
		}
		else if(Password.length()>=6){
			return "medium password";
		}
	return "weak password";
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PasswordStrengthChecker p=new PasswordStrengthChecker();
		System.out.println("enter password");
		String pas=in.nextLine();
		p.setPassword(pas);
		System.out.println(p.checkStrength());
	}
}
			
