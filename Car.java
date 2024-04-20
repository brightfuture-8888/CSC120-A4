import java.util.ArrayList;

public class Car {
    public static Object current;
    private ArrayList<Passenger>passengers= new ArrayList <> ();
    private int maxCapacity;

    public Car(ArrayList<Passenger>passengers, int maxCapacity){
        this.passengers=passengers;
        this.maxCapacity=maxCapacity;
    }

    public int getCapacity(){
        return this.maxCapacity;
    }

    public int seatsRemaining(){
        return maxCapacity - passengers.size();
    }

    public boolean addPassenger(Passenger passenger){
        return this.passengers.add(passenger);
    }

    public boolean removePassenger(Passenger P){
        this.passengers.remove(P);

        if (this.passengers.contains(P)){
            return true;
        }else{ 
            return false;
        }

    }

    public void printManifest(){
        if (passengers.size()==0){
            System.out.println("This car is EMPTY.");
        }else{
        for (int i=0; i<passengers.size(); i++){
            System.out.println(passengers.get(i).getname());
        }
        }
    }
}
