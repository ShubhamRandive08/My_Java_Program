import java.util.*;
import java.util.Scanner;

public class AssignNumToDay {
    public static void main(String[] args) {
        int[] num = new int[7];
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the seven numebr : ");
        for(int i = 0; i < 7 ; i++)
             num[i] = sc.nextInt();
            
        System.err.println();
        for(int i = 0 ; i < 7 ; i++){
            switch(i + 1){
                case 1:
                    System.out.println(num[i] + " is assigned to Monday");
                    break;
                case 2 : 
                    System.out.println(num[i] + " is assigned to Thuseday");
                    break;

                case 3 : 
                    System.out.println(num[i] + " is assigned to Wednsday");
                    break;

                case 4 : 
                    System.out.println(num[i] + " is assigned to Thursday");
                    break;

                case 5 : 
                    System.out.println(num[i] + " is assigned to Friday");
                    break;

                case 6 : 
                    System.out.println(num[i] + " is assigned to Saturday");
                    break;

                case 7 : 
                    System.out.println(num[i] + " is assigned to Sunday");
                    break;
            }
        }

    }

}