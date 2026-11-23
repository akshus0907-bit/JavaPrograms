//bubble sort


public class BubbleSort{
	public static void main(String[]args){
		int a[]={10,20,3,4,6,7};
		
		System.out.println("array before sort");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("array after sort");
		for(int j=0;j<a.length;j++){
			System.out.println(a[j]);
		}
	}
}