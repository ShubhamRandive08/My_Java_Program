// Write to code to print the sum of the prime numbers into the array

import java.util.*;
public class SumOfPrimeNumberInArray {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter the size of the array elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("\nEnter the elements of array : ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for(int j = 1 ; j <= arr[i]; j++){
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum += arr[i];
            }
            count = 0;
        }

        if (sum == 0) {
            System.out.println("Dont found any prime number in Array ");
        }else{
            System.out.println("The sum of prime numbers : " + sum);
        }
    }
}
