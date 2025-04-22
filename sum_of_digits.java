import java.util.*;

public class sum_of_digits {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int sum = 0;
        int rem = 0;

        while(num > 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println("Sum of digits : " + sum);
    }
}
