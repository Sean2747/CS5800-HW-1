public class Employee {
    private String FirstName;
    private String LastName;
    private String SSN;

    public Employee(String fn, String ln, String snn) {
        setFirstName(fn);
        setLastName(ln);
        setSSN(snn);
    }

    public void setFirstName(String fn) {
        this.FirstName = fn;
    }

    public void setLastName(String ln) {
        this.LastName = ln;
    }

    public void setSSN(String snn) {
        this.SSN = snn;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("SSN: " + getSSN());
    }
}
