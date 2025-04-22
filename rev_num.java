import java.util.Scanner;

public class rev_num {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int rev_num = 0;
        int rem = 0 ;

        while(num > 0){
            rem = num % 10;
            rev_num = rev_num * 10 + rem;
            num /= 10;
        }

        System.out.println("The reverse no : " + rev_num);

    }
}
