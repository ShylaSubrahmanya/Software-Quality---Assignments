import java.util.Scanner; //scanner for taking user input 
import java.util.HashMap; // Using HashMap to store the coins and colors 

public class Gumball {
    public static void main(String args[]) {
        int dime = 10;
        int nickle = 5;
        int billvalue = 0;
        int numberOfGumball = 0;
        String gumballColor = "";

        HashMap<String, Integer> hashmap = new HashMap<>(); // taking String for key Integer for value
        hashmap.put("quater", 25);
        hashmap.put("dime", 10);
        hashmap.put("nickle", 5);
        hashmap.put("red", -1); // giving negative values here, so that it will not be considered as a valid
                                // coin
        hashmap.put("yellow", -2);

        Scanner gumColor = new Scanner(System.in); // Takes the color of the Gumball
        Scanner gumCount = new Scanner(System.in); // takes the count of the Gumball
        Scanner gumballPrice = new Scanner(System.in); // takes the value of the coin
        System.out.println("Choose the Gumballs: Red: Nickle. Yellow: Dime"); // Display message for users
        String str = gumColor.nextLine();// stores the user enterd gumball color
        gumballColor = str.toLowerCase(); // converting gumball color to lowercase for uniformity
        if (hashmap.containsKey(gumballColor)) { // checks if user entered any other color other than red and yellow
            System.out.println("How many" + " " + gumballColor + " Gumball you want ?"); // Asking user how many gumball
                                                                                         // they would like
            numberOfGumball = gumCount.nextInt(); // storing the count of the gumball
            System.out.println("Enter Coins, We only accept Dime = 10, Nickle=5, and Quater=25"); // Asking for valid
                                                                                                  // coins
            billvalue = gumballPrice.nextInt(); // storing the coins
        }

        if (billvalue != 0 && hashmap.containsValue(billvalue)) { // checking if user enterd valid coins and it is not 0

            // calculation for red Gumball

            if (gumballColor.equals("red")) {
                billvalue = billvalue - nickle * numberOfGumball;
                if (billvalue < 0) {
                    System.out.println(" This amount is not sufficient"); // Error message if the user has insuffient
                                                                          // amount
                } else {

                    // Generating the Reciept for red Gumball
                    System.out.println("Thank you for shoping! This is your bill");
                    System.out.println("You ordered " + numberOfGumball + " " + gumballColor + " Gumbal = "
                            + nickle * numberOfGumball);
                    System.out.println(billvalue + " This is your change");
                }

                // Calculation for yellow Gumball
            } else {

                billvalue = billvalue - dime * numberOfGumball;
                if (billvalue < 0) {
                    System.out.println("This amount is not sufficient");
                } else {
                    // Generating the Reciept for Yellow gumball

                    System.out.println("Thank you for shoping! This is your bill");
                    System.out.println("You orderd " + numberOfGumball + " " + gumballColor + " Gumbal = "
                            + dime * numberOfGumball);
                    System.out.println(billvalue + " This is your change");
                }
            }

            // error message for invalid coins
        } else {
            System.out.println("Please make sure you entered valid coin and valid color");

        }

    }
}
