package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo Nome e premi invio...");
        String FirstName = input.nextLine();
        System.out.println("Inserisci il tuo Cognome e premi invio...");
        String LastName = input.nextLine();
        System.out.println("Inserisci il tuo colore preferito e premi invio...");
        String Color = input.nextLine();
        
        System.out.println("Inserisci la tua data di nascita in formato (dd/mm/yyyy) e premi invio...");
        String[] Birth = input.nextLine().split("/");
        int Day = Integer.parseInt(Birth[0]);
        int Month = Integer.parseInt(Birth[1]);
        int Year = Integer.parseInt(Birth[2]);
        int Sum = Day + Month + Year;

        System.out.println(FirstName +"-"+ LastName +"-"+ Color +"-"+ Sum);

        input.close();
    }
}