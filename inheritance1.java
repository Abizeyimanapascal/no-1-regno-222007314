// java program to show levels of study
package inheritance1; // forder name
class A extends B implements E{  // class A decralation
	void printa() { // method decralation
		System.out.println("Level One");// output
	}
	public void printe() { // method decralation
		 System.out.println("Level Five");// output
	}
}
class B extends C{ // class reation
	void printb() {// method decralation
		System.out.println("Level Two");// output
	}
}
class C extends D{ // class reation
	void printc() {// method decralation
		System.out.println("Level Three");// output
	}
}
class D{ // class reation
	void printd() { // method decralation
		System.out.println("Level Four");// output
	}
}
interface E{ // class reation
	void printe(); // method decralation
}


public class inheritance1 { // main class
	public static void main(String[] args) { // main method
        A Obj = new A(); // object creation
        Obj.printa(); // method calling
        Obj.printb(); // method calling
        Obj.printc();  // method calling
        Obj.printd(); // method calling
        Obj.printe(); // method calling
	}

}

/*
output

This is class A
This is class B
This is class C
This is class B
This is interface E
 */