package Assignment2;

public enum Experience {
    PART_TIME("part-time"),
    FULL_TIME("full-time"),
    VOLUNTEER("volunteer", true);

    public String title;
    public int duration; // in months
    public boolean proof;

    Experience(String title) {
        this.title = title;
        this.duration = 0;
        this.proof = false;
    }

    Experience(String title, boolean proof) {
        this.title = title;
        this.duration = 0;
        this.proof = proof;
    }

    void setDuration(int d) {
        duration = d;
    }

}
