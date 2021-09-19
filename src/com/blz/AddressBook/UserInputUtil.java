package com.blz.Assignment22;

import java.util.Scanner;

public class UserInputUtil {
    private static final Scanner SC = new Scanner(System.in);

    public int intInput() {
        return SC.nextInt();
    }

    public String stringInput() {
        return SC.next();
    }
}