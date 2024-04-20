/**
 * Create passenger Class 
 */
public class Passenger {
    
    private String name;

    /**
     * Passenger method 
     * @param name passenger's name 
     */
    public Passenger(String name) { 
        this.name = name;
    }

    /**
     * Accessor of name of passenger 
     * @return
     */
    public String getname(){
        return this.name;
    }

    /**
     * Board Car method 
     * @param c Car named C will be added passengers on it 
     * @return
     */
    public boolean boardCar(Car c){
        return c.addPassenger(this);
    }

    /**
     * Get off Car method 
     * @param c Car named C will be added passengers on it 
     * @return if passenger removed, return Car c without the passenger 
     */
    public boolean getOffCar(Car c){
        return c.removePassenger(this);
    }
}
