import java.util.*;

class NumPrimeOrNot{
	public static void main(String a[]){ //Main method
		System.out.print("Enter the number : "); // Getting the numbe from the number 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		int largertFactor = 0;

		for(int i = 1 ; i <= num ; i++){ // For loop for the getting the count of the divisor
			if(num % i == 0)
				count++;
		}
		if(count == 2) // If the count is 2 then that number is prime number
			System.out.println(num + " The given number is prime");
		else{
			for(int i = 1 ; i <= num/2 ; i++){ // Else number is not prime then print its largest factor
				if (num % i == 0) {
					largertFactor = i;
				}
			}
			System.out.println("The larger factor of the number : " + largertFactor);
		}
			
	
	}
}	