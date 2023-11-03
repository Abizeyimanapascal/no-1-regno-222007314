// this is the program to control traffic lights according to the color on 28-october-2023
public class nestedif { // main class
    public static void main(String[] args) { // main method
        String color = "green"; // variable declaration
        if(color == "green"){ // first condition
            System.out.println("CONTINUE"); // output when first condition is true
        } else if(color == "yellow"){
            System.out.println("WAIT"); // output when second condition is true
        } else if(color == "red"){
            System.out.println("STOP"); // output when third condition is true
        } else {
            System.out.println("ERROR"); // default output when no condition is true
        }
    }
}
// end of program