/*Q9. Store N Words in a HashMap. Print Words whose length is prime number.
Input :java python sql codex spring
Output: Words with Prime Length
sql-3
codex-5*/
import java.util.*;
class Q9
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>hm= new HashMap<>();
		
		System.out.println("Enter the number of string you want to insert ");
		int size=sc.nextInt();
		sc.nextLine();
		
		String []arr=new String[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextLine();
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean flag =true;
			int length=arr[i].length();
			for(int j=2;j<=length/2;j++)
			{
				if(length%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag && length >1)
			{
				hm.put(arr[i],length);
			}
		}
		
		for(Map.Entry<String,Integer>set:hm.entrySet())
		{
			System.out.println(set.getKey()+" - "+set.getValue());
		}
	}
}