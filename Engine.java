import java.util.ArrayList; 

/*Create Engine*/
public class Engine { 

    private FuelType fueltype;
    private double max;
    private double current;

    public Engine(FuelType fueltype, double max, double current) {
        this.fueltype = fueltype;
        this.max = max;
        this.current = current;
    }

    public FuelType getfFuelType(){
        return fueltype;
    }

    public void refuel (){
        current = max;
    }

    public boolean go(){
        current = current - 10;
        System.out.println("current level: " + current);
        if (current > 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 1000.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        } 
        System.out.println("Out of fuel.");  

        ArrayList<Passenger>passengers= new ArrayList<Passenger>();
            Passenger p = new Passenger("Charlie Brown");
            passengers.add(p);
        Car C=new Car(passengers, 5);
            
            C.printManifest(); 
    } 

} 

