import java.util.*;

class Account{
    private int bal;

    Account (int b){
        bal = b;
    }

    public boolean isSufficientBal(int x){
        if(bal > x){
            return true;
        }else{
            return false;
        }
    }

    public void withdraw(int amt){
        bal -= amt;
        System.out.println("Withdraw Successfull");
        System.out.println("Current balence" + bal);
    }
}

class Customer implements Runnable{
    private Account x1;
    private String name;

    Customer(Account n1, String n){
        x1 = n1;
        name = n;
    }

    public void run(){

            Scanner sc = new Scanner(System.in);

            System.out.print(name + "  Enter amt to with : ");
            int amt = sc.nextInt();

            if(x1.isSufficientBal(amt)){
                x1.withdraw(amt);
            }else{
                System.out.println("Insufficient balence.");
            }
    }
}



public class BankSystem {
    public static void main(String args[]){

        Account a1 = new Account(10000);
        
        Customer c1 = new Customer(a1,"Shubham");

        Thread t1 = new Thread(c1);
        t1.start();
    }
}
