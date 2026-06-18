/*Question 14: Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates.*/

import java.util.*;
public class RemoveDup{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a[]=new int[7];
        int result[]=new int[7];
        int k=0;

        
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }

        
        for(int i=0;i<a.length;i++){
            boolean found=false;

            for(int j=0;j<k;j++){
                if(result[j]==a[i]){
                    found=true;
                    break;
                }
            }

            if(found==false){
                result[k]=a[i];
                k++;
            }
        }

        
        for(int i=0;i<k;i++){
            System.out.println(result[i]);
        }
    }
}