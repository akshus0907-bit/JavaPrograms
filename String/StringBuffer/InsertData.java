//insert data into string buffer

class InsertData{
	public static void main(String[]args){
		StringBuffer sb=new StringBuffer("java");
		
		sb.insert(4," program");
		System.out.println(sb);
	}
}