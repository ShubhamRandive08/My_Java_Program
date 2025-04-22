import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    // Function to find and print duplicate elements in an array
    public static void findDuplicates(int[] arr) {
        if (arr == null || arr.length <= 1) {
            System.out.println("No duplicates found.");
            return;
        }

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6};

        System.out.println("Original array: " + Arrays.toString(array));

        // Find and print duplicates
        findDuplicates(array);
    }
}
