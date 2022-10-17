public class Competition {
    public String title;
    public boolean boy;
    public boolean girl;
    public int lowerAge; // exclusive lower bound
    public int upperAge; // exclusive upper bound

    public Competition(String title, boolean boy, boolean girl, int lowerAge, int upperAge) {
        this.title = title;
        this.boy = boy;
        this.girl = girl;
        this.lowerAge = lowerAge;
        this.upperAge = upperAge;
    }
}