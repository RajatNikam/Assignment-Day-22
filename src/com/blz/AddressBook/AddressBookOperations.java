package com.blz.Assignment22;

import java.util.HashSet;

public class AddressBookOperations {

    HashSet<Contact> addressBookSet = new HashSet<>();
    InputsDetails in = new InputsDetails();

    public void add() {
        Contact contact = new Contact(in.addFName(),in.addSName(),in.addAddress(),in.addCity(),in.addState(),in.addZip(),in.addno(),in.addmail());
        addressBookSet.add(contact);
    }

    public void display(){
        System.out.println("\n" + addressBookSet);
    }
}