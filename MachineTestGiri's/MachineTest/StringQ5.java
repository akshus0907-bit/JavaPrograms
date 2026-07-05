/* Q5. Given N strings, group together all strings having the same characters irrespective of order. 
     Do not use collections or sorting methods. 
     Explanation - 
listen 
silent 
enlist 
     belong to same group. 
Input - Enter number of strings: 6 
listen  silent  abc  cab  enlist  dog 
 
Output - Group 1     Group 2      Group 3 
   Listen          abc              dog 
   Silent           cab 
   enlist*/
   import java.util.*;
   public class StringQ5{
	   public static void main(String[]args){
		   Scanner in=new Scanner(System.in);
		   System.out.println("enter string1"); //  take input 
		String s1=in.nextLine();
		System.out.println("enter string2");
		String s2=in.nextLine();
		if(s1.length()!=s2.length()){      // check length
			System.out.println("String is not anagram");
		}
		else{
			char ch1[]=s1.toCharArray();     // sort the both string using sort method 
			char ch2[]=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2)){
			System.out.println("group1="+s1+ " "+s2);  // print output
		}
		}
	   }
   }
   