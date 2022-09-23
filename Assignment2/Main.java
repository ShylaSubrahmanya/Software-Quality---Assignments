package Assignment2;

public class Main {

    // 1 = eligible
    // 0 = not eligible
    // "Dean for consideration"
    public static void main(String[] args) {
        // initialize locations
        Location valid = new Location("California", 2);
        Location invalidPlace = new Location("Washington", 2);
        Location invalidDuration = new Location("California", 1);

        // initialize experiences
        Experience full = Experience.FULL_TIME;
        Experience part = Experience.PART_TIME;
        Experience volunteer = Experience.VOLUNTEER;

        ////// TEST A////////
        Student a = new Student(20, valid, part, 4000);

    }
}
