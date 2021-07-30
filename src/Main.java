
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many weeks you want printed?");
        int numberOfWeeks = Integer.parseInt(scanner.next());
        
        for (int i = 0; i < numberOfWeeks; i++) {
            System.out.printf("Week %d:",(i+1));
            for (int j = 0; j < 6; j++) {
                switch(j){
                    case 0:
                        System.out.print("Monday,");
                        break; //case 0
                    case 1:
                        System.out.print("Tuesday,");
                        break; // case 1
                    case 2:
                        System.out.print("Wednesday,");
                        break; // case 2
                    case 3:
                        System.out.print("Thursday,");
                        break; // case 3
                    case 4:
                        System.out.print("Friday");
                        break; // case 4
                    default:
                    System.out.print("\n");
                        
                    
                        
                } // close switch
            } // close inner for
            
        } // close outer for
        scanner.close(); // close scanner after closing bracket for loop
    }
}
