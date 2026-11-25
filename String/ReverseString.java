//reverse string using two pointer
public class ReverseString{
	public static void main(String[]args){
		String s="hello";
		
		char ch[]=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		while(start<end){
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			
			start++;
			end--;
		}
		System.out.println(ch);
	}
}