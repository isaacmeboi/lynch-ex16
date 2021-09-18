/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Isaac Lynch
 */

package exercise15;


import java.util.Scanner;

class Passwords {
    String user;
    String password;
    String password2;

    public void scn() {

        System.out.print("Type in username: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in password: ");
        this.password = sc.next();
        System.out.print("Retype in password: ");
        this.password2 = sc.next();
    }

    public void prt() {
        if(password.equals(password2)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("Sorry, I don't know you.");
        }

    }
}
public class solution15{
    public static void main(String[] args) {
        Passwords ca = new Passwords();
        ca.scn();
        ca.prt();

    }
}
/*
i think im finally starting to find joy in these exercises now that i got the instructions right lol.
the first thing we have to do is call the scanner function, after that there is a class called passwords
which holds the intialization for the strings username, password, and password2. then, two public voids
are created, scn which scans in the user's inputs for the password, the username, and then retyping the
password. have the password retyped ensures that there can be a comparison between what was input the
first and second time ti trigger the if else statement in prt. then there is prt which holds the if
else statement and prints the correct output for either a correct or incorrect password. finally, the
main bdy then calls these two functions and runs the program.
 */
