// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: phonebook/Phonebook.java

package phonebook;

public class Phonebook {
    private Contact first;
    // private Contact last;

    public Phonebook() {
        this.first = null;
        // this.last = null;
    }

    public Phonebook(Contact e) {
        this.first = e;
        // this.last = null;
    }

    public void print() {
        System.out.println();
        System.out.println("| Phonebook Entrys");

        int entryNumber = 1;
        Contact current = this.first;

        if (current == null) {
            System.out.println("|");
            System.out.println("| No entries");
            System.out.println("|");
        } else {
            do {

                System.out.println("[===> Entry #" + entryNumber);
                System.out.println("| Name: " + current.getFirstName() + " " + current.getLastName());
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
    public void addEntry(String firstName, String lastName, String birthDate, String phoneNumber,
            String address, String city) {
        Contact e = new Contact(firstName, lastName, birthDate, phoneNumber, address, city);

        if (this.first == null) {
            this.first = e;
            return;
        }

        Contact current = this.first;

        while (true) {
            Contact next = current.getNext();
            if (next == null) {
                current.setNext(e);
                return;
            } else {
                current = next;
            }
        }
    }

    // get an entry at an index
    public Contact getEntry(int index) {

        Contact current = this.first;

        for (int i = 0; i < index; i++) {
            if (current == null)
                return null;

            current = current.getNext();
        }

        return current;
    }

    // public int getSize() {
    // Contact current = this.first;
    // int counter = 0;

    // while (true) {
    // if (current == null || current == this.last) {
    // return counter;
    // }

    // current = current.getNext();
    // counter += 1;
    // }
    // }

    public Contact remove(int index) {
        if (index == 0) {
            Contact t = this.first;
            if (t == null) {
                return t;
            }
            this.first = t.getNext();
            return t;
        } else {

            Contact currentPrev = this.getEntry(index - 1);
            Contact current = this.getEntry(index);
            Contact currentNext = this.getEntry(index + 1);

            if (currentPrev == null || current == null) {
                return null;
            }

            currentPrev.setNext(currentNext);
            return current;
        }
    }
}
