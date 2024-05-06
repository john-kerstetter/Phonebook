// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: PhonebookTest.java

import java.util.Scanner;
import phonebook.Contact;
import phonebook.Phonebook;

public class PhonebookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager menu = new Manager(input);
        Phonebook phonebook = new Phonebook();

        phonebook.addContact("first", "last", "2000-08-27", "123-456-7890", "1000", "City");
        phonebook.addContact("test", "1", "", "", "", "");
        phonebook.addContact("test", "2", "", "", "", "");
        phonebook.addContact("test", "3", "", "", "", "");
        phonebook.addContact("test", "4", "", "", "", "");
        phonebook.addContact("test", "5", "", "", "", "");
        phonebook.addContact("test", "6", "", "", "", "");

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
                    phonebook.removeContact(index);
                    break;
                }

                case ADD_CONTACT: {
                    Contact c = Request.getContact(input);
                    phonebook.addContact(c);
                    break;
                }
            }
        }

        System.out.println("End");
    }
}
