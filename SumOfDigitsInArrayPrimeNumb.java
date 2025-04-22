public class SumOfDigitsInArrayPrimeNumb {
    public static void main(String[] args) {
        int[] arr = {12,15,11,13,17};
        int count = 0;
        int rem = 0;
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 1 ; j <= arr[i] ; j++){
                if(arr[i] % j == 0)
                    count++;
            }
            if(count == 2){
                System.out.println(arr[i]);
                while(arr[i] > 0){
                    rem = arr[i] % 10;
                    sum += rem;
                    arr[i] /= 10;
                }
            }
            count = 0;
            rem = 0;
        }

        System.out.println("The sum of digits of the prime number : " + sum);
    }
}
