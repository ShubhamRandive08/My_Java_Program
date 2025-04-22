import java.util.Arrays;

public class CyclicRotate {
    // Function to cyclically rotate an array by one
    public static void rotateByOne(int[] arr) {
        // Edge case: If the array is empty or has only one element, no rotation is needed
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Store the last element of the array
        int lastElement = arr[arr.length - 1];

        // Shift all elements of the array one position to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the first position
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(array));

        // Rotate the array by one
        rotateByOne(array);

        System.out.println("Array after rotation: " + Arrays.toString(array));
    }
}
