class Process1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Process 1");
        }
    }
}

class Process2 extends Thread{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Process 2");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Process1 obj1 = new Process1();
        Process2 obj2 = new Process2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
