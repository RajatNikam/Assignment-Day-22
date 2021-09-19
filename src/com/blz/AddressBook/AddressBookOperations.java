package com.blz.Assignment22;

import java.util.HashSet;

public class AddressBookOperations {

    HashSet<Contact> addressBookSet = new HashSet<>();
    InputsDetails in = new InputsDetails();
    UserInputUtil input = new UserInputUtil();

    public void add() {
        Contact contact = new Contact(in.addFName(), in.addSName(), in.addAddress(), in.addCity(), in.addState(), in.addZip(), in.addno(), in.addmail());
        addressBookSet.add(contact);
    }

    public void display() {
        System.out.println("\n" + addressBookSet);
    }

    public Contact searchField() {
        System.out.println("Enter First Name of person to Edit Details : ");
        String fName = input.stringInput();

        for (Contact item : addressBookSet) {
            if (item.fname.equals(fName))
                return item;
        }
        return null;
    }

    public void edit(){
        Contact item = searchField();
        if (item != null){
            dataEdit(item);
        }
        else {
            System.out.println("First name you entered does not exist in our contacts");
        }
    }

    public void dataEdit(Contact item){
        item.fname = in.addFName();
        item.sname = in.addSName();
        item.adrs = in.addAddress();
        item.city = in.addCity();
        item.state = in.addState();
        item.zipcode = in.addZip();
        item.no = in.addno();
        item.mail = in.addmail();
    }

    public void delete(){
        Contact item = searchField();
        addressBookSet.remove(item);

    }

}