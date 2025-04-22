public class AreaOfCircle { // Define the class
    public double  fun(int r) { // Function for the calculate the area of the circle
        return 2 * 3.14 * r;
    }

    public  int fun(int l, int b) { // Function for calcuate the area of the rectangle
        return l * b;
    }

    public static void main(String[] args) {
        AreaOfCircle a = new AreaOfCircle(); // Create the object of the class
        System.out.println("The area of circle : " + a.fun(3)); // Call the method for area of circle
        System.out.println("The area of rectangle " + a.fun(3, 4)); // Call the method for the area of the rectangle

    }
}
