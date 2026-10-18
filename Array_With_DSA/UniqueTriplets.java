// Find all unique triplets in an integer list whose sum is zero. Duplicate triplets are not allowed.
import java.util.Arrays;

public class UniqueTriplets {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println(
                        arr[i] + ", " + arr[left] + ", " + arr[right]
                    );

                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
