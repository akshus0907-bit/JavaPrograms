import java.util.Scanner;

class SortColors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter array elements (0, 1, 2):");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count 0, 1 and 2
        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                count0++;
            } 
            else if (nums[i] == 1) {
                count1++;
            } 
            else {
                count2++;
            }
        }

        // Place 0s
        int index = 0;

        for (int i = 0; i < count0; i++) {
            nums[index++] = 0;
        }

        // Place 1s
        for (int i = 0; i < count1; i++) {
            nums[index++] = 1;
        }

        // Place 2s
        for (int i = 0; i < count2; i++) {
            nums[index++] = 2;
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}