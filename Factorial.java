public class Factorial { // Declare the class
    Factorial(){ // Create the constructor 

        int num = 5 ; // Getting the number as a input for calculate the factorial
        int fact = 1 ; /// Initialize the factorial as 1

        for(int i = 1 ; i <= num ; i++){ //Use the for loop
            fact = fact * i; // Calculate the factorial 
        }

        System.out.println("The factorial of the number : " + fact); // Print the factorial
    }
    public static void main(String[] args) {
        Factorial f = new Factorial(); // Create the object of the class Factorial
    }
}
