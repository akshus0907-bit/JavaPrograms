import java.util.*;
 class AddInt{
	 public static void main(String[]args){
		 Scanner in=new Scanner(System.in);
		 
		 Vector<Integer> v= new Vector<>();
		 System.out.println("enter number of element");
		 int n=in.nextInt();
		 
		 for(int i=0;i<n;i++){
			 int num=in.nextInt();
			 v.add(num);
		 }
		 boolean found =false;
		 
		 System.out.println("enter serach number");
		 int serach=in.nextInt();
		 Iterator<Integer>itr=v.iterator();
		 
		 while(itr.hasNext()){
			 int val=itr.next();
			 if(val==serach){
				 
				 found=true;
				 break;
			 }
			 if(found){
				 System.out.println("element found"+serach);
			 }
			 else{
				 System.out.println("element  not found");
			 }	 
		 }
	 }
 }
		 