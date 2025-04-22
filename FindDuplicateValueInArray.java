// Find the duplicate the value into the array

public class FindDuplicateValueInArray {
    public static void main(String a[]){
        int[] arr = {2,6,5,3,2,56,5,45,85,6,2,2,3,5};
        
        System.out.println("The duplicate items in array : ");
        for(int i = 0 ; i <= arr.length ; i++){
            for(int j = arr[i] + 1 ; j <= arr.length ; j++){
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}
