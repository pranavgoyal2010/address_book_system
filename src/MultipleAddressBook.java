import java.util.HashMap;
import java.util.Map;

public class MultipleAddressBook {
    private Map<String, AddressBook> addressBooks;

    public MultipleAddressBook(){
        this.addressBooks = new HashMap<>();
    }

    public void addBook(String name, AddressBook addressBook){
        this.addressBooks.put(name, addressBook);
    }

    public AddressBook getBook(String name){
        return addressBooks.get(name);
    }

    public void display(){
        if(addressBooks.size()==0)
            System.out.println("Dictionary empty");
        else
            System.out.println(addressBooks.keySet());
    }

    public void displayFromSameCity(String city)
    {
        for (Map.Entry<String,AddressBook> entry : addressBooks.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().displayFromSameCity(city));
            //AddressBook addressBook = entry.getValue();
            /*for (int i=0; i<addressBook.size(); i++) {
                Address address = addressBook.get(i);
                if(address.getCity().equals(city))
                    System.out.println(address);
            }*/
        }
    }
}
