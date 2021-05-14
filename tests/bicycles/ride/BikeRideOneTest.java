package bicycles.ride;


import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import bicycles.ride.BikeRide0ne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {
    //Road bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRide0ne bikeRide = new BikeRide0ne(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(36, bikeRide.currentSpeed());
    }
    //Mountain bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRide0ne bikeRide = new BikeRide0ne(mountainBike);
        bikeRide.ride(mountainBike);
        assertEquals(14, bikeRide.currentSpeed());
    }
    //Tandem bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForTandemBike(){
        Tandem tandem = new Tandem();
        BikeRide0ne bikeRide = new BikeRide0ne(tandem);
        bikeRide.ride(tandem);
        assertEquals(34, bikeRide.currentSpeed());
    }
}
