package com.blz.Assignment22;

public class InputsDetails {
    static UserInputUtil input = new UserInputUtil();

    String addFName(){
        System.out.print("\nEnter First Name here : ");
        return input.stringInput();
    }

    String addSName(){
        System.out.print("Enter Second Name here : ");
        return input.stringInput();
    }

    String addAddress(){
        System.out.print("Enter Address here : ");
        return input.stringInput();
    }

    String addCity(){
        System.out.print("Enter City here : ");
        return input.stringInput();
    }

    String addState(){
        System.out.print("Enter State here : ");
        return input.stringInput();
    }

    String addZip(){
        System.out.print("Enter Zip-Code here : ");
        return input.stringInput();
    }

    String addno(){
        System.out.print("Enter Mobile no here : ");
        return input.stringInput();
    }

    String addmail(){
        System.out.print("Enter Mail-ID here : ");
        return input.stringInput();
    }

}