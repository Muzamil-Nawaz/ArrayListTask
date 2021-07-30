
import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceConverter {
    static Scanner sc ;
    static DecimalFormat df;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        df = new DecimalFormat("##.####");
        displayMenu();
        
    }

    private static void displayMenu() {
        System.out.println("Please enter your name:");
        String name = sc.next();
        System.out.println("Welcome "+name+" to the Distance Converter Application");
        int choice = -1;
        while(true){
            System.out.println("\n\nPlease Enter 1 for Miles to Kilometers conversion.\n");
            System.out.println("Enter 2 for Kilometers to Miles conversion.\n");
            System.out.println("Or Enter 3 to exit the program");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    convertMilesToKm();
                    break;
                case 2:
                    convertKmToMiles();
                    break;
                case 3:
                    System.out.println("\nExiting....");
                    System.out.println("Thank you for using the Distance Converter Application.");
                    System.exit(0);
                default:
                    System.out.println("That is not an option.");
            }
        }
    }

    private static void convertMilesToKm() {
        System.out.println("\nPlease enter your distance in miles :");
        double miles = sc.nextDouble();
        
        System.out.println("\nComputing.....");
        double distanceInKm = miles/0.62137;
        System.out.println("The distance in Kilometers is "+df.format(distanceInKm));
    }

    private static void convertKmToMiles() {
        System.out.println("\nPlease enter your distance in Kilometers :");
        double km = sc.nextDouble();
        
        System.out.println("\nComputing.....");
        double distanceInMiles = km*0.62137;
        System.out.println("The distance in Miles is "+df.format(distanceInMiles));
    }
}
