class A{
    public void fun1(){
        System.out.println("This is the Class A");
    }
}

class B extends A{
    public void fun2(){
        System.out.println("This is the Class B");
    }
}

class C extends A{
    public static void main(String a[]){
        System.out.println("This is the MAIN CLASS");

        C x = new C();
        B b = new B();

        x.fun1();
        b.fun2();

    }
}
