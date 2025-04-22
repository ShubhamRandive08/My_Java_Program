import java.util.Scanner;
class SumOfArrayNumber{
	public static void main(String a[]){
		System.out.println("Enter the array elements : ");
		int[] num = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < num.length ; i++){
			 num[i] = sc.nextInt();
			 sum += num[i];
		}

		System.out.println("The Array elements : ");
		for(int i = 0 ; i < num.length ; i++){
			System.out.println(num[i]);
		}
System.out.println("The Sum Of The Numbers : " + sum);
	}
}