package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc= new Scanner(System.in);

    ArrayList<AddressBook> addressbookstore = new ArrayList<>();
    public  void addAddressbook(){
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter name of the addressbook");
        String nm = sc.next();
        addressBook.setAddressBook(nm);
        addressbookstore.add(addressBook);
        System.out.println("Addressbook is added!!!");
        choice();
    }
    public void printAllAddressbook(){
        for(int i=0;i<addressbookstore.size();i++) {
            System.out.println(addressbookstore);
        }
    }
    public void choice(){
        boolean flag = true;
        while(flag) {
            System.out.println("  ::>>>Welcome AdressBook<<<::  ");
            System.out.println("Which operation do you want to perform");
            System.out.println("  Multiple Contacts in AdressBook  ");
            System.out.println("1.Add New Contcat");
            System.out.println("2.View All Contacts");
            System.out.println("3.Update Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Add New AddressBook");
            System.out.println("6.Print All AddressBook");

            int choice = sc.nextInt();
            switch (choice) {
                case 0 : flag=false;
                case 1 :
                        System.out.println("Enter name of  the addressbook in which you want to add contact");
                String name=sc.next();
                for (int i=0;i<addressbookstore.size();i++){
                    AddressBook temp = addressbookstore.get(i);
                    if(temp.getAddressBook().equals(name))
                    {
                        temp.add_contact();
                        System.out.println("Contatc added");
                    }
                    else {
                        System.out.println("Contact not found!!!");
                    }
                }

                case 2 : displayA();

                case 3 : editA();

                case 4 : deleteA();

                case 5 : addAddressbook();

                case 6 : printAllAddressbook();
            }
        }

    }
    public void displayA(){
        System.out.println("Enter name of the addressbook in which you want to display contact");
        String name=sc.next();
        for (int i=0;i<addressbookstore.size();i++) {
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name))
            {
                temp.display();
            }
        }
    }

    public void editA(){
        System.out.println("Enter name of the addressbook in which you want to edit contact");
        String name= sc.next();
        for(int i=0;i<addressbookstore.size();i++)
        {
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name)){
                temp.edit();
            }
        }
    }
    public void deleteA(){
        System.out.println("Enter name of the addressbook in which you want to delete contact");
        String name = sc.next();
        for(int i=0;i<addressbookstore.size();i++){
            AddressBook temp = addressbookstore.get(i);
            if(temp.getAddressBook().equals(name)){
                temp.delete();
            }
        }
    }
    public  void addA(){

    }
    public static void main(String[] args) {
        AddressBookMain addressbookMain = new AddressBookMain();
        addressbookMain.addAddressbook();
    }
}
