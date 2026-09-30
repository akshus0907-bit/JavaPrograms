/*10. Write a Java program that simulates garbage collection eligibility by nullifying object references
and requesting garbage collection via System.gc()*/

class Gargabegc{
	
	public static void main(String[]args){
		
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		System.out.println("before gc");
		
		d1=null;
		d2=null;
		
		System.gc();
		
		System.out.println("After garbage collection");
	}
}
		
		