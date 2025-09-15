package Excercises;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Versione int :");

        try {
            System.out.print("Inserisci km percorsi (intero): ");
            int km = Integer.parseInt(sc.nextLine().trim());

            System.out.print("Inserisci litri consumati (intero): ");
            int litri = Integer.parseInt(sc.nextLine().trim());

            int kmPerLitro = km / litri;
            System.out.println("Risultato (int): " + kmPerLitro + " km/l");

        } catch (ArithmeticException ex) {

            System.err.println("Errore: divisione per zero (interi).");

        } catch (NumberFormatException nfe) {
            System.err.println("Errore: inserisci solo numeri interi.");

        }

        try {
        System.out.println("Versione double :");
            System.out.print("Inserisci km percorsi: ");
            double kmD = Double.parseDouble(sc.nextLine().trim());

            System.out.print("Inserisci litri consumati: ");
            double litriD = Double.parseDouble(sc.nextLine().trim());

            double kmPerLitroD = kmD / litriD;
            System.out.println("Risultato: " + kmPerLitroD + " km/l");

        } catch (NumberFormatException nfe) {

            System.err.println("Errore: inserisci solo numeri decimali.");

        }

        sc.close();
    }
}
