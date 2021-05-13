package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import org.junit.jupiter.api.Test;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import bicycles.ride.BikeRide;
import bicycles.ride.BikeRide0ne;
import bicycles.ride.BikeRideTwo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleSpecificationTest {
    //RoadBike
    @Test
    public void takeRoadBikeSpecifications(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRide0ne(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(36, bikeRide.currentSpeed());
    }

    //Mountain bike
    @Test
    public void takeMountainBikeSpecification(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3,BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(16, mBikeRide.currentSpeed());
        }

}
