public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNum;

    public Instructor(String fn, String ln, String num) {
        setFirstName(fn);
        setLastName(ln);
        setOfficeNum(num);
    }

    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public void setOfficeNum(String num) {
        this.officeNum = num;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOfficeNum() {
        return officeNum;
    }

    public void print() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Office: " + getOfficeNum());
    }
}
