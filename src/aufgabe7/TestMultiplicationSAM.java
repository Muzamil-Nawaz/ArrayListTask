package aufgabe7;

/*  Zweiter Teil von Aufgabe 7 a)
 *  Erstellen Sie in der Main-Methode der Klasse TestMultiplicationSAM eine Instanz der MultiplicationSAM 
 *  welche die beiden Parameter mittels Lamda-Ausdrucks multipliziert.
 *  Rufen Sie auf der zuvor erstellten MultiplicationSAM Instanz die Methode mit den Zahlen 4 und 5 auf.
 */

public class TestMultiplicationSAM {
	public static void main(String[] args) {
		MultiplicationSAM.SAM  multiplication = (int a, int b) -> (a*b);
                System.out.println("Multiplication :"+multiplication);
	}
}