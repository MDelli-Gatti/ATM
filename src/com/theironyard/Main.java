package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");
        System.out.println("What is your name?");

        String name = scanner.nextLine();

        System.out.println("Hello " + name + ". How may I help you today?");
        System.out.println("Press 1 to check your balance.");
        System.out.println("Press 2 to withdraw funds.");
        System.out.println("Press 3 to cancel");

        String selection = scanner.nextLine();

        if (selection.equals("1")){
            System.out.println("Your balance is $100");
        }
        else if (selection.equals("2")) {
            System.out.println("How much would you like to withdraw?");
            String amt = scanner.nextLine();
            int amtInt = Integer.valueOf(amt);
            if (amtInt > 100) {
                throw new Exception ("You and I both know you don't have that much money.");
            }
            else if (amtInt > 0) {
                System.out.println("you have withdrawn " + amt + " dollars. Please take your money.");
            }
            else {
                System.out.println("Did you mean to select deposit?");
            }
        }
        else if (selection.equals("3")) {
            System.out.println("Thank you and please come again.");
        }
        else {
            throw new Exception("Invalid Selection");
        }


    }
}
