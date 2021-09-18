/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Isaac Lynch
 */

package exercise16;


import java.util.Scanner;

public class solution16{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = sc.nextInt();
        String result = (age > 15) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);

    }
}
/*
FINALLY AN EASY ONE TO BREAK UP THE INSANITY. very easy, first the scanner function is imported.
after that the main function has the solution because its only four lines of code. first the
user puts in their age which is stored in "age", after that the result is output through a
ternary operator which sees whether or not the user's age is below or above 16. if it is the
program prints that you are old enough to drive, otherwise it prints that you are not.
 */