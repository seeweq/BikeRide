package bicycles.ride;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import bicycles.ride.BikeRideTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {

    //Road bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRide = new BikeRideTwo(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(43, bikeRide.currentSpeed());
    }
    //Mountain bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(mountainBike);
        bikeRide.ride(mountainBike);
        assertEquals(16, bikeRide.currentSpeed());
    }
    //Tandem bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForTandemBike(){
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRide = new BikeRideTwo(tandem);
        bikeRide.ride(tandem);
        assertEquals(39, bikeRide.currentSpeed());
    }
}
