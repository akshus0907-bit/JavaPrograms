//return the index

public class IndexChar{
	public static void main(String[]args){
		String str=new String("java");
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			System.out.println(i+" "+ch);
		}
	}
}