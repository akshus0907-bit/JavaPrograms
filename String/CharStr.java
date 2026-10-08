//Specific part of char into str

class CharStr{
	public static void main(String[]args){
		
		char ch[]=new char[]{'a','b','c','d','e','f'};
		
		String str=new String(ch,1,3);
		System.out.println(str);
		
	}
}