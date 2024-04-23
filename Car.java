import java.util.ArrayList;

/*Create Car class*/
public class Car {
    public static Object current;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int maxCapacity;

    public Car(ArrayList<Passenger> passengers, int maxCapacity) {
        this.passengers = passengers;
        this.maxCapacity = maxCapacity;
    }

    /**
     * Accessor of getting maximum capacity
     * 
     * @return
     */
    public int getCapacity() {
        return this.maxCapacity;
    }

    /**
     * Checks remaining seats from subtracting max capacity from # of passengers
     * 
     * @return
     */
    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }

    /**
     * Add passenger
     * 
     * @param passenger add passengers on current passenger
     * @return
     */
    public boolean addPassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            System.err.println("The passenger is already on board.");
            return false;
        } else {
            if (passengers.size() < maxCapacity) {
                this.passengers.add(passenger);
                return true;
            }
            System.out.println("The car doesn't have available seats.");
            return false;
        }
    }

    /**
     * Remove passenger
     * 
     * @param P remove specific passenger
     * @return
     */
    public boolean removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            this.passengers.remove(passenger);
            System.out.println("The passenger is removed.");
            return true;
        } else {
            System.out.println("The person is not in the car");
            return false;
        }
    }

    /**
     * Print manifest
     * If # of passenger is equal to 0, print "This car is EMPTY"
     * Other wise, increment # of passengers and print passenger wth name
     */
    public void printManifest() {
        if (passengers.size() == 0) {
            System.out.println("This car is EMPTY.");
        } else {
            for (int i = 0; i < passengers.size(); i++) {
                System.out.println(passengers.get(i).getname());
            }
        }
    }
}
