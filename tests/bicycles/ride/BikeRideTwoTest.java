package bicycles.ride;

import bicycles.models.MountainBike;
import org.junit.jupiter.api.Test;
import bicycles.ride.BikeRideTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTwoTest {
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForMountainBike(){
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRide = new BikeRideTwo(mountainBike);
        bikeRide.ride(mountainBike);
        assertEquals(14, bikeRide.currentSpeed());
    }
}
