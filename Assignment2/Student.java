package Assignment2;

public class Student {
    protected int age;
    protected Location home;
    protected Experience exp;
    protected int income;
    protected boolean parentResidents;

    public Student(int age, Location home, Experience exp, int income, boolean parentResidents) {
        this.age = age;
        this.income = income;
        this.home = home;
        this.exp = exp;
        this.parentResidents = parentResidents;

    }

    public void setHome(Location l) {
        home = l;
    }

    public void setParentsResidency(boolean t) {
        parentResidents = t;
    }

    public void setExperience(Experience e) {
        exp = e;
    }

    public void setIncome(int i) {
        income = i;
    }
}
