public class ArrayPrimeNum {
    public static void main(String a[]) {
        
        System.out.println("The prime numbers: ");
        for (int i = 2; i < 199; i++) { // Start from 2, as 0 and 1 are not prime
            int count = 0; // Reset count for each number
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // A prime number has exactly two divisors: 1 and itself
                System.out.println ⬤