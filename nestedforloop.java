// this is the program to display inverted half pyramid with stars  on 30-october-2023
public class nestedforloop { // main class
    public static void main(String[] args) { // main method
        for(int i=7;i>=1;i--){  // for loop condition to determin rows
            for(int j=1;j<=i;j++){  // inner loop to determine columns
                    System.out.print("* "); // output 
            }
            System.out.println();// print new line after each row
        } 
            
    }
}
