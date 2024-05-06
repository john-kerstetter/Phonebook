// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: Request.java

import java.util.Scanner;

public class Request {
    // ask user for a string input
    public static String getString(Scanner input, String text) {
        String s = "";
        while (s.isBlank()) {
            System.out.print(text);
            s = input.next();
        }
        return s;
    }

    // ask user for an integer
    public static int getInt(Scanner input, String text) {
        while (true) {
            System.out.print(text);

            if (input.hasNextInt()) {
                return input.nextInt();
            } else {
                input.next();
            }
        }
    }
}
