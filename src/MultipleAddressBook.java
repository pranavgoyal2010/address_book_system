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
}
