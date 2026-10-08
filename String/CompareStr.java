//create string and compare it using ==

class CompareStr{
	public static void main(String[]args){
		String str="java";
		String str1="java";


		String str2=new String("java");
		String str3=new String("java");
		
		System.out.println(str==str1);
		System.out.println(str2==str3);
	}
}
