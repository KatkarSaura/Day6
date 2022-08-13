
public class AddressBook1 {

	public static void main(String[] args) {
		System.out.println("Welcome to address book");
		Contacts c = new Contacts();
		AddressBook addressBook = new AddressBook();
		addressBook.addContacts();
		addressBook.deleteContact();
		
	}

}
