package exercise06.question01;

import java.util.ArrayList;

public abstract class Phone {
    // Array to store contacts
    protected ArrayList<Contact> contacts;

    public Phone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    // Abstract methods
    public abstract void insertContact(String name, String phone);
    public abstract void removeContact(String name);
    public abstract void updateContact(String name, String newPhone);
    public abstract void searchContact(String name);
}
