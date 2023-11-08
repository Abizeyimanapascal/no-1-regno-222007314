// java program to perfom mathematical operations
package inheritance2; // package name
import java.lang.Math; // importing math library
class A extends B implements E{ // class decralation
    int addition(int x, int y){ // method decralation
        return x+y; // results to be returned
    }
    public double power(double x, double y){ // method decralation
        return Math.pow(x,y); // results to be returned
    }
}
class B extends C{ // class decralation
    int subtraction(int x, int y){// method decralation
        return x-y; // results to be returned
    }
}

class C extends D{ // class decralation
    int division(int x, int y){// method decralation
        return x/y;  // results to be returned
    }
}

class D{ // class decralation
    int multiplication(int x, int y){// method decralation
        return x*y;  // results to be returned
    }
}
interface E{ // interface decralation
    double power(double x,double y);// method decralation
}

public class inheritance2 { // main class
    public static void main(String[] args) { // main method
        A Obj = new A(); // object creation
        System.out.println("sum of 5 and 7 = " + Obj.addition(5, 7)); // method calling
        System.out.println(); // go next linr
        System.out.println("difference of 5 and 7 = " + Obj.subtraction(5, 7)); // method calling
        System.out.println();// go next linr
        System.out.println("product of 8 and 3 = " + Obj.multiplication(5, 7)); // method calling
        System.out.println();// go next linr
        System.out.println("quotitient of 16 and 2 = " + Obj.division(5, 7)); // method calling
        System.out.println();// go next linr
        System.out.println("5 power 7 = " + Obj.power(5, 7)); // method calling
    }
}
/*
    output
    
sum of 5 and 7 = 12

difference of 5 and 7 = -2

product of 8 and 3 = 35

quotitient of 16 and 2 = 0

5 power 7 = 78125.0
 */
