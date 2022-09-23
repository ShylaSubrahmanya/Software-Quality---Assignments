package Assignment2;

public class Student {
    protected int age;
    protected Location home;
    protected boolean taxPaid;
    protected Experience exp;
    protected int income;

    public Student(int age, Location home, Experience exp, int income) {
        this.age = age;
        this.income = income;
        this.home = home;
        this.exp = exp;

        taxPaid = false;

    }

    public void setHome(Location l) {
        home = l;
    }

    public void setTax(boolean t) {
        taxPaid = t;
    }

    public void setExperience(Experience e) {
        exp = e;
    }

    public void setIncome(int i) {
        income = i;
    }
}
