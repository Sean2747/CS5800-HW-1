public class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String name, String year) {
        setShipName(name);
        setYearBuilt(year);
    }

    public Ship(String name) {
        setShipName(name);
    }

    public void setShipName(String name) {
        this.shipName = name;
    }

    public void setYearBuilt(String year) {
        this.yearBuilt = year;
    }

    public String getShipName() {
        return shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Year Built: " + getYearBuilt());
    }

}
