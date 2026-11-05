import java.util.*;
import java.util.*;


class HeightChecker{
   public static void main(String[]args){
   
   Scanner in=new Scanner(System.in);
   
   System.out.println("enter array size");
   
   int n=in.nextInt();
   
   int heights[]=new int[n];
   
   System.out.println("enter heights");
   
   for(int i=0;i<heights.length;i++){
	heights[i]=in.nextInt();
   }
   int count=0;
   
   int a[]=new int[heights.length];
   
   for(int i=0;i<heights.length;i++){
       a[i]=heights[i];
   }
   
   Arrays.sort(a);
   
   
   for(int i=0;i<heights.length;i++){
       if(heights[i]!=a[i]){
		count++;
		
		}
   }
   
   System.out.println("Expected Array"+Arrays.toString(a));
   
   
   System.out.println("Mismatch count:"+count);
   
   
   }
   }
   