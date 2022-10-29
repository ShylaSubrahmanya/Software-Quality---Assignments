// test driver
public class Main {

        // test runner
        public static void main(String[] args) {
                Ticketing t = new Ticketing(); // ticketing system object

                System.out.println("------------------------TEST STARTING-----------------------");

                // storytelling
                System.out.println("<INPUT: boy, 8 | EXPECTED OUTPUT: Storytelling>\n >> OUTPUT: "
                                + t.ticketSold("boy", 8));
                System.out.println("------------------------------------------------------------");

                // drawing
                System.out.println(
                                "<INPUT: girl, 9 | EXPECTED OUTPUT: Drawing>\n >> OUTPUT: " + t.ticketSold("girl", 9));
                System.out.println("------------------------------------------------------------");

                // quiz
                System.out.println("<INPUT: boy, 14 | EXPECTED OUTPUT: Quiz>\n >> OUTPUT: " + t.ticketSold("boy", 14));
                System.out.println("------------------------------------------------------------");

                // essay writing
                System.out
                                .println("<INPUT: girl, 13 | EXPECTED OUTPUT: Essay Writing>\n >> OUTPUT: "
                                                + t.ticketSold("girl", 13));
                System.out.println("------------------------------------------------------------");

                // rhyming
                System.out.println("<INPUT: boy, 5 | EXPECTED OUTPUT: Rhyming>\n >> OUTPUT: " + t.ticketSold("boy", 5));
                System.out.println(
                                "<INPUT: girl, 3 | EXPECTED OUTPUT: Rhyming>\n >> OUTPUT: " + t.ticketSold("girl", 3));
                System.out.println("------------------------------------------------------------");

                // poetry
                System.out.println(
                                "<INPUT: boy, 24 | EXPECTED OUTPUT: Poetry>\n >> OUTPUT: " + t.ticketSold("boy", 24));
                System.out.println(
                                "<INPUT: girl, 21 | EXPECTED OUTPUT: Poetry>\n >> OUTPUT: " + t.ticketSold("girl", 21));
                System.out.println("------------------------------------------------------------");

                // no ticket can be sold
                System.out.println(
                                "<INPUT: boy, -1 | EXPECTED OUTPUT: NO TICKETS CAN BE SOLD.>\n >> OUTPUT: "
                                                + t.ticketSold("boy", -1));
                System.out.println(
                                "<INPUT: cats, 9 | EXPECTED OUTPUT: NO TICKETS CAN BE SOLD.>\n >> OUTPUT: "
                                                + t.ticketSold("cats", 9));
                System.out.println("------------------------------------------------------------");
        }

}
