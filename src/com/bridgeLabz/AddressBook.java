package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private String AddressBook;

    public String getAddressBook() {
        return AddressBook;
    }

    public AddressBook(String addressBook) {
        AddressBook = addressBook;
    }

    public AddressBook() {
    }

    public void setAddressBook(String addressBook) {
        AddressBook = addressBook;
    }

    Contact contact = new Contact();
    ArrayList<Contact> contacts = new ArrayList<>();
    void add_contact(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name:");
    String name = sc.next();
        System.out.print("Enter last name:");
    String last = sc.next();
        System.out.print("Enter address");
    String add = sc.next();
        System.out.print("Enter city");
        String city = sc.next();
        System.out.print("Enter state");
        String state = sc.next();
        System.out.print("Enter zipcode");
        int zip= Integer.parseInt(sc.next());
        System.out.print("Enter Phonenumber");
        Long phoneNumber = Long.valueOf(sc.next());
        contact.setPhoneNumber(phoneNumber);
        System.out.print("Enter email");
        String email = sc.next();
        contact.setEmail(email);
        contact.setZip(zip);
        contact.setState(state);
    contact.setCity(city);
        contact.setAddress(add);
        contact.setFirstName(name);
        contact.setLastName(last);
        new Contact(name, last, add,city,state,zip,phoneNumber,email);
        contacts.add(contact);
        System.out.println("CONTACT ADDED SUCCESSFULLY");
}
    void display(){
        if(contacts.isEmpty()){
            System.out.println("List is empty .....No contact stored !!!!");
        }
        for(int i=0;i<contacts.size();i++)
        {
            System.out.println(contact);
        }

    }

    void edit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the name of the person");
        String name = sc.next();
        for(int i=0;i<contacts.size();i++)
        {
            if(contact.getFirstName().equals(name)){
                System.out.print("Enter Your name:");
                String fname = sc.next();
                System.out.print("Enter last name:");
                String last= sc.next();
                System.out.print("Enter address");
                String add=sc.next();
                System.out.println("Enter City");
                String city=sc.next();
                System.out.println("Enter State");
                String state=sc.next();
                System.out.println("Enter Zipcode");
int zip=sc.nextInt();
contact.setZip(zip);
                contact.setState(state);

                contact.setCity(city);
                contact.setAddress(add);
                contact.setFirstName(fname);
                contact.setLastName(last);
                System.out.println("Updated successfully");
            }
        }
    }
    public void delete() {
        System.out.println("Enter the contact name which you want to delete");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        for(int i =0;i<contacts.size();i++){
            if(contact.getFirstName().equals(name)){
                contacts.remove(contact);
                System.out.println("Contact removed successfully ");
            }
            else {
                System.out.println("Contact not found!!!!");
            }
        }
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "AddressBook='" + AddressBook + '\'' +
                ", contact=" + contact +
                ", contacts=" + contacts +
                '}';
    }
}

