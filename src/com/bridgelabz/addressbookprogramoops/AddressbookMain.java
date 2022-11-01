package com.bridgelabz.addressbookprogramoops;
import java.util.*;
public class AddressbookMain {
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to address book compulation program");

		
		Address addressBook = new Address();
		Contact contact = new Contact();
		    System.out.println("0.Exit \n1.Add Contact \n2.Display Contact \n3.Edit contact \n4.Delete contact ");
			System.out.println("Enter the Operation Number : ");
			int operationNumber = sc.nextInt();
			do {
			switch (operationNumber) {

			case 0:
				System.exit(0);
				break;
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.displayContact(contact);
				break;
			case 3:
				addressBook.editContact();
				break;
			case 4:
				addressBook.deleteContact();
				break;
			default:
				System.out.println("Invalid Input");
			}
			}while(operationNumber != 4);

		}
	}

