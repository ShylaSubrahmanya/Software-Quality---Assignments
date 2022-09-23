package Assignment2;

public enum Experience {
    PART_TIME("part-time"),
    FULL_TIME("full-time"),
    VOLUNTEER("volunteer", true);

    public String title;
    public String field;
    public int duration; // in months
    public boolean proof;

    Experience(String title) {
        this.title = title;
        this.field = null;
        this.duration = 0;
        this.proof = false;
    }

    Experience(String title, boolean proof) {
        this.title = title;
        this.field = null;
        this.duration = 0;
        this.proof = proof;
    }

    void setField(String f) {
        field = f;
    }

    void setDuration(int d) {
        duration = d;
    }

}
