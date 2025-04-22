import java.util.*;
class Looping{
	public static void main(String a[]){
		//Print the pattern of the pyramid

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of rows : ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n; i++){
			for(int j = 1; j <= i ; j++){
				System.out.print("*  ");
			}
				System.out.println();
		}
	}
}