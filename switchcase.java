// this is the program to display name of the day according to the age on 28-october-2023
public class switchcase { // main class
    public static void main(String[] args) { // main method
        int dayweek = 4; // variable declaration
        switch(dayweek){ // switch condition
            case 1:  // case 1
              System.out.println("Monday"); // output when case 1 matches with variable
              break; // when this case match it stop and jump out all remaining switch cases
            case 2:
              System.out.println("Tuesday"); // output when case 2 matches with variable
              break;// when this case match it stop and jump out all remaining switch cases
            case 3:
              System.out.println("Wednesday"); // output when case 3 matches with variable
              break;
            case 4:
              System.out.println("Thursday"); // output when case 4 matches with variable
              break;
            case 5:
              System.out.println("Friday"); // output when case 5 matches with variable
              break;   
            case 6:
              System.out.println("Saturday"); // output when case 6 matches with variable
              break;
            case 7:
              System.out.println("sunday"); // output when case 7 matches with variable
              break;     
            default:
              System.out.println("unknown day"); // default output when no case matches with variable 

        }
    }
}
