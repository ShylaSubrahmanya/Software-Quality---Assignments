package Assignment2;

public class Student {
    protected int age; // in yrs
    protected Location home; // where student lives
    protected Experience exp; // current occupation
    protected int income; // household income
    protected boolean parentResidents; // are their parents residents of CA?

    // ctor
    public Student(int age, Location home, Experience exp, int income, boolean parentResidents) {
        this.age = age;
        this.income = income;
        this.home = home;
        this.exp = exp;
        this.parentResidents = parentResidents;

    }
}
