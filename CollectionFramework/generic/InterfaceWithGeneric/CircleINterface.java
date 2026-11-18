//interface with generic 



import java.util.*;
interface Circle<T>{
	public void setRedius(T r);
	
	T getResult();
	

}

class Square implements Circle<Integer>{
	
	Integer radius;
	
	public void setRedius(Integer r){
		radius=r;
	}
		
		public Integer getResult(){
			return (int)(radius*radius);
		}
	}
	


public class CircleINterface{
	public static void main(String[]args){
		Square s=new Square();
		s.setRedius(5);
		
		
		System.out.println(s.getResult());
	}
}