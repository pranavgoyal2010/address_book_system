import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Address> addressBook;

    public AddressBook(){
        addressBook = new ArrayList<>();
    }
    public void addContact()
    {
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

        Address newRecord = new Address(firstName, lastName, address, city, zip, phNumber, email);

        if(!addressBook.contains(newRecord))
            addressBook.add(newRecord);
        else
            System.out.println("Duplicate Entry. Address not added.");
    }

    public void display()
    {
        if(addressBook.size()==0)
            System.out.println("Address book is empty");

        for(int i=0; i< addressBook.size(); i++)
        {
            System.out.println(addressBook.get(i));
        }
    }

    public void editContact(String name)
    {
        Address record = null;
        for(int i=0; i< addressBook.size(); i++)
        {
            if(addressBook.get(i).getFirstName().equals(name))
            {
                record = addressBook.get(i);
                break;
            }
        }
        Scanner sc = new Scanner(System.in);
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
                record.setCity(sc.nextLine());
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
    }

    public void deleteContact(String name)
    {

        Address record = null;
        for(int i=0; i< addressBook.size(); i++)
        {
            if(addressBook.get(i).getFirstName().equals(name))
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

    public Address displayFromSameCity(String city){
        for (int i=0; i<addressBook.size(); i++) {
            Address address = addressBook.get(i);
            if(address.getCity().equals(city))
                return address;
        }
        return null;
    }

}
