import java.util.*;

public class count_no_digits {
    public static void main(String a[]){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner (System.in);
        long num = sc.nextInt();
        long  count = 0 ;

        while( num > 0){
            count++;

            num /= 10;
        }

        System.out.println("The total no of digits : " + count);
    }
}
