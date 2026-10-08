//delete specific char at index

class DelChar{
	public static void main(String[]args0){
		StringBuffer sb=new StringBuffer("java program");
		sb.delete(1,5);
		System.out.println(sb);
	}
}