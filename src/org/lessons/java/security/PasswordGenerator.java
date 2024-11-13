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
        System.out.println("Sei " + FirstName +" "+ LastName +" e il tuo colore preferito è " + Color);

        input.close();
    }
}