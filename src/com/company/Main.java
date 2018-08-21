package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int keuze;

        String naamBestand;
        String voornaam, achternaam;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.print("\nWilt u lezen(1), schrijven(2) of stoppen(0): ");

            keuze = Integer.parseInt(scanner.nextLine());


            if (keuze != 0 && (keuze == 1 || keuze == 2)) {


                System.out.print("\nGeef naam van het bestand: ");

                naamBestand = scanner.nextLine();


                if (keuze == 1) {

                    try (Scanner reader = new Scanner(new BufferedReader(new FileReader(naamBestand)))) {

                        System.out.println("");

                        while (reader.hasNextLine()) {

                            String line = reader.nextLine();
                            System.out.println(line);
                        }

                    }

                }

                if (keuze == 2) {

                    try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(naamBestand, true)))) {

                        System.out.print("\nGeef voornaam: ");

                        voornaam = scanner.nextLine();

                        System.out.print("\nGeef achternaam: ");

                        achternaam = scanner.nextLine();

                        writer.print(voornaam + " ");

                        writer.println(achternaam);
                    }

                }
            }

        } while (keuze != 0);
    }
}


/*

Wilt u lezen(1), schrijven(2) of stoppen(0)2
Geef naam van bestand: persoon.txt
Geef voornaam: Karen
Geef achternaam: Damen
Wilt u lezen(1), schrijven(2) of stoppen(0)2
Geef naam van bestand: persoon.txt
Geef voornaam: Kristel
Geef achternaam: Verbeke
Wilt u lezen(1), schrijven(2) of stoppen(0)1
Geef naam van bestand: persoon.txt
Karen Damen
Kristel Verbeke
Wilt u lezen(1), schrijven(2) of stoppen(0)0

 */
