public class IsPrimes {
    public static void main(String a[]){
        int count = 0;
        System.out.println("The 1 to 199 prime numbers are : ");
        for(int i = 1 ; i <= 199 ; i++){
            for(int j = 1 ; j <= i ; j++){
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + "  ");
            }
            count = 0;
        }
    }
}
