package Assignment2;

public class Main {

    // 1 = eligible
    // 0 = not eligible
    // "Dean for consideration"
    public static void main(String[] args) {
        Student s;
        StudentTester st;
        String t;

        // initialize locations
        Location validLocation = new Location("California", 2);
        Location invalidPlace = new Location("Washington", 2);
        Location invalidDuration = new Location("California", 1);

        // initialize experiences
        Experience fullTime = Experience.FULL_TIME;
        Experience partTime = Experience.PART_TIME;
        Experience volunteer = Experience.VOLUNTEER;

        // initialize scholarship
        Scholarship sch = new Scholarship("computer science");

        // // initialize ineligible student
        // s = new Student(27, invalidPlace, null, 10000, false);

        // TEST A: age && residency (lives in CA)
        s = new Student(20, validLocation, partTime, 10000, false);
        st = new StudentTester(sch, s);
        st.verifyStudent();
        t = "[A] valid age && valid residence (lives in CA)";
        System.out.printf("%-50s %30s\n", t, st.result);

        // TEST B: age && residency (parents live in CA)
        s = new Student(20, invalidPlace, null, 10000, true);
        st = new StudentTester(sch, s);
        st.verifyStudent();
        t = "[B] valid age && valid residence (parents live in CA)";
        System.out.printf("%-50s %30s\n", t, st.result);

        // TEST C: age && residency (works in CA)
        fullTime.setDuration(6);
        s = new Student(20, invalidPlace, fullTime, 10000, false);
        st = new StudentTester(sch, s);
        st.verifyStudent();
        t = "[C] valid age && valid residence (works in CA)";
        System.out.printf("%-50s %30s\n", t, st.result);
        fullTime.setDuration(0); // reset

        // TEST D: age && residency (volunteers in CA)
        s = new Student(20, invalidPlace, volunteer, 10000, false);
        st = new StudentTester(sch, s);
        st.verifyStudent();
        t = "[D] valid age && valid residence (volunteers in CA)";
        System.out.printf("%-50s %30s\n", t, st.result);

        // TEST E: !age && residency
        s = new Student(17, invalidPlace, fullTime, 10000, false);
        st = new StudentTester(sch, s);
        st.verifyStudent();
        t = "[E] invalid age && valid residence";
        System.out.printf("%-50s %30s\n", t, st.result);

        // TEST F: age && !residency && !dean
        s = new Student(17, invalidPlace, fullTime, 10000, false);
        st = new StudentTester(sch, s);
        st.verifyStudent();
        t = "[F] valid age && invalid residence && ";
        System.out.printf("%-50s %30s\n", t, st.result);

    }
}
