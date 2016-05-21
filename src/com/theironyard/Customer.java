package com.theironyard;

import java.util.HashMap;

import static com.theironyard.Main.scanner;

/**
 * Created by michaeldelli-gatti on 5/18/16.
 */
public class Customer {
    String name;
    Double amtD;
    double bal;
    HashMap<String, Double> account = new HashMap<>();

    public void greeting() throws Exception {
        System.out.println("What is your name?");

        name = scanner.nextLine();
        if (account.get (name) == null){
            System.out.println("You were not recognized in our system. Let's create an account...");
            System.out.println("What is your starting balance?");
            String amt = scanner.nextLine();
            bal = Double.valueOf(amt);
            account.put(name, bal);
        }
        else {
            System.out.println("Hello " + name + ". How may I help you today?");
            bal = account.get (name);
        }
    }

    public void input() throws Exception {
        while (true) {
            System.out.println("Press 1 to check your balance.");
            System.out.println("Press 2 to withdraw funds.");
            System.out.println("Press 3 to cancel");
            System.out.println("Press 4 to delete account");


            String selection = scanner.nextLine();

            if (selection.equals("1")) {
                System.out.println("Your balance is $" + bal);
            }
            else if (selection.equals("2")) {
                System.out.println("How much would you like to withdraw?");

                String amt = scanner.nextLine();
                amtD = Double.valueOf(amt);

                if (amtD > bal) {
                    throw new Exception("You cant withdraw money you don't have.");
                }
                else if (amtD > 0.00) {
                    bal = bal- amtD;
                    System.out.println("You have withdrawn $" + amt + ". Please take your money. Your new balance is $" + (bal) + ".");
                    account.put(name, bal);
                }
                else {
                    System.out.println("We don't do deposits here.");
                }
            }
            else if (selection.equals("3")) {
                System.out.println("Thank you " + name + " please come again.");
                break;
            }
            else if (selection.equals("4")) {
                account.remove(name);
                    System.out.println("Your account has been deleted");
                break;
            }
             else {
                throw new Exception("Invalid Selection");
            }
        }
    }

}
