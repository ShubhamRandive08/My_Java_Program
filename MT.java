// There are two types of multitreding implementaionm - 1. Using Runnable interface and 2. Using Thread Class
import java.util.*;

class Process5 extends Thread{
    public void run(){
        int i ;
        for(i = 1 ; i <= 5; i++){
            System.out.println(i + " P1");
        }
    }
}

class Process6 extends Thread{
    public void run(){
        int i ;
        for(i = 1 ; i <= 5; i++){
            System.out.println(i + " P2");
        }
    }
}

public class MT {
    public static void main(String a[]){
        Process5 o1 = new Process5();
        Process6 o2 = new Process6();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        t2.start();
    }
}
