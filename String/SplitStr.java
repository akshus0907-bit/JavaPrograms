//split string

class SplitStr{
	public static void main(String[]args){
		String str="abd@gmail.com,pqr@gmail.com,xyz@gmail.com";
		
		String str2[]=str.split(",");
		for(int i=0;i<str2.length;i++){
		System.out.println(str2[i]);
		}
	}
}