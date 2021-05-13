package bicycles.ride;

import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;
import bicycles.ride.BikeRideThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideThreeTest {
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForRoadBike(){
        Tandem tandemRide = new Tandem();
        BikeRideThree bikeRide = new BikeRideThree(tandemRide);
        bikeRide.ride(tandemRide);
        assertEquals(34, bikeRide.currentSpeed());
    }
}
