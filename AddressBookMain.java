import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
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
                    System.out.println("\n--- Edit Contact ---");
                    System.out.print("Enter First Name to edit: ");
                    String editFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name to edit: ");
                    String editLastName = scanner.nextLine();

                    Contact contactToEdit = addressBook.findContact(editFirstName, editLastName);
                    if (contactToEdit != null) {
                        System.out.println("Contact found: " + contactToEdit);
                        System.out.println("\nWhat would you like to edit?");
                        System.out.println("1. Address");
                        System.out.println("2. City");
                        System.out.println("3. State");
                        System.out.println("4. Zip");
                        System.out.println("5. Phone Number");
                        System.out.println("6. Email");
                        System.out.print("Enter choice: ");
                        int editChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (editChoice) {
                            case 1:
                                System.out.print("Enter new Address: ");
                                contactToEdit.setAddress(scanner.nextLine());
                                break;
                            case 2:
                                System.out.print("Enter new City: ");
                                contactToEdit.setCity(scanner.nextLine());
                                break;
                            case 3:
                                System.out.print("Enter new State: ");
                                contactToEdit.setState(scanner.nextLine());
                                break;
                            case 4:
                                System.out.print("Enter new Zip: ");
                                contactToEdit.setZip(scanner.nextLine());
                                break;
                            case 5:
                                System.out.print("Enter new Phone Number: ");
                                contactToEdit.setPhoneNumber(scanner.nextLine());
                                break;
                            case 6:
                                System.out.print("Enter new Email: ");
                                contactToEdit.setEmail(scanner.nextLine());
                                break;
                            default:
                                System.out.println("Invalid choice!");
                        }
                        System.out.println("Contact updated successfully!");
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 3:
                    addressBook.displayAllContacts();
                    break;

                case 4:
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