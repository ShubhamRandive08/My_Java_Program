// Take an array and print the max and min element in to an array

public class Max_MinElementsInArray {
    public static void main(String a[]) {
        int[] arr = { 12, 25, 26, 24, 26, 18, 42, 30 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) 
                max = arr[i];

            if (arr[i] < min) 
                min = arr[i];
        }

        System.out.println("The maximum elements in an array : "+max);
        System.out.println("The minimum elements in an array : "+min);

    }
}
