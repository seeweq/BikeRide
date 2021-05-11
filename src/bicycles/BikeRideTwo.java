package bicycles;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;

public class BikeRideTwo implements BikeRide{
    public final Bicycle bicycle;

    //constructor
    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }
 
    //ride method
    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
    }
    //returns current speed
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }
}
