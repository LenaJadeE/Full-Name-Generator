
package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String first = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middle = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String last = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullName = first;

        if (!middle.isEmpty()) {
            fullName += " " + middle;
        }

        fullName += " " + last;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println();
        System.out.println("Full name: " + fullName);

    }
}

// Step 1
// Create a Java application called full-name-generator.
// Ensure that you set the GroupId to com.pluralsight.
// Create a new package named com.pluralsight and add a new class called FullNameApplication for the main() method.
// You will prompt the user to enter the parts of their name.
// You will then create a new string that holds the user’s full name.
// The user will always have a first and last name;
// they may also have a middle name and a suffix (ex. Jr, PhD).
// If a user does not enter a value for the middle name or suffix, the full name should not include that part of the name.
// If the user has a suffix in their name, the full name should include a comma before the suffix.
//  Glen Williams
//  Glen C. Williams
//  Glen Williams, PhD
//  Glen C. Williams, PhD
// Make sure to trim any leading or trailing spaces that the user may have entered.
// Note: the ↵ represents the user hitting the ENTER key
//      Please enter your name
//      First name: Glen↵
//      Middle name: ↵
//      Last name: Williams↵
//      Suffix: ↵
//      Full name: Glen Williams
//      13
// Exercises – Full Names
// A different example would be a name with a middle initial:
//      Please enter your name
//      First name: Glen↵
//      Middle name: C. ↵
//      Last name: Williams↵
//      Suffix: ↵
// Full name: Glen C. Williams
//  Step 2
//      1. Ensure all your changes are committed and pushed to GitHub
//      2. Send your repository URL to your Instructor