
import java.util.Scanner;

public class Energy {
    static Scanner sc ;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter rest mass: ");
        float mass = sc.nextFloat();
        System.out.print("Enter rest speed: ");
        float speed = sc.nextFloat();
        
        
        double e0 = calculateE0(mass);
        double ev = calculateEv(e0, speed);
        System.out.println("Ev-E0: "+(ev-e0));
    }
    static double calculateE0(float mass){
        return mass*299792458*299792458 ;
    }
    static double calculateEv(double e0, float speed){
        return e0/(Math.sqrt((1-((speed*speed)/(299792458*299792458)))));
    }
}
