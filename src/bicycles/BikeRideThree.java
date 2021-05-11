package bicycles;



public class BikeRideThree implements BikeRide{
    public final Bicycle bicycle;

    //constructor
    public BikeRideThree(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    //ride method
    public void ride(Bicycle bicycle) {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
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
