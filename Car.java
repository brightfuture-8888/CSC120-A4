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
        return this.passengers.add(passenger);
    }

    /**
     * Remove passenger
     * 
     * @param P remove specific passenger
     * @return
     */
    public boolean removePassenger(Passenger P) {
        this.passengers.remove(P);

        if (this.passengers.contains(P)) {
            return true;
        } else {
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
