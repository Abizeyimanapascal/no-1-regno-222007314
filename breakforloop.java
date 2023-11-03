// this is the program to loop all numbers and break when reaches specified number on 30-november-2023
public class breakforloop { // main class
    public static void main(String[] args) { // main method
        for(int i=1;i<=10;i++){ // for loop with variable assignment
            if(i == 4){ // condition to check
                break; // stop to execute loop if condion mathes four
            } else { // if condition does not mathes four
                System.out.println(i); // output
            }
        } // end of loop
    }
}
