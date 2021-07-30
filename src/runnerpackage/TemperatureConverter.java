
public class TemperatureConverter {
    static int temperatureInFah = 78;
    public static void main(String[] args) {
        System.out.println("Temperature in Fahrenheit :"+temperatureInFah);
        System.out.println("After converting in Celsius: "+convertFahToCal(temperatureInFah));
    }
    public static double convertFahToCal(int temperature){
       
        return (double) 5/9*(temperature-32);
    }
}
