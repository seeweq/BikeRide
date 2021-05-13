package bicycles.ride;


//import bicycles.models.RoadBike;

import bicycles.Bicycle;

public class BikeRide0ne implements BikeRide {

    public final Bicycle bicycle;

    //constructor
    public BikeRide0ne(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();

    }

    //returns current speed
    public int currentSpeed(){
        return this.bicycle.currentSpeed();
    }

}


