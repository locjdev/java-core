package exercise06.question01;

import java.util.ArrayList;

public class VietnamesePhone extends Phone {
    public VietnamesePhone(ArrayList<Contact> contacts) {
        super(contacts);
    }

    @Override
    public void insertContact(String name, String phone) {
        contacts.add(new Contact(phone, name));
        System.out.println("Inserted: " + name + " - " + phone);
    }

    @Override
    public void removeContact(String name) {
        boolean removed = contacts.removeIf(contact -> contact.name.equals(name));
        if (removed) {
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }


    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                contact.number = newPhone;
                System.out.println("Updated: " + name + " - " + newPhone);
                break;
            }
        }
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.name.equals(name)) {
                System.out.println("Found: " + contact.name + " - " + contact.number);
                break;
            }
        }
    }
}
