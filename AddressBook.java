import java.util.ArrayList;
public class AddressBook {
    private ArrayList<Contact> contacts;
    public AddressBook() {
        contacts = new ArrayList<>();
    }
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }
    public Contact findContact(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) &&
                    contact.getLastName().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null;
    }
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in address book.");
        } else {
            System.out.println("\n--- All Contacts ---");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}