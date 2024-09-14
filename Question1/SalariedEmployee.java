import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {
    private int weeklySalary;
    DecimalFormat formatter = new DecimalFormat("#,###");

    public SalariedEmployee(String fn, String ln, String snn, int ws) {
        super(fn, ln, snn);
        setWeeklySalary(ws);
    }

    public void setWeeklySalary(int ws) {
        this.weeklySalary = ws;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void display() {
        super.display();
        System.out.println("Weekly Salary: $" + formatter.format(getWeeklySalary()));
    }
}
