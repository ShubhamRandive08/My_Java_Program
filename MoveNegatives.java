import java.util.Arrays;

public class MoveNegatives {
    // Function to move all negative elements to one side of the array
    public static void moveNegatives(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // If left is negative and right is positive, move on
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                // Swap positive element on left with negative element on right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, -2, 3, -4, 5, -6, -7, 8};

        System.out.println("Original array: " + Arrays.toString(array));

        // Move negatives to one side
        moveNegatives(array);

        System.out.println("Array after moving negatives: " + Arrays.toString(array));
    }
}
