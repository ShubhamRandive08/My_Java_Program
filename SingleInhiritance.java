class A {
    public int sum(){
        return 8 + 10 ;
    }
}

class B extends A{
    public int sub(){
        return 40 - 10;
    }
}

class SingleInhiritance extends B{
    public static void main(String a[]){
        SingleInhiritance s = new SingleInhiritance();


        System.out.println(("The sum : " + s.sum()));
        System.out.println(("The substraction " + s.sub()));

    }
}