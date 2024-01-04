import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){


        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM");

        System.out.println("ENTER " + "\n" +
                "1. FOR ADDING TO BOOK" + "\n" +
                "2. FOR EDITING CONTACT IN BOOK" + "\n" +
                "3. FOR DELETING CONTACT IN BOOK" + "\n" +
                "4. FOR DISPLAYING CONTENT OF BOOK" + "\n" +
                "5. TO EXIT");

        int choice = sc.nextInt();
        sc.nextLine();

        while(choice!=5)
        {
            switch (choice){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    System.out.println("Enter first name to edit details.");
                    String firstName = sc.nextLine();
                    addressBook.editContact(firstName);
                    break;
                case 3:
                    System.out.println("Enter first name to delete record.");
                    firstName = sc.nextLine();
                    addressBook.deleteContact(firstName);
                    break;
                default:
                    addressBook.display();
            }

            System.out.println("ENTER " + "\n" +
                    "1. FOR ADDING TO BOOK" + "\n" +
                    "2. FOR EDITING CONTACT IN BOOK" + "\n" +
                    "3. FOR DELETING CONTACT IN BOOK" + "\n" +
                    "4. FOR DISPLAYING CONTENT OF BOOK" + "\n" +
                    "5. TO EXIT");

            choice = sc.nextInt();
            sc.nextLine();
        }


    }
}
