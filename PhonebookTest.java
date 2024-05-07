// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: PhonebookTest.java

import java.util.Scanner;
import phonebook.Phonebook;

public class PhonebookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();
        Manager manager = new Manager(input, phonebook);

        phonebook.addContact("first", "last", "2000-08-27", "123-456-7890", "1000", "City");
        phonebook.addContact("test", "1", "", "", "", "");
        phonebook.addContact("test", "2", "", "", "", "");
        phonebook.addContact("test", "3", "", "", "", "");
        phonebook.addContact("test", "4", "", "", "", "");
        phonebook.addContact("test", "5", "", "", "", "");
        phonebook.addContact("test", "6", "", "", "", "");

        manager.menu();

        System.out.println("End");
    }
}
