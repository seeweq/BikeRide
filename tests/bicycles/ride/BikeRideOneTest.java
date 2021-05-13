package bicycles.ride;


import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;
import bicycles.ride.BikeRide0ne;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideOneTest {
    @Test
    public void shouldReturnASpeedOfTheCurrentRideForRoadBike(){
        RoadBike roadBike = new RoadBike();
        BikeRide0ne bikeRide = new BikeRide0ne(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(36, bikeRide.currentSpeed());
    }

}
