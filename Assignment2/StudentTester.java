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

    // updates result based on checkAge(), checkResidency(), checkIncome()
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

    // checks the student's age
    public boolean checkAge() {
        return (s.age >= 18 && s.age <= 24);
    }

    // checks the student's residency
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

    // checks the student's household income
    public boolean checkIncome() {
        return s.income < 5000;
    }

}
