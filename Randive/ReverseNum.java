import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rem = 0;
        int rev = 0;


        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);


    }
}
