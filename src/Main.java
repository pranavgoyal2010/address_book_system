import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        AddressBook addressBook = null;
        MultipleAddressBook multipleBooks = new MultipleAddressBook();

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO ADDRESS BOOK SYSTEM");

        System.out.println("ENTER " + "\n" +
                "1. FOR CREATING A NEW ADDRESS BOOK" + "\n" +
                "2. FOR ADDING TO AN ADDRESS BOOK" + "\n" +
                "3. FOR EDITING CONTACT IN AN ADDRESS BOOK" + "\n" +
                "4. FOR DELETING CONTACT IN A BOOK" + "\n" +
                "5. FOR DISPLAYING CONTENT OF A BOOK" + "\n" +
                "6. TO DISPLAY ALL ADDRESS BOOKS" + "\n" +
                "7. TO EXIT");

        int choice = sc.nextInt();
        sc.nextLine();

        while(choice!=7)
        {
            switch (choice){
                case 1:
                    addressBook = new AddressBook();
                    System.out.println("Enter name of new address book");
                    String bookName = sc.nextLine();
                    multipleBooks.addBook(bookName, addressBook);
                    break;
                case 2:
                    System.out.println("Enter name of address book");
                    bookName = sc.nextLine();
                    addressBook = multipleBooks.getBook(bookName);
                    if(addressBook==null){
                        System.out.println("No such book");
                        break;
                    }
                    addressBook.addContact();
                    break;
                case 3:
                    System.out.println("Enter name of address book");
                    bookName = sc.nextLine();
                    addressBook = multipleBooks.getBook(bookName);
                    if(addressBook==null){
                        System.out.println("No such book");
                        break;
                    }
                    System.out.println("Enter first name to edit details.");
                    String firstName = sc.nextLine();
                    addressBook.editContact(firstName);
                    break;
                case 4:
                    System.out.println("Enter name of address book");
                    bookName = sc.nextLine();
                    addressBook = multipleBooks.getBook(bookName);
                    if(addressBook==null){
                        System.out.println("No such book");
                        break;
                    }
                    System.out.println("Enter first name to delete record.");
                    firstName = sc.nextLine();
                    addressBook.deleteContact(firstName);
                    break;
                case 5:
                    System.out.println("Enter name of address book");
                    bookName = sc.nextLine();
                    addressBook = multipleBooks.getBook(bookName);
                    if(addressBook==null){
                        System.out.println("No such book");
                        break;
                    }
                    addressBook.display();
                case 6:
                    multipleBooks.display();
            }

            System.out.println("ENTER " + "\n" +
                    "1. FOR CREATING A NEW ADDRESS BOOK" + "\n" +
                    "2. FOR ADDING TO AN ADDRESS BOOK" + "\n" +
                    "3. FOR EDITING CONTACT IN AN ADDRESS BOOK" + "\n" +
                    "4. FOR DELETING CONTACT IN A BOOK" + "\n" +
                    "5. FOR DISPLAYING CONTENT OF A BOOK" + "\n" +
                    "6. TO DISPLAY ALL ADDRESS BOOKS" + "\n" +
                    "7. TO EXIT");
            
            choice = sc.nextInt();
            sc.nextLine();
        }



    }
}
