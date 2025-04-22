import java.util.*;

public class Rev_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        char[] arr = name.toCharArray();

        System.out.print("\n\nThe reverse name : ");
        for(int i = arr.length - 1; i >= 0 ; i--){
            System.out.print(arr[i]);
        }
        System.out.println(rev);
    }
}
