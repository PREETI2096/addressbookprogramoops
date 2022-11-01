package com.bridgelabz.addressbookprogramoops;
import java.util.*;

public class Address {
   static Scanner sc = new Scanner(System.in);
   ArrayList<Contact> contactArrayList = new ArrayList<Contact>();

	public void addContact() {
		 System.out.println("Create new contact :");
		 System.out.println("======================");
		 System.out.println("Enter first name:");
		 String firstName = sc.next();
		 System.out.println("Enter last name");
		 String lastName = sc.next();
		 System.out.println("Enter address");
		 String address = sc.next();
		 System.out.println("Enter phone number");
		 String phoneNumber = (sc.next());
		 System.out.println("Enter email ID");
		 String emailID = sc.next();
		 System.out.println("Enter city:");
		 String city = sc.next();
		 System.out.println("Enter state :");
		 String state = sc.next();
		 System.out.println("Enter zip code");
		 String zip = sc.next();
		 Contact contact = new Contact();
		 contact.setFirstName(firstName);
		 contact.setLastName(lastName);
		 contact.setAddress(address);
		 contact.setPhoneNumber(phoneNumber);
		 contact.setEmailID(emailID);
		 contact.setCity(city);
		 contact.setState(state);
		 contact.setZip(zip);
		 displayContact(contact);
		
	}
public void displayContact(Contact contact) {

	System.out.println(contact);
   }
	
public void editContact(){

    System.out.println("Enter person name : "); 
     String name = sc.next();   
    for(Contact contact: contactArrayList ){
    	
        if(contact.getFirstName().equals(name) || contact.getLastName().equals(name)){
        	
            System.out.println("What you want to edit : \n" +
                    "1.first name \n" +
                    "2.last name \n" +
                    "3.address \n" +
                    "4.phone number \n" +
                    "5.emailIDstate \n" +
                    "6.city \n" +
                    "7. state \n" +
                    "8.zip");
            int ch = (sc.nextInt());
            switch (ch){
                case 1:
                    System.out.println("Enter first name :");
                    contact.setFirstName(sc.next());
                    System.out.println("Contact updated!");
                    break;
                case 2:
                    System.out.println("Enter last name :");
                    contact.setLastName(sc.next());
                    System.out.println("Contact updated!");
                    break;
                case 3:
                    System.out.println("Enter address :");
                    contact.setAddress(sc.next());
                    System.out.println("Contact updated!");
                    break;
                case 4:
                	System.out.println("Enter contact number :");
                    contact.setPhoneNumber(sc.next());
                    System.out.println("Contact updated!");
                                        break;
                case 5:
                	 System.out.println("Enter email :");
                     contact.setEmailID(sc.next());
                     System.out.println("Contact updated!");
                   
                    break;
                case 6:
                	System.out.println("Enter city :");
                    contact.setCity(sc.next());
                    System.out.println("Contact updated!");

                    break;
                case 7:
                	 System.out.println("Enter state :");
                     contact.setState(sc.next());
                     System.out.println("Contact updated!");
                    break;
                case 8:
                	System.out.println("Enter zip code :");
                    contact.setZip(sc.next());
                    System.out.println("Contact updated!");
                    break;
                default:
                    System.out.println("Invalid input.");
                   editContact();
            }
        }
        }
        System.out.println(name + " not found");
	}
public void deleteContact() {
	System.out.println("Enter name to delete:");
	String name = sc.next();
		
	for(Contact contact : contactArrayList) {
		if(contact.getFirstName().equalsIgnoreCase(name)) {

			contactArrayList.remove(contact);
			System.out.println("contact is deleted");	
		   }
	    }
	System.out.println("contact not available");
	}
}

