package com.test.project;

import com.test.hib.controller.*;
import com.test.hib.model.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice = 0;
        while (choice != 9) {
            System.out.println("""
                    1. Add new user
                    2. Delete user
                    3. Update user
                    4. Show all users
                    9. Exit
                    """);
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    // Make user object
                    scanner.nextLine();
                    System.out.println("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.nextLine();
                    User user = new User(firstName, lastName);

                    // Make userDetails object
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    System.out.println("Enter age:");
                    int age = scanner.nextInt();
                    System.out.println("Enter salary:");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter State (two letter abbreviation):");
                    String state = scanner.nextLine();
                    UserDetails userDetails = new UserDetails(email, age, salary, state);
                    // try to create user
                    try {
                        new CreatingUser(user, userDetails);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {// Delete user
                }
                case 3 -> {// Update user
                }
                case 4 -> {// Show all users
                    new FindingUser();
                }
                case 9 -> {// Exit
                    System.out.println("Bye!");
                }

            }
        }

    }
}