import java.util.Scanner;

public class AddressBook {
	
	Contacts c = new Contacts();
	
	public void addContacts() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name:");
		Contacts.setFirstName(scanner.nextLine());
		System.out.println("Enter the last name:");
		Contacts.setLastName(scanner.nextLine());
		System.out.println("Enter the City:");
		Contacts.setCity(scanner.nextLine());
		System.out.println("Enter the phone no:");
		Contacts.setPhoneNo(scanner.nextLine());
	}

	public void editContacts() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = scanner.next();
		
		boolean isFound = false;
		if (firstName.equalsIgnoreCase(contacts.getFirstName())) { 
			isFound = true;
			System.out.println("Contact deleted");
			Contacts = null;
			
		}
		if (!isFound) {
			System.out.println("Contact Not found");
			
		}
	}
			
		}
		
		
		
	}

}
