
public class SubMaxArrSum{
	public static void main(String[]args){

int arr[]={4,2,4,5,6};
int maxsum=0;
for(int i=0;i<arr.length;i++){
	int sum=0;
	for(int j=i;j<arr.length;j++){
		
	  boolean duplicate=false;
	
	
		for(int k=i;k<j;k++){
		if(arr[k]==arr[j]){
		 duplicate=true;
		
		break;
		}
		}
		if(duplicate){
		break;
		
		}
		
		sum=sum+arr[i];
		if(sum>maxsum){
		maxsum=sum;
		}
	}
}
	System.out.println("maximum sum:"+maxsum);

	}
}
	
	
	