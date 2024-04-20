import java.util.ArrayList;

public class Train {

    private Engine Engine;
    private ArrayList<Car> Carsattached = new ArrayList<Car>();
    

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.Engine = new Engine(fuelType, fuelCapacity, fuelCapacity);
        this.Carsattached=new ArrayList<>();   
    }

    public Engine getEngine(){
        return this.Engine;
    }

    public Car getCar(int i){ 
        return this.Carsattached.get(i);
    }

    public int getMaxCapacity(){
        int max = 0;

        for(Car car:this.Carsattached){
            max=max + car.getCapacity();
        }
        return max;
    }

    public int seatsRemaining(){
      
        int seatsRemaining = 0;

        for(Car car:this.Carsattached){
            seatsRemaining = seatsRemaining + car.seatsRemaining();
        }
        return seatsRemaining;
    }

    public void printManifest(){

        for (Car car : this.Carsattached){
            car.printManifest(); 
        }
    }
}
