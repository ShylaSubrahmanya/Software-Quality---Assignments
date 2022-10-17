import java.util.ArrayList;

public class Ticketing {
    ArrayList<Competition> competitions = new ArrayList<>();

    public Ticketing() {
        // storytelling
        competitions.add(new Competition("Storytelling", true, false, 7, 10));

        // drawing
        competitions.add(new Competition("Drawing", false, true, 7, 10));

        // quiz
        competitions.add(new Competition("Quiz", true, false, 11, 15));

        // essay writing
        competitions.add(new Competition("Essay Writing", false, true, 10, 15));

        // rhyming
        competitions.add(new Competition("Rhyming", true, true, 0, 6));

        // poetry
        competitions.add(new Competition("Poetry", true, true, 20, 100));
    }

    public String ticketSold(String gender, int age) {
        boolean boy = false, girl = false;
        if (gender.equals("boy")) {
            boy = true;
        } else if (gender.equals("girl")) {
            girl = true;
        } else {
            return "NO TICKETS CAN BE SOLD.";
        }

        for (Competition c : competitions) {
            if (c.boy == boy || c.girl == girl) {
                if (age > c.lowerAge && age < c.upperAge) {
                    return c.title;
                }
            }
        }

        return "NO TICKETS CAN BE SOLD.";
    }

}
