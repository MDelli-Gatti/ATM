package com.theironyard;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner((System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");

        Customer customer = new Customer();

        customer.greeting();
        customer.menu();
        customer.input();
    }
}
