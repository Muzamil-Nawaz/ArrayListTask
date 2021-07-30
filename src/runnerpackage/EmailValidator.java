package runnerpackage;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean isEmailValid = false;
        // Part 1
//        while(!isEmailValid){
//            System.out.print("Enter a valid DU email address: ");
//            String email = sc.next();
//            if(email.endsWith("@du.edu")){
//                System.out.println("You correctly entered: "+email);
//                isEmailValid = true;
//            }
//        }
        
        
        // Part 2
        
        do{
            System.out.print("Enter a valid DU email address: ");
            String email = sc.next();
            if(email.endsWith("@du.edu")){
                System.out.println("You correctly entered: "+email);
                isEmailValid = true;
            }
        }while(!isEmailValid);
        
    }
}
