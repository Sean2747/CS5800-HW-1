import java.text.DecimalFormat;

public class CommisionEmployee extends Employee {
    private int commisionRate;
    private int grossSales;
    DecimalFormat formatter = new DecimalFormat("#,###");

    public CommisionEmployee(String fn, String ln, String snn, int cr, int gs) {
        super(fn, ln, snn);
        setCommisionRate(cr);
        setGrossSales(gs);
    }

    public void setCommisionRate(int cr) {
        this.commisionRate = cr;
    }

    public void setGrossSales(int gs) {
        this.grossSales = gs;
    }

    public int getCommisionRate() {
        return commisionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void display() {
        super.display();
        System.out.println("Commision Rate: " + getCommisionRate() + "%");
        System.out.println("Gross Sales: $" + formatter.format(getGrossSales()));
    }
}
