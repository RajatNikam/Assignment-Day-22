package com.blz.Assignment22;

import java.util.HashSet;
import java.util.Objects;

public class AddressBookOperations {

    HashSet<Contact> addressBookSet = new HashSet<>();
    InputsDetails in = new InputsDetails();
    UserInputUtil input = new UserInputUtil();
    Contact contact = new Contact();

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contact temp){
            if (contact.fname.equals(temp.fname)){
                return true;
            }
        }
        return false;
    }

    public void add() {
        System.out.print("How many Contact details you want yo Enter : ");
        int temp = input.intInput();
        for (int i = 0; i < temp; i++) {
            String fname = in.addFName();
            if (contains(fname)){
                System.out.println("First name already exists");break;
            }
            else {
                Contact contact = new Contact(fname, in.addSName(), in.addAddress(), in.addCity(), in.addState(), in.addZip(), in.addno(), in.addmail());
                addressBookSet.add(contact);
            }
        }
    }

    public boolean contains(String fname) {
        for (Contact item : addressBookSet) {
            if (Objects.equals(item.fname, fname)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("\n" + addressBookSet);
    }

    public Contact searchField() {
        System.out.println("Enter First Name of person : ");
        String fName = input.stringInput();

        for (Contact item : addressBookSet) {
            if (item.fname.equals(fName))
                return item;
        }
        return null;
    }

    public void edit() {
        Contact item = searchField();
        if (item != null) {
            dataEdit(item);
        } else {
            System.out.println("First name you entered does not exist in our contacts");
        }
    }

    public void dataEdit(Contact item) {
        item.fname = in.addFName();
        item.sname = in.addSName();
        item.adrs = in.addAddress();
        item.city = in.addCity();
        item.state = in.addState();
        item.zipcode = in.addZip();
        item.no = in.addno();
        item.mail = in.addmail();
    }

    public void delete() {
        Contact item = searchField();
        addressBookSet.remove(item);

    }

}