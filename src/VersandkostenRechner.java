/*
 * Ich habe mich hier für eine "if else" entschieden, da hier große Bereiche abgefragt werden.
 * Bei einer switch case ist es schwierig große Wertebereiche abzufragen
 */

import java.util.Scanner;

public class VersandkostenRechner {
	public static void main(String[] args) {
		int iMenge;
		double dPreis;
		double dVersandkosten = 0;
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Geben sie eine Menge ein: ");
		iMenge = eingabe.nextInt();
		System.out.print("Geben sie einen Preis ein: ");
		dPreis = eingabe.nextDouble();
		eingabe.close();
		
		double dBestellwert = iMenge * dPreis;
		
		if (dBestellwert < 100) {
			dVersandkosten = 5.5;
		} else if (dBestellwert >= 100 && dBestellwert < 200) {
			dVersandkosten = 3;
		} else if (dBestellwert >= 200 ) {
			dVersandkosten = 0;
		} else {
			System.out.println("Fehlerhafte Engabe.");
		}
		
		System.out.println("Bestellwert: " + dBestellwert + "\t" + "Rechnungsbetrag: " + (dBestellwert + dVersandkosten));
	}
}
