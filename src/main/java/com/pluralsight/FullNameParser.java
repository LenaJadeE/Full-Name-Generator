package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);








    }
}

// EXERCISE 2
// Step 1
// Create a Java application called full-name-parser that prompts the user to enter a name in one of the following two formats:
//  first last
//  or
//  first middle last
// Make sure to trim the name before proceeding in case the user entered leading or trailing spaces.
// Parse the name and process it so that you can display the individual pieces of the name.
// A sample trace of your program output is shown below.
// Bolded code is what the user entered.
// Please enter your name:
//  Dana L. Wyatt↵
//  First name: Dana
//  Middle name: L.
//  Last name: Wyatt
//  A different trace would be:
//  Please enter your name: Dana Wyatt↵
//  First name: Dana
//  Middle name: (none)
//  Last name: Wyatt
// Step 2
//  1. Ensure all your changes are committed and pushed to GitHub
//  2. Send your repository URL to your Instructor