// the program to calcurate compound interest on 01-november-2023
import java.lang.Math; // importing math library to perform mathematical functions
class Compound { // class declaration
    static double compoundi(double p,double r, double t) { // method declaration
        return p*(Math.pow((1+((r/100)/12)),(t*12)));    // output to be returned 
}
}

public class compoundinterest { // main class
    public static void main(String[] args) { // main method
        Compound CI = new Compound(); // object creation
        System.out.println(CI.compoundi(500000,18,3)); // method calling
    }
    
}

