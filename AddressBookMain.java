import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add New Contact ---");
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter State: ");
                    String state = scanner.nextLine();
                    System.out.print("Enter Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact newContact = new Contact(firstName, lastName, address, city,
                            state, zip, phoneNumber, email);
                    addressBook.addContact(newContact);
                    break;

                case 2:
                    addressBook.displayAllContacts();
                    break;

                case 3:
                    System.out.println("Thank you for using Address Book Program!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}