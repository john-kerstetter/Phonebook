// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: PhonebookTest.java

import java.util.Scanner;
import phonebook.Phonebook;

public class PhonebookManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        phonebook.addEntry("first", "last", "2000-08-27", "123-456-7890", "1000", "City");
        phonebook.addEntry("test", "1", "", "", "", "");
        phonebook.addEntry("test", "2", "", "", "", "");
        phonebook.addEntry("test", "3", "", "", "", "");
        phonebook.addEntry("test", "4", "", "", "", "");
        phonebook.addEntry("test", "5", "", "", "", "");
        phonebook.addEntry("test", "6", "", "", "", "");

        Menu menu = new Menu(input);

        boolean repeat = true;

        while (repeat) {
            menu.showCommands();
            switch (menu.getCommand()) {
                case NONE: {
                    break;
                }

                case SHOW_PHONEBOOK: {
                    phonebook.print();
                    break;
                }
                
                case QUIT: {
                    repeat = false;
                    break;
                }

                case REMOVE_CONTACT: {
                    int index = Request.getInt(input, "Enter item to remove: ");
                    phonebook.remove(index);
                    break;
                }
            }
        }

        System.out.println("End");
    }
}
