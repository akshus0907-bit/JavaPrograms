//how to implement synchronization using synchronized keyword

class Table{
	synchronized void  showTable(int no){
		
		try{
			for(int i=1;i<=10;i++){
			System.out.printf("%d X %d = %d\n", i, no, i * no);
			Thread.sleep(1000);
		}
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}

class Two extends Thread{
	Table table;
	Two(Table table){
		this.table=table;
	}
	public void  run(){
		table.showTable(2);
	}
	
}

class Three extends Thread{
	Table table;
	Three(Table table){
		this.table=table;
	}
	public void run(){
		table.showTable(3);
	}
}


public class SynchronideKeywod{
	public static void main(String[]args){
		Table t=new Table();
		Two tw=new Two(t);
		tw.start();
		Three th=new Three(t);
		th.start();
		
	}
}