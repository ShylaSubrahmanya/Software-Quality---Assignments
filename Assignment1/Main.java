// package Assignment1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine();

        Scanner in = new Scanner(System.in);

        System.out.println(
                "---------MENU---------\nRed Gumball------$0.05\nYellow Gumball---$0.10\n----------------------");

        boolean insertion = false;
        int quarters = -1;
        int dimes = -1;
        int nickels = -1;
        insertingCoins: while (!insertion) {
            System.out.println(
                    ">> Enter how many QUARTERS, DIMES, and NICKELS you would like to insert, respectively.\n>> Please separate values by commas.\n>> EXAMPLE INPUT: 1, 3, 5");

            String[] inserted = in.nextLine().split("[\\s,]+");

            if (inserted.length == 3) {
                quarters = Integer.parseInt(inserted[0]);
                dimes = Integer.parseInt(inserted[1]);
                nickels = Integer.parseInt(inserted[2]);
            }

            if (quarters >= 0 && dimes >= 0 && nickels >= 0 && inserted.length == 3) {
                insertion = true;
                gm.balance += (quarters * 25) + (dimes * 10) + (nickels * 5);
                break insertingCoins;
            }
            System.out.println(">> Invalid input. Please try again.");

        }

        System.out.printf(">> BALANCE: $%.2f\n", gm.balance / 100.00);

        System.out.println("---------PRESS [Q] TO EXIT---------");
        boolean exit = false;
        selling: while (gm.balance > 0 && !exit) {
            boolean redTransaction = false;
            boolean yellowTransaction = false;

            // red gumball lever
            while (!redTransaction) {
                System.out.printf(">> BALANCE: $%.2f\n", gm.balance / 100.00);
                System.out.println(">> Would you like a RED gumball?  [Y/N]");
                String response = in.nextLine();
                if (response.equalsIgnoreCase("y")) {
                    gm.balance -= 5;
                    System.out.println(
                            "-----------------------------------\nRED GUMBALL DISPENSED\n-----------------------------------");
                    redTransaction = true;
                } else if (response.equalsIgnoreCase("n")) {
                    redTransaction = true;
                } else if (response.equalsIgnoreCase("q")) {
                    exit = true;
                    break selling;
                } else {
                    System.out.println(">> Invalid Response. Please Try Again.");
                }
            }

            // yellow gumball lever
            while (!yellowTransaction) {
                System.out.printf(">> BALANCE: $%.2f\n", gm.balance / 100.00);
                System.out.println(">> Would you like a YELLOW gumball?  [Y/N]");
                String response = in.nextLine();
                if (response.equalsIgnoreCase("y")) {
                    gm.balance -= 10;
                    System.out.println(
                            "-----------------------------------\nYELLOW GUMBALL DISPENSED\n-----------------------------------");
                    yellowTransaction = true;
                } else if (response.equalsIgnoreCase("n")) {
                    yellowTransaction = true;
                } else if (response.equalsIgnoreCase("q")) {
                    exit = true;
                    break selling;
                } else {
                    System.out.println(">> Invalid Response. Please Try Again.");
                }
            }
        }

        // dispense change
        if (gm.balance > 0) {
            gm.dispenseChange();
        }
        in.close();
    }
}
