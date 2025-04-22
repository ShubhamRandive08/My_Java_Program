import java.util.*;
class ArrayEvenOdd{
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter the array elements with the size of " + size + " : " );

		for(int i = 0; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("The array elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + "  \n\n");
		}

		int[] arrEven = new int[size];
		int[] arrOdd = new int[size];

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] % 2 == 0)
				arrEven[i] = arr[i];
		}

		System.out.print("The Array array even : ");
		for(int i = 0 ; i < arrEven.length ; i++){
			System.out.print(arrEven[i] + "  ");
		}
	}
}