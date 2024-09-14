public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, int cap) {
        super(name);
        setCargoCapacity(cap);
    }

    public void setCargoCapacity(int cap) {
        this.cargoCapacity = cap;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + super.getShipName());
        System.out.println("Cargo Capacity in Tonnage: " + getCargoCapacity());
    }
}