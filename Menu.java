// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: phonebook/Phonebook.java

import java.util.Scanner;

enum UserCommand {
    NONE, QUIT, SHOW_PHONEBOOK, REMOVE_CONTACT
}

public class Menu {
    private Scanner input;

    // constructor
    public Menu(Scanner input) {
        this.input = input;
    }

    // show commands to user
    public void showCommands() {
        System.out.println("Enter command:");
        System.out.println(" s: Show Phonebook");
        System.out.println(" r: Remove Entry");
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

            default: {
                return UserCommand.NONE;
            }
        }
    }
}
