// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: Manager.java

import java.util.Scanner;
import phonebook.Contact;
import phonebook.Phonebook;

enum UserCommand {
    NONE, QUIT, SHOW_PHONEBOOK, REMOVE_CONTACT, ADD_CONTACT
}

public class Manager {
    private Scanner input;
    private Phonebook phonebook;

    // constructor
    public Manager(Scanner input, Phonebook phonebook) {
        this.input = input;
        this.phonebook = phonebook;
    }

    // show commands to user
    public void showCommands() {
        System.out.println("Enter command:");
        System.out.println(" s: Show Phonebook");
        System.out.println(" a: Add Contact");
        System.out.println(" r: Remove Contact");
        System.out.println(" q: Quit");
        System.out.print("--> ");
    }

    public UserCommand getCommand() {
        char command = this.input.next().charAt(0);
        switch (command) {
            case 'q': {
                return UserCommand.QUIT;
            }

            case 's': {
                return UserCommand.SHOW_PHONEBOOK;
            }

            case 'r': {
                return UserCommand.REMOVE_CONTACT;
            }

            case 'a': {
                return UserCommand.ADD_CONTACT;
            }

            default: {
                return UserCommand.NONE;
            }
        }
    }

    public void menu() {

        boolean repeat = true;

        while (repeat) {
            this.showCommands();
            switch (this.getCommand()) {
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

    }
}
