import java.util.*;

public class sum_of_searis {
    public static void main(String a[]){

        int[] num = new int[5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the searis of numbers upto 5th position : ");
        for (int i = 0; i < 5; i++) {
             num[i] = sc.nextInt();
             sum += num[i];
        }

        System.out.println("The sum : " + sum);


    }
}


