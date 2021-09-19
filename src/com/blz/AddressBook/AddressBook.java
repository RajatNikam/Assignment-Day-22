package com.blz.Assignment22;

public class AddressBook {

    public static void main(String[] args) {
        AddressBookOperations operations = new AddressBookOperations();
        UserInputUtil input = new UserInputUtil();

        while (true) {
            System.out.println("1. add\n2. display");
            System.out.println("Enter your choice : ");
            if (input.intInput() == 1) {
                operations.add();
            } else {
                operations.display();
                break;
            }
        }
    }
}