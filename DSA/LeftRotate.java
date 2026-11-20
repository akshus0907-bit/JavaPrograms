import java.util.*;

public class LeftRotate {
    public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);

		System.out.println("enter size");
		int n=in.nextInt();
		
        int[] arr = new int [n];
		
		System.out.println("enter element");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}