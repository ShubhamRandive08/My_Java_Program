import java.util.Scanner;

public class FibonacciSeries {

    // Function to print Fibonacci series up to n terms
    static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        // Calling the function
        printFibonacci(terms);

        scanner.close();
    }
}
