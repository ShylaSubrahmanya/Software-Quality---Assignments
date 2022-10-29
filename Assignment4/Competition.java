// object that represents a competition
public class Competition {
    public String title; // title of competition
    public boolean boy; // true if boys can participate in the competition
    public boolean girl; // true if girls can participate in the competition
    public int lowerAge; // exclusive lower bound of age range
    public int upperAge; // exclusive upper bound of age range

    // ctor for object
    // initializes all instance variables
    public Competition(String title, boolean boy, boolean girl, int lowerAge, int upperAge) {
        this.title = title;
        this.boy = boy;
        this.girl = girl;
        this.lowerAge = lowerAge;
        this.upperAge = upperAge;
    }
}