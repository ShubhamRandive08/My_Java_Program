import java.util.*;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =  sc.nextInt();
        int count = 0;
        int i;

        for( i = 1 ; i <= num ; i++){
            if(num % i == 0)
                count = count + 1;
        }

        if(count == 2)
            System.out.println("The prime");
        else
            System.out.println("The Not Prime");


        // Factorial of the program
        int fact = 1;
        i = 1;
        while(i <= num){
            fact = fact * i;
            i = i + 1;
        }

        System.out.println(fact);
    }
}
