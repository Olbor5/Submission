package Submission;

import java.util.Scanner;

public class TextScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TextCounter counter = new TextCounter();

        System.out.println("Skriv in text rad för rad och avsluta med 'stop':");

        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("stop")) {
            counter.addRow(input);
            input = scan.nextLine();
        }

        int chars = counter.getCharCount();
        int rows = counter.getRowCount();

        System.out.println("Du har skrivit in " + chars + "st tecken inklusive mellanslag.");
        System.out.println("Du har skrivit in " + rows + "st rader.");

        /*while (true) {
            String input = scan.nextLine();
            if (input.equals("stop"))
                break;

            counter.addRow(input);
        } */


    }
}
