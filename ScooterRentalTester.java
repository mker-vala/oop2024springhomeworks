package homeworks.hw1.scooter;

public class ScooterRentalTester {

    public static void main(String[] args) {
        // Create a rental company and add scooters
        RentalCompany rentalCompany = new RentalCompany();
        rentalCompany.addScooter(new Scooter("Javafast 24", 100,40.730610, -73.935242, true)); // Home location
        rentalCompany.addScooter(new Scooter("Javafast 24", 100, 41.7121106, 44.7489232, true)); // University location

        // Rent the scooter and go from home to the University
        rentAndMove(rentalCompany, 0, 40.730610, -73.935242, 41.7121106, 44.7489232);

        // Rent the scooter after 1 hour and go from University to home
        try {
            Thread.sleep(1000 * 60 * 60); // Wait for 1 hour (in milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        rentAndMove(rentalCompany, 1, 41.7121106, 44.7489232,40.730610, -73.935242);
    }

    /**
     * Method to rent a scooter, move to a destination, and return the scooter.
     *
     * @param rentalCompany The rental company from which to rent the scooter.
     * @param scooterIndex  The index of the scooter to rent.
     * @param startX        The starting X-coordinate.
     * @param startY        The starting Y-coordinate.
     * @param endX          The destination X-coordinate.
     * @param endY          The destination Y-coordinate.
     */
    public static void rentAndMove(RentalCompany rentalCompany, int scooterIndex,
                                   double startX, double startY, double endX, double endY) {
        // Rent the scooter
        rentalCompany.rentScooter(scooterIndex);
        // Move to the destination
        System.out.println("Moving from (" + startX + ", " + startY + ") to (" + endX + ", " + endY + ")");
        // Return the scooter
        rentalCompany.returnScooter(scooterIndex, endX, endY);
    }
}

