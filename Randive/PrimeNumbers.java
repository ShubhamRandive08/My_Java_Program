public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 199:");
        for (int num = 2; num <= 199; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}