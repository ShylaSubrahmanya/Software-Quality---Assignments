package Assignment2;

public class StudentTester {
    private Scholarship sch;
    private Student s;
    protected String result;

    public StudentTester(Scholarship sch, Student s) {
        this.sch = sch;
        this.s = s;
        result = "0";
    }

    /*
     * Here are the conditions for a student's scholarship eligibility again:
     * 
     * 1. Age: The student MUST be between 18 and 24 years of age
     * 
     * 2. CA Residency (one of these conditions MUST be met):
     * 
     * a. The student has lived in California for the last two years
     * 
     * b. The student has worked in California (part time or full time) at least for
     * six months
     * 
     * c. The student's parents have lived in California for at least one year
     * 
     * d. The student has volunteered for a public cause in California and show
     * proof of it
     * 
     * 3. Dean's Consideration
     * 
     * a. If the student doesn't meet the residency requirement but has household
     * income of less than $5000, the application may be granted eligibility by the
     * Dean.
     */

    public void verifyStudent() {
        // meets age and residency reqs
        if (checkAge() && checkResidency()) {
            result = "1";
        }
        // potential Dean's consideration
        else if (checkAge() && checkIncome()) {
            result = "Dean for consideration";
        }
    }

    public boolean checkAge() {
        return (s.age >= 18 && s.age <= 24);
    }

    public boolean checkResidency() {
        return
        // 2a. student lives in CA for 2 yrs
        (s.home.place.equals("California") && s.home.duration >= 2) ||
        // 2c. student's parents are CA residents for 1 yr
                (s.parentResidents) ||
                // 2b. student has worked for 6 months
                ((s.exp == Experience.PART_TIME || s.exp == Experience.FULL_TIME) && s.exp.duration >= 6) ||
                // 2d. student has volunteered and has proof
                (s.exp == Experience.VOLUNTEER && s.exp.proof == true);
    }

    // public boolean checkLocation(Location l) {
    // // return (student resides in CA) OR (parents reside in CA)
    // return (l.place.equals("California") && l.duration >= 2) ||
    // s.parentResidents;
    // }

    // public boolean checkExperience(Experience e) {
    // // return (part time for 6 months in relevant field) OR (volunteer w/ proof);
    // return (e == Experience.PART_TIME && e.field.equals(sch.field) && e.duration
    // >= 6) || (e == Experience.VOLUNTEER
    // && e.proof == true);
    // }

    public boolean checkIncome() {
        return s.income < 5000;
    }

}
