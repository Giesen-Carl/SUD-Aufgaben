/*
 * Hier habe ich eine "switch case" benutzt da wir mehr als 5 einfache Abfragen auf Gleichheit haben.
 * Hier ist der Quellcode wesentlich kompakter und übersichtlicher als bei einer "if else".
 */

import java.util.Scanner;

public class Zahlenumwandler {
	public static void main(String[] args) {
		
		int iEingabe = 0;
		String sAusgabe = "";
		boolean doOutput = true;
		
		Scanner scanner = new Scanner(System.in);
		
		 while (iEingabe != 999) {
			 System.out.print("Geben Sie eine Zahl ein: ");
			 iEingabe = scanner.nextInt();
			 doOutput = true;
			 switch (iEingabe) {
			 case (0):
				 sAusgabe = "Null";
			 	 break;
			 case (1):
				 sAusgabe = "Eins";
			 	 break;
			 case (2):
				 sAusgabe = "Zwei";
			 	 break;
			 case (3):
				 sAusgabe = "Drei";
			 	 break;
			 case (4):
				 sAusgabe = "Vier";
			 	 break;
			 case (5):
				 sAusgabe = "Fünf";
			 	 break;
			 case (6):
				 sAusgabe = "Sechs";
			 	 break;
			 case (7):
				 sAusgabe = "Sieben";
			 	 break;
			 case (8):
				 sAusgabe = "Acht";
			 	 break;
			 case (9):
				 sAusgabe = "Neun";
			 	 break;
			 case (10):
				 sAusgabe = "Zehn";
			 	 break;
			 case (999):
				 doOutput = false;
				 break;
		 	 default:
		 		 System.out.println("Falsche Eingabe.");
		 		 doOutput = false;
		 		 break;
			 }
			 if (doOutput) System.out.println("Eingabe: " + iEingabe + "\t" + "Ausgabe: " + sAusgabe + "\n");
		}
		 System.out.println("Vielen Dank. Beehren Sie uns bald wieder.");
		 scanner.close();
	}
}
