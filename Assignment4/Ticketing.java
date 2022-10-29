import java.util.ArrayList;

// object that represents ticketing system
public class Ticketing {
    ArrayList<Competition> competitions = new ArrayList<>(); // list that holds all competitions

    // ctor for object
    // adds all competitions to array list
    public Ticketing() {
        // storytelling competition
        competitions.add(new Competition("Storytelling", true, false, 7, 10));

        // drawing competition
        competitions.add(new Competition("Drawing", false, true, 7, 10));

        // quiz competition
        competitions.add(new Competition("Quiz", true, false, 11, 15));

        // essay writing competition
        competitions.add(new Competition("Essay Writing", false, true, 10, 15));

        // rhyming competition
        competitions.add(new Competition("Rhyming", true, true, 0, 6));

        // poetry competition
        competitions.add(new Competition("Poetry", true, true, 20, 100));
    }

    // given a child (gender and age)
    // returns string for result of whether ticket can be sold or not
    // if yes, say for which competitin
    public String ticketSold(String gender, int age) {
        boolean boy = false, girl = false; // default gender of child

        // if a boy --> set gender (boy = true)
        if (gender.equals("boy")) {
            boy = true;
        }
        // if a girl --> set gender (girl = true)
        else if (gender.equals("girl")) {
            girl = true;
        }
        // if invalid gender given
        else {
            return "NO TICKETS CAN BE SOLD.";
        }

        // check array list for valid competition for child
        for (Competition c : competitions) {
            // if child's gender is valid for this competition
            if (c.boy == boy || c.girl == girl) {
                // if child's age falls in valid range for this competition
                if (age > c.lowerAge && age < c.upperAge) {
                    // child can compete in this competition
                    return c.title; // return title of competition
                }
            }
        }

        return "NO TICKETS CAN BE SOLD.";
    }

}
