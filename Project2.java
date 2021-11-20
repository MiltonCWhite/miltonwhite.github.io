package com.CS102;

import java.util.Scanner;

public class Project2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 1; i < 11; i++) {
           // accounts[i-1] = new Account(i, 100.0);
        }

        System.out.print("Enter an id (0 - 9): ");
        int id = scanner.nextInt();

        if (id < 0 || id > 9) {
            id = incorrectId(id);
        }

        while (id >= 0 && id <= 9) {
            menuDisplay();
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.printf("%nEnter an id (0 - 9): ");
                id = scanner.nextInt();

                if (id < 0 || id > 9) {
                    id = incorrectId(id);
                }
            }
            ExecutionOfChoice(id, choice, accounts);
        }
    }

    public static int incorrectId(int id) {
        Scanner scanner1 = new Scanner(System.in);
        while (id < 0 || id > 9) {
            System.out.print("Please enter a valid id: ");
            id = scanner1.nextInt();
            System.out.println();
        }
        return id;
    }

    public static void ExecutionOfChoice(int id, int choice, Account[] accounts) {
        Scanner scanner2 = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.printf("The balance is $%.1f%n",
                        accounts[id].getBalance());
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id].withdraw(scanner2.nextDouble());
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id].deposit(scanner2.nextDouble());
                break;
            case 4:
                break;
        }
    }

    public static void menuDisplay() {
        System.out.printf("%nMain menu%n");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }
    }

