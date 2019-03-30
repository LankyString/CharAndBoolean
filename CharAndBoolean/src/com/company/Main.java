package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';

        //Unicode
        char myCharTwo = '\u00A9';
        System.out.println("My Unicode output was: " + myCharTwo);

        boolean myBoolean = false;

        // 1.   Find the code for the registered symbol on the same line as the copyright symbol
        char registerSymbol = '\u00AE';
        // 2.   Create a variable of type char and assign it the unicode value for that symbol

        // 3.   Display it on the screen.
        System.out.println("Registered symbol = " + registerSymbol);

    }
}
