package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rental company that manages  scooters.
 */
public class RentalCompany {

    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    /**
     * Retrieves a list of available scooters.
     *
     * @return List of available scooters.
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a scooter to the rental company's fleet.
     *
     * @param scooter The scooter to be added.
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the rental company's fleet.
     *
     * @param id The ID of the scooter to be removed.
     * @return True if the scooter was successfully removed, false otherwise.
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter with the specified ID.
     *
     * @param id The ID of the scooter to be rented.
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                System.out.println("Scooter with ID " + id + " rented successfully.");
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " is either not available or does not exist.");
    }

    /**
     * Returns a rented scooter to the rental company and updates its location.
     *
     * @param id The ID of the scooter to be returned.
     * @param x  The new X-coordinate of the scooter.
     * @param y  The new Y-coordinate of the scooter.
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooter.setX(x);
                scooter.setY(y);
                scooter.setAvailable(true);
                System.out.println("Scooter with ID " + id + " returned successfully.");
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " does not exist.");
    }

    /**
     * Displays information about all scooters in the rental company's fleet.
     */
    public void displayAllScooters() {
        System.out.println("List of all scooters:");
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}
