class P1 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i + " P1 ");
        }
    }
}

class P2 extends Thread{
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println(i + " P1 ");
        }
    }
}


public class MultiTUsingThread {
    public static void main(String a[]){
        P1 obj1 =  new P1();
        P2 obj2 =  new P2();
        Thread o1 = new Thread(obj1);
        Thread o2 = new Thread(obj2);

        o1.start();
        o2.start();
    }
}
