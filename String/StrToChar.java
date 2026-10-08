//String to char

public class StrToChar{
	public static void main(String[]args){
		String str=new String("java");
	    for(int i=0;i<str.length();i++){
			char ch[]=str.toCharArray();
			System.out.println(ch[i]);
		}
	}
}