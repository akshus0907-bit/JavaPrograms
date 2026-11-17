// consumer By implementing in Anoyonomus inner class: 




import java.util.function*;
class ConsumerByAnoClass{
	public static void main(String[]args){
		Consumer <Integer>c=new Consumer<>(){
			public void accept(Integer val){
				System.out.println("Square is="+val*val);
			}
		};
		c.accept(10);
		
	}
}