/*2. Write a Java program that demonstrates string immutability and the difference between string
constant pool references and heap allocations (== vs .equals()).*/

class DemoStr{
	public static void main(String[]args){
		
		// String constant pool
		String str1="java";
		String str2="java";
		
		System.out.println( "string consatent pool="+(str1==str2));
		System.out.println("str1.equals(str2)="+ str1.equals(str2));
		
		
		//String using new
		
		String str3=new String("java");
		String str4=new String("java");
		
		
		System.out.println("str3==str4="+(str3==str4));
		System.out.println("str3.equals(str4)="+str3.equals(str4));
		
		
		System.out.println("str3==str4="+(str1==str3));
		System.out.println("str3.equals(str4)="+str1.equals(str3));
		
		
		
		String str5="java";
		
		System.out.println(str5);
		
		str5.concat("hello");
		
		System.out.println(str5);
		
		str5=str5.concat("hello");
		
		System.out.println(str5);
		
		
		
		String str6="world";
		
		
		str6=str6.concat("program");
		
		
		
		String str7="python";
		String str8="python";
		String str9="python";
		
		System.out.println("str7==str8="+(str7==str8));
		System.out.println("str7.equals(str8)="+str7.equals(str8));
		
		String str10="sql";
		String str11="sql";
		System.out.println("str10==str11="+(str10==str11));
		System.out.println("str10.equals(11)="+str10.equals(str11));
	}
}
		
		
		
		