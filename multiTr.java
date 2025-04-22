class Processs1 extends Thread{
    public void run(){
        int i ;
        for(i = 1 ; i <= 5 ; i++){
           System.out.println(i + " :  P1"); 
        }
    }
}

class Processs2 extends Thread{
    public void run(){
        int i ;
        for(i = 1 ; i <= 5 ; i++){
           System.out.println(i + " :  P2"); 
        }
    }
}

public class multiTr {
    public static void main(String a[]){
        Processs1 o1 = new Processs1();
        Processs2 o2 = new Processs2();

        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);

        t1.start();
        t2.start();
    }
}
