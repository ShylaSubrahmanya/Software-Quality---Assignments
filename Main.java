import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine();

        Scanner in = new Scanner(System.in);

        System.out.println("How many QUARTERS would you like to insert?");

        int quarters = Integer.parseInt(in.nextLine());
        gm.balance += (quarters * 25);

        System.out.println("BALANCE: " + gm.balance);

    }
}
