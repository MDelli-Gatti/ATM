package com.theironyard;

import static com.theironyard.Main.scanner;

/**
 * Created by michaeldelli-gatti on 5/18/16.
 */
public class Customer {
    String name;
    int amtInt;
    int bal;
    boolean needsHelp;

    public void greeting() {
        System.out.println("What is your name?");

        name = scanner.nextLine();

        System.out.println("Hello " + name + ". How may I help you today?");
    }
    public void menu(){
            System.out.println("Press 1 to check your balance.");
            System.out.println("Press 2 to withdraw funds.");
            System.out.println("Press 3 to cancel");

    }

    public void input() throws Exception {

        String selection = scanner.nextLine();

        bal = 100;

        if (selection.equals("1")) {
            System.out.println("Your balance is $" + bal);
        } else if (selection.equals("2")) {
            System.out.println("How much would you like to withdraw?");
            String amt = scanner.nextLine();
            amtInt = Integer.valueOf(amt);
            if (amtInt > 100) {
                throw new Exception("You and I both know you don't have that much money.");
            } else if (amtInt > 0) {
                System.out.println("you have withdrawn $" + amt + ". Please take your money. Your new balance is $" + (bal - amtInt) + ".");
            } else {
                System.out.println("We don't do deposits here.");
            }
        } else if (selection.equals("3")) {
            System.out.println("Thank you " + name + " please come again.");
            needsHelp = false;
        } else {
            throw new Exception("Invalid Selection");
        }
    }

}
