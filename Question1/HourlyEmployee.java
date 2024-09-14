public class HourlyEmployee extends Employee {
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String fn, String ln, String snn, int w, int h) {
        super(fn, ln, snn);
        setWage(w);
        setHours(h);
    }

    public void setWage(int w) {
        this.wage = w;
    }

    public void setHours(int h) {
        this.hoursWorked = h;
    }

    public int getWage() {
        return wage;
    }

    public int getHours() {
        return hoursWorked;
    }

    public void display() {
        super.display();
        System.out.println("Wage: $" + getWage());
        System.out.println("Hours Worked: " + getHours());
    }
}
