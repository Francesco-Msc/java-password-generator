package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome e premi invio...");
        String Name = input.nextLine();
        System.out.println("Il tuo nome é: " + Name);

        input.close();
    }
}