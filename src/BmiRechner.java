
/*
 * Hier habe ich mich f�r eine "if else" entschieden obwohl wir 5 Alternative F�lle haben. Da heir aber Wertebereiche und nicht einfach Gleichheit
 * abgefragt wird, kann hier keine "switch case" benutzt werden.
 */

import java.util.Scanner;

public class BmiRechner {
	public static void main(String[] args) {
		double dGewicht = 0;
		double dGroesse = 0;
		boolean bContinue = false;
		Scanner scanner = new Scanner(System.in);

		while (!bContinue) {
			try {
				System.out.print("Geben sie ein Gewicht ein (in Kg): ");
				dGewicht = Double.parseDouble(scanner.next());
				System.out.print("Geben sie eine Gr��e ein (in Metern): ");
				dGroesse = Double.parseDouble(scanner.next());
				bContinue = true;
			} 
			finally {
				System.out.println("Falsche Eingabe!");
			}
		}
		
		double dBMI = dGewicht / Math.pow(dGroesse, 2);
		int iKalorienvorgabe = 0;
		String sMeldung = "";
		
		if (dBMI < 18.5) {
			sMeldung = "Untergewicht";
			iKalorienvorgabe = 3000;
		} else if (dBMI < 25) {
			sMeldung = "Normalgewicht";
			iKalorienvorgabe = 2000;
		} else if (dBMI < 30) {
			sMeldung = "leichtes �bergewicht";
			iKalorienvorgabe = 1800;
		} else if (dBMI < 40) {
			sMeldung = "starkes �bergewicht";
			iKalorienvorgabe = 1200;
		} else {
			sMeldung = "extremes �bergewicht";
			iKalorienvorgabe = 700;
		}
		
		System.out.println("Ihr BMI ist " + dBMI + ".\nSie haben " + sMeldung + ". Essen Sie t�glich " + iKalorienvorgabe + " Kalorien.\nUnd Vielen Dank dass Sie sich f�r Uns entschieden haben.");
		scanner.close();
	}
}
