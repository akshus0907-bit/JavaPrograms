/*34. Check Rotational String
Class Name: RotationCheck
Methods:
void setStrings(String s1, String s2)
boolean isRotation()
Example
Input:"ABCD", "CDAB"
Output:true*/
import java.util.*;
public class CheckRotationalStr{

    private String s1;
	private String s2;
	
    public void setStrings(String s1, String s2)
    {
        this.s1=s1;
        this.s2=s2;
    }
	public boolean isRotation()
   {
       boolean flag=true;
       
        boolean c1= s1.contains(s2.charAt(0)+"");
        	if(c1==false)
        	{
        	    return c1;
        	}
        	int pos=s1.indexOf(s2.charAt(0));
        		//System.out.println("index of ="+pos);
        		String s3="";
        		int i=pos;
        		while(i<s1.length())
        		{
        		    s3+=s1.charAt(i++);
        		}
        		i=0;
        		while(i<pos)
        		{
        		    s3+=s1.charAt(i++);
        		}
        		//System.out.println("s3="+s3);
        		
        	
        	return s2.equals(s3);
   }



	public static void main(String[] args) {
	    CheckRotationalStr r1=new CheckRotationalStr();
	   Scanner in=new Scanner(System.in);
	   System.out.println("enter two String");
	   String s1=in.nextLine();
	   String s2=in.nextLine();
	   r1.setStrings(s1,s2);
	   
		System.out.println("is rotaion ="+r1.isRotation());
	}
	}


		