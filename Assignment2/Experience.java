package Assignment2;

public enum Experience {
    // different occupation types
    PART_TIME("part-time"),
    FULL_TIME("full-time"),
    VOLUNTEER("volunteer", true),
    UNEMPLOYED("unemployed");

    public String title;
    public int duration; // in months
    public boolean proof; // only for VOLUNTEER

    // ctors for part-time, full-time, unemployed
    Experience(String title) {
        this.title = title;
        this.duration = 0;
        this.proof = false;
    }

    // ctor for volunteer
    Experience(String title, boolean proof) {
        this.title = title;
        this.duration = 0;
        this.proof = proof;
    }

    // sets duration to d
    void setDuration(int d) {
        duration = d;
    }

}
