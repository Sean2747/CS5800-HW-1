import java.text.DecimalFormat;

public class BaseEmployee extends Employee {
    private int baseSalary;
    DecimalFormat formatter = new DecimalFormat("#,###");

    public BaseEmployee(String fn, String ln, String snn, int b) {
        super(fn, ln, snn);
        setBaseSalary(b);
    }

    public void setBaseSalary(int b) {
        this.baseSalary = b;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void display() {
        super.display();
        System.out.println("Base Salary: $" + formatter.format(getBaseSalary()));
    }
}
