import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ship[] ships = new Ship[3]; // an array of three ships

        System.out.print("Enter the name of the ship: "); // Ship1
        String shipName1 = in.nextLine();
        System.out.print("Enter the year the ship was built: ");
        String year = in.nextLine();
        ships[0] = new Ship(shipName1, year);
        System.out.println();

        System.out.print("Enter the name of the cruise ship: "); // Ship2
        String shipName2 = in.nextLine();
        System.out.print("Enter the maximum number of passengers: ");
        int num = in.nextInt();
        ships[1] = new CruiseShip(shipName2, num);
        in.nextLine();
        System.out.println();

        System.out.print("Enter the name of the cruise ship: "); // Ship3
        String shipName3 = in.nextLine();
        System.out.print("Enter the cargo capacity in tonnage: ");
        int cap = in.nextInt();
        ships[2] = new CargoShip(shipName3, cap);
        in.nextLine();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            ships[i].print();
            System.out.println();
        }
        in.close();
    }
}