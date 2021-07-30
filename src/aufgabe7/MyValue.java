package aufgabe7;

import java.util.List;

public class MyValue {

		int value;
		
		public int getValue() {
			return value;
		}
		
		public MyValue(int i) {
			value = i;
		}
		
		public String toString() {
			return String.valueOf(value);
		}
		
		/*
		 * Aufgabe 7 b)
		 * Die Methode aufgabeB() soll zunÃ¤chst den Methodenparameter in einen Stream zurÃ¼ckgeben.
		 * AnschlieÃŸend soll ein Stream zurÃ¼ckgegeben werden der das Attribut value aus den MyValue Objekt enthÃ¤lt.
		 * Nun soll der Stream um alle Zahlen bereinigt werden die durch 2 ohne Rest teilbar sind. 
		 * Diese Zahlen sollen zu einem Stream der aus MyValue-Objekten besteht zurÃ¼ckgegeben werden. 
		 * Zum Schluss soll jedes Objekt auf der Konsole mittels println()-Methode ausgegeben werden.	
		*/
		
		public void aufgabeB(List<MyValue> myValues) {
			
		}
}