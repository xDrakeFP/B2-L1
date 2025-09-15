package Excercises;

import java.awt.*;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args){

        int [] arrayNumbers = new int[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i< arrayNumbers.length; i++){
            arrayNumbers[i] = (int)(Math.random()*10) + 1;
        }

        System.out.println("Array Iniziale: "+ Arrays.toString(arrayNumbers) );
       while (true) {
           int num = leggiIntero(sc, "Inserisci un numero (0 per terminare)");
            if (num == 0) {
                System.out.println("Software in chiusura...");
                break;
            }
            int pos = leggiIntero(sc,"Inserisci la posizione dove inserirlo [0 - 4]");
            try {
                arrayNumbers[pos] = num;
                System.out.println("Aggiornato!");
                System.out.println("Nuovo Array: "+Arrays.toString(arrayNumbers));

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Indice inserito non valido, nessuna modifica effettuata ");
                System.out.println("Stato dell'Array: "+Arrays.toString(arrayNumbers));
            }

       }
        System.out.println("Stato finale dell'array: " + Arrays.toString(arrayNumbers));

    }

    private static int leggiIntero(Scanner sc, String prompt) {
        while(true) {
            System.out.println(prompt);
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            }
             catch(NumberFormatException ex) {
                System.out.println("Input non valido, Inserisci un numero intero");
             }
        }

    }

}
