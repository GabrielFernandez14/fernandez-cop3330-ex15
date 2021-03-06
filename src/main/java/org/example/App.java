/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;
import java.util.Scanner;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Password is set as a constant
        final String password = "abc$123";

        // Prompt user for the username
        System.out.println("What is your username?");
        Scanner usernameIn = new Scanner(System.in);
        String username = usernameIn.next();

        // Prompt the user for the password and store in passwordIn
        System.out.println("What is the password?");
        Scanner pass = new Scanner(System.in);

        // Validate if inputted password matches with constant
        if (password.equals(pass.next())) {
            // If it matches, the user inputted the correct password
            System.out.println("Welcome " + username + "!");
        }
        // If it doesn't match, print "I don't know you."
        else {
            System.out.println("I don't know you.");
        }
    }
}
