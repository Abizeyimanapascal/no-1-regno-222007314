// the program to calcurate simple interest on 01-november-2023
class Interest { // class declaration
    static int simple(int p, int r, int t){ // method to return simple interest
        return (p*r*t)/100; // output to be returned
    }
}

public class simpleinterest { // main class
    public static void main(String[] args) { // main method
        Interest SI= new Interest(); // object creation
        System.out.println("the simple interest in 5 years will be "+ SI.simple(100000, 5, 5));/*calling 
        method */
    }
}
