import java.util.ArrayList;

/*Engine class storing information about its fuel type, and level to power train*/
public class Engine {

    private FuelType fueltype;
    private double max;
    private double current;

    /**
     * Create Engine with fuel type, maximum fuel level , and current fuel level
     * @param fueltype 
     * @param max maximum fuel level
     * @param current current fuel level 
     */
    public Engine(FuelType fueltype, double max, double current) {
        this.fueltype = fueltype;
        this.max = max;
        this.current = current;
    }

    /**
     * Define fuel type
     * Accessor 
     * 
     * @return
     */
    public FuelType getfFuelType() {
        return fueltype;
    }

    /* Define refuel: when current fuel level equal to maximum fuel level, refuel */
    public void refuel() {
        current = max;
    }

    /**
     * Current fuel level decreases by 10 when Train goes
     * If current level is greater than 0 Engine works. Otherwise, Engine doesn't
     * work.
     * 
     * @return
     */
    public boolean go() {
        current = current - 10;
        System.out.println("current level: " + current);
        if (current > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Run Engine
     * 
     * @param args Intially, Engine has full fuel type, maximum fuel type (1000.0),
     *             current fuel type (100.0)
     *             While Engine works, print ("Choo Choo!"). Otherwise, print Out of
     *             fuel
     *             Create an arraylist to include a passeeger called Charlie Brown
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(this.fueltype, 1000.0, 100.0);
        if (myEngine.go()) {                   
            System.out.println("Choo choo!");
        }else{
            System.out.println("Out of fuel.");
        }

       // ArrayList<Passenger> passengers = new ArrayList<Passenger>();
       // Passenger p = new Passenger("Charlie Brown");
       // passengers.add(p);
        //Car C = new Car(passengers);

       // C.printManifest();
    }

}
