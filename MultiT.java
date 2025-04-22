// Multithreding using the Runnable class

class Process1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " P1");
        }
    }
}

class Process2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " P2");
        }
    }
}

public class MultiT {
    public static void main(String[] args) {
        Process1 onj1 = new Process1();
        Process2 onj2 = new Process2();

        Thread o1 = new Thread(onj1);
        Thread o2 = new Thread(onj2);
    
        o1.start();
        o2.start();
    }
}
