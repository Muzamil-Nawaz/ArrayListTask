
import java.util.Scanner;


public class VelocityAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter velocity (v1): ");
        float v1 = sc.nextFloat();
        System.out.print("Enter velocity (v2): ");
        float v2 = sc.nextFloat();
        double v = calculateVelocity(v1, v2);
        System.out.println("Velocity is "+v);
    }
    public static double calculateVelocity(float v1, float v2){
        return  (v1+v2)/(1+(v1*v2)/299792458*299792458);
    }
}
