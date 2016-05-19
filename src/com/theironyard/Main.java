package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();

        while (true) {
            System.out.println("Welcome!");

            customer.greeting();
            customer.input();
        }
    }
}
