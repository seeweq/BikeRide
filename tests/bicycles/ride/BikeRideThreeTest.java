package bicycles.ride;

import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import bicycles.ride.BikeRideThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {

    //Road bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRide = new BikeRideThree(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(58, bikeRide.currentSpeed());
    }
    //Mountain bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRide = new BikeRideThree(mountainBike);
        bikeRide.ride(mountainBike);
        assertEquals(24, bikeRide.currentSpeed());
    }
    //Tandem bike going on a ride
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForTandemBike(){
        Tandem tandem = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(tandem);
        bikeRide.ride(tandem);
        assertEquals(58, bikeRide.currentSpeed());
    }
}
