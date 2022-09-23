package Assignment2;

public class StudentTester {
    private Scholarship sch;

    public StudentTester(Scholarship sch) {
        this.sch = sch;
    }

    public String verifyStudent(Student s) {
        return this.checkAge(s.age) && this.checkLocation(s.home, s) && this.checkExperience(s.exp)
                && this.checkIncome(s.income) ? "1" : "0";
    }

    public boolean checkAge(int age) {
        return (age >= 18 && age <= 24);
    }

    public boolean checkLocation(Location l, Student s) {
        return (l.place.equals("California") && l.duration >= 2) || s.taxPaid;
    }

    public boolean checkExperience(Experience e) {
        // return (part time for 6 months in relevant field) OR (volunteer w/ proof);
        return (e == Experience.PART_TIME && e.field.equals(sch.field) && e.duration >= 6) || (e == Experience.VOLUNTEER
                && e.proof == true);
    }

    public boolean checkIncome(int i) {
        return i < 5000;
    }

}
