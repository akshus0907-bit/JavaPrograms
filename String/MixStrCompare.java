//mixString comapre

class MixStrCompare{
	public static void main(String[]args){
		String str="java";
		String str1="java";
		
		String str3=new String("java");
		
		System.out.println(str==str1);
		System.out.println(str1==str3);
		System.out.println(str==str3);
		
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str3));
		System.out.println(str.equals(str3));
	}
}