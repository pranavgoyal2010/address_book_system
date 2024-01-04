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
        sc.nextLine();
        System.out.println("Enter first name to edit details.");
        firstName = sc.next();

        sc.nextLine();
        Address record = null;
        for(int i=0; i< addressBook.size(); i++)
        {
            if(addressBook.get(i).getFirstName().equals(firstName))
            {
                record = addressBook.get(i);
                break;
            }
        }

        if(record==null)
            System.out.println("No such record exists");
        else
        {
            System.out.println("Enter field to edit");
            String field = sc.next();
            sc.nextLine();
            if(field.equals("address"))
            {
                System.out.print("Enter new address ");
                record.setAddress(sc.nextLine());
            }
            else if(field.equals("city"))
            {
                System.out.print("Enter new city ");
                city = sc.nextLine();
                record.setCity(city);
            }
            else if(field.equals("phNumber"))
            {
                System.out.print("Enter new phone number ");
                record.setPhNumber(sc.nextLine());
            }
            else if(field.equals("email"))
            {
                System.out.print("Enter new email ");
                record.setEmail(sc.nextLine());
            }
            else if(field.equals("zip"))
            {
                System.out.print("Enter new zip ");
                record.setZip(sc.nextInt());
            }
            else
            {
                System.out.println("Invalid field.");
            }

            System.out.println(record);
        }


        System.out.println("Enter first name to delete record.");
        firstName = sc.nextLine();


        record = null;
        for(int i=0; i< addressBook.size(); i++)
        {
            if(addressBook.get(i).getFirstName().equals(firstName))
            {
                record = addressBook.get(i);
                addressBook.remove(i);
                break;
            }
        }

        if(record==null)
        {
            System.out.println("No such record. Delete Unsuccessful.");
        }
        else
        {
            System.out.println("Delete successful.");
        }
        
    }
}
