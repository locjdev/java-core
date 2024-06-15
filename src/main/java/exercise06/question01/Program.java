package exercise06.question01;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        // Create a VietnamesePhone instance with an empty contacts list
        VietnamesePhone phone = new VietnamesePhone(new ArrayList<>());

        // Insert some contacts
        phone.insertContact("Alice", "0123456789");
        phone.insertContact("Bob", "0987654321");

        // Search for a contact
        phone.searchContact("Alice");

        // Update a contact's phone number
        phone.updateContact("Alice", "1234567890");

        // Remove a contact
        phone.removeContact("Bob");

        // Try to search for a removed contact
        phone.searchContact("Bob");
    }
}
