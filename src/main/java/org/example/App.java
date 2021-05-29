/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 15 - Password Validation
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

        // Prompt user for the username (which isn't actually used,
        // but the prompt asked for me to prompt them so I did)
        System.out.println("What is your username?");
        Scanner usernameIn = new Scanner(System.in);
        String username = usernameIn.next();

        // Prompt the user for the password and store in passwordIn
        System.out.println("What is the password?");
        Scanner passwordIn = new Scanner(System.in);

        // Validate if inputted password matches with constant
        if (password.equals(passwordIn.next())) {
            // If it matches, the user inputted the correct password
            System.out.println("Welcome!");
        }
        // If it doesn't match, print "I don't know you."
        else {
            System.out.println("I don't know you.");
        }
    }
}
