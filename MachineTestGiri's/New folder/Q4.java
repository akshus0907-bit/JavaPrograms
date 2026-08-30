/*Q4. Given an array of strings, find the string containing the maximum number of unique characters. Ignore character case while checking uniqueness.
Explanation: For every string, count its unique characters. Compare the count with the previous maximum and return the string having the highest unique-character count.
Input:
{"apple", "developer", "banana", "python", "programming"}
Output:
String = developer
Unique Characters = 7*/
import java.util.*;
class Q4{
	
	public static void main(String []args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no you to insert string");
		int size=sc.nextInt();
		sc.nextLine();
		
		String arr[]=new String[size];
		System.out.println("Enter the string");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();	
		}
		
		int max=0,count=0;
		String result=" ";
		for(int i=0;i<arr.length;i++)
		{
			String word=arr[i].toLowerCase();
			int freq[]=new int[26];
			for(int j=0;j<word.length();j++)
			{
				char ch=word.charAt(j); 
				freq[ch-'a']++;
			}
			count=0;
			for(int p=0;p<freq.length;p++)
			{
				if(freq[p]>0)
				{
					count++;
				}
			}
			
			if(count>max)
			{
				max=count;
				result=arr[i];
			}
			
		}
		System.out.println("String = "+result);
		System.out.println("Unique Characters = "+max);
		
	
	}
}