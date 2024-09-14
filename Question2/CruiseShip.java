public class CruiseShip extends Ship {
    private int MaxNumPassengers;

    public CruiseShip(String name, int max) {
        super(name);
        setMaxNumPassengers(max);
    }

    public void setMaxNumPassengers(int max) {
        this.MaxNumPassengers = max;
    }

    public int getMaxNumPassengers() {
        return MaxNumPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + super.getShipName());
        System.out.println("Maximum Number of Passengers: " + getMaxNumPassengers());
    }
}
