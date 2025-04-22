// Write the code for the reverse the array elements 

public class ArrayReverse {
    public static void main(String a[]){
        int[] arr = {12,36,54,85,63};

        System.out.print("The original array elements : ");
        for(int i = 00 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println("\n\n");

        System.out.print("The reverse array elements : [ ");
        for(int i = arr.length-1 ; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
