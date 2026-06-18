/*Question 15: Write a java program to find common elements between two arrays.
Input :
Array1 = {1, 2, 3, 4, 5}
Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation :
Compare each element of Array1 with all elements of Array2, if match found ? it is a common element.*/

import java.util.*;
public class CommonEle{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter elements of two arrays:");

        int a[]=new int[5];
        int b[]=new int[5];
        int result[]= new int[5];
        int k=0;

       
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }

       
        for(int i=0;i<b.length;i++){
            b[i]=in.nextInt();
        }

       
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){

                if(a[i] == b[j]){   
                    boolean found = false;

                    
                    for(int m=0;m<k;m++){
                        if(result[m] == a[i]){
                            found = true;
                            break;
                        }
                    }

                    
                    if(found == false){
                        result[k] = a[i];
                        k++;
                    }
                }
            }
        }

       
        System.out.print("Common elements = ");
        for(int i=0;i<k;i++){
            System.out.print(result[i] + " ");
        }
    }
}