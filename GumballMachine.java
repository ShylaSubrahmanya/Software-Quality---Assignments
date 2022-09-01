class GumballMachine {
    public int balance;
    public int changeVal;

    public GumballMachine() {
        this.balance = 0;
        this.changeVal = 0;
    }

    public void dispenseChange() {
        System.out.printf(
                "---------CHANGE DISPENSED: $%.2f-----------\n",
                this.balance / 100.00);

        int rem = balance % 25;
        int quarters = balance / 25;
        balance -= quarters * 25;

        rem = balance % 10;
        int dimes = balance / 10;
        balance -= dimes * 10;

        rem = balance % 5;
        int nickels = balance / 5;

        System.out.println(quarters + " quarter(s)");
        System.out.println(dimes + " dime(s)");
        System.out.println(nickels + " nickel(s)");
        System.out.println("-------------------------------------------");
    }
}