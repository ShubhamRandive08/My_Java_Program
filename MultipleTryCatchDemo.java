public class MultipleTryCatchDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 0, 5};
        String str = null;

        // First try-catch block
        try {
            int result = numbers[0] / numbers[1]; // division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }

        // Second try-catch block
        try {
            System.out.println("Length of string: " + str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e.getMessage());
        }

        // Third try block with multiple catch blocks
        try {
            int value = numbers[5]; // ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
