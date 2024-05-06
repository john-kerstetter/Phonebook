// Name: John Kerstetter
// Class: CS 145
// Assignment: Lab 5 - Phone book
// File: phonebook/Contact.java

package phonebook;

public class Contact {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phoneNumber;
    private String address;
    private String city;

    private Contact next;

    public Contact(String firstName, String lastName, String birthDate, String phoneNumber,
            String address, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.city = city;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nBirthday: %s\nPhone Number: %s\nAddress: %s %s",
                this.firstName, this.lastName, this.birthDate, this.phoneNumber, this.address,
                this.city);
    }

    public Contact getNext() {
        return this.next;
    }

    public void setNext(Contact next) {
        this.next = next;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return city;
    }
}
