/*38. Validate Email
Class Name: EmailValidation
Methods:
void setEmail(String email)
boolean isValidEmail()
Example
Input:"abc@gmail.com"
Output:true*/
import java.util.*;
public class EmailValidation{
	private String Email;
	
	public setEmail(String e){
		Email=e;
	}
	public boolean isValidEmail(){
		int at=Email.indexOf('@');
		int dot=Email.indexOf('.');
		if(at>0 &&dot>at+1 &&dot< Email.length()-1){
			return true;
		}
		return false;
	}
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		EmailValidation e=new EmailValidation();
		System.out.println("enter email");
		String em=in.nextLine();
		e.setEmail(em);
		System.out.println(e.isValidEmail());
	}
}
