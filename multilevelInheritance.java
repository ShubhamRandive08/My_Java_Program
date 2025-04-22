import java.util.*;

class A {
	int sum(){
		return 10 + 20 ;
	}
}

class B extends A{
	int sub(){
		return 20 - 10 ;
	}
}

class multilevelInheritance extends B{
	public static void main(String a[]){
		multilevelInheritance c = new multilevelInheritance();
		System.out.println("The sum : " + c.sum());
		System.out.println("The sub : " + c.sub());
	}
}