// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: phonebook/Phonebook.java

package phonebook;

public class Phonebook {
    private Contact first;

    // constructor
    public Phonebook() {
        this.first = null;
    }

    // constructor with contact
    public Phonebook(Contact e) {
        this.first = e;
    }

    // print phonebook to user
    public void print() {
        System.out.println();
        System.out.println("| Phonebook Entrys");

        Contact current = this.first;

        if (current == null) {

            System.out.println("|");
            System.out.println("| No entries");
            System.out.println("|");

        } else {

            int entryNumber = 1;

            do {

                System.out.println("[===> Entry #" + entryNumber);
                System.out
                        .println("| Name: " + current.getFirstName() + " " + current.getLastName());
                System.out.println("| Birthday: " + current.getBirthDate());
                System.out.println("| Phone Number: " + current.getPhoneNumber());
                System.out.println("| Address: " + current.getAddress() + " " + current.getCity());
                System.out.println("|");

                current = current.getNext();
                entryNumber += 1;

            } while (current != null);

            System.out.println("------");
        }
    }

    // add an entry to the end of the list
    public void addContact(String firstName, String lastName, String birthDate, String phoneNumber,
            String address, String city) {
        Contact c = new Contact(firstName, lastName, birthDate, phoneNumber, address, city);
        this.addContact(c);
    }

    public void addContact(Contact c) {

        if (this.first == null) {
            this.first = c;
            return;
        }

        Contact current = this.first;

        while (true) {
            Contact next = current.getNext();
            if (next == null) {
                current.setNext(c);
                return;
            } else {
                current = next;
            }
        }
    }

    // get an entry at an index
    public Contact getContact(int index) {

        Contact current = this.first;

        for (int i = 0; i < index; i++) {
            if (current == null)
                return null;

            current = current.getNext();
        }

        return current;
    }

    // // get size of phonebook
    // public int getSize() {
    //     Contact current = this.first;
    //     int counter = 0;

    //     while (true) {
    //         if (current == null || current == this.last) {
    //             return counter;
    //         }

    //         current = current.getNext();
    //         counter += 1;
    //     }
    // }

    // remove contact at index
    public Contact removeContact(int index) {
        if (index == 0) {
            Contact t = this.first;
            if (t == null) {
                return t;
            }
            this.first = t.getNext();
            return t;
        } else {

            Contact currentPrev = this.getContact(index - 1);
            Contact current = this.getContact(index);
            Contact currentNext = this.getContact(index + 1);

            if (currentPrev == null || current == null) {
                return null;
            }

            currentPrev.setNext(currentNext);
            return current;
        }
    }
}
