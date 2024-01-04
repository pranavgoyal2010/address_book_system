import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args){
        ArrayList<Address> addressBook = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name ");
        String firstName = sc.nextLine();
        System.out.println("Enter last name ");
        String lastName = sc.nextLine();
        System.out.println("Enter address ");
        String address = sc.nextLine();
        System.out.println("Enter city ");
        String city = sc.nextLine();
        System.out.println("Enter Phone number ");
        String phNumber = sc.nextLine();
        System.out.println("Enter email ");
        String email = sc.nextLine();
        System.out.println("Enter zip ");
        int zip = sc.nextInt();

        addressBook.add(new Address(firstName, lastName, address, city, zip, phNumber, email));

        for(int i=0; i< addressBook.size(); i++)
        {
            System.out.println(addressBook.get(i));
        }
    }
}
