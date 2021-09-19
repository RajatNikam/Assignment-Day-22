package com.blz.Assignment22;

public class AddressBook {

    public static void main(String[] args) {
        AddressBookOperations operations = new AddressBookOperations();
        UserInputUtil input = new UserInputUtil();
        int a = 0;
        System.out.println("1. add\n2. display\n3. edit Contact\n0.exit");
        while (a == 0) {
            System.out.print("\nEnter your choice : ");

            switch (input.intInput()) {
                case 1 -> operations.add();
                case 2 -> operations.display();
                case 3 -> operations.edit();
                case 0 -> {
                    a = 1;
                    System.out.println("Thank you for your Time");
                }
                default -> System.out.println("Choose only from options");
            }
        }
    }
}