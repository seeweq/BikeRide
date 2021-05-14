package bicycles.specifications;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.ride.BikeRideThree;
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
    public void takeRoadBikeSpecificationsBikeRideOne(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRide0ne(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(36, bikeRide.currentSpeed());
    }

    //Mountain bike
    @Test
    public void takeMountainBikeSpecificationBikeRideOne(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3,BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRide0ne(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(16, mBikeRide.currentSpeed());
        }

    //Tandem bike
    @Test
    public void takeTandemBikeSpecificationBikeRideOne(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7,BicycleType.TANDEM);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide tandemRide = new BikeRide0ne(tandem);
        tandemRide.ride(tandem);
        assertEquals(16, tandemRide.currentSpeed());
    }
    @Test
    public void takeRoadBikeSpecificationsBikeRideTwo(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideTwo(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(43, bikeRide.currentSpeed());
    }

    //Mountain bike
    @Test
    public void takeMountainBikeSpecificationBikeRideTwo(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3,BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideTwo(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(16, mBikeRide.currentSpeed());
    }

    //Tandem bike
    @Test
    public void takeTandemBikeSpecificationBikeRideTwo(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7,BicycleType.TANDEM);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide tandemRide = new BikeRideTwo(tandem);
        tandemRide.ride(tandem);
        assertEquals(39, tandemRide.currentSpeed());
    }
    @Test
    public void takeRoadBikeSpecificationsBikeRideThree(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBike = new BicycleFromSpec(roadBikeSpec);
        BikeRide bikeRide = new BikeRideThree(roadBike);
        bikeRide.ride(roadBike);
        assertEquals(58, bikeRide.currentSpeed());
    }

    //Mountain bike
    @Test
    public void takeMountainBikeSpecificationBikeRideThree(){
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3,BicycleType.MOUNTAINBIKE);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
        BikeRide mBikeRide = new BikeRideThree(mountainBike);
        mBikeRide.ride(mountainBike);
        assertEquals(24, mBikeRide.currentSpeed());
    }

    //Tandem bike
    @Test
    public void takeTandemBikeSpecificationBikeRideThree(){
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7,BicycleType.TANDEM);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        BikeRide tandemRide = new BikeRideThree(tandem);
        tandemRide.ride(tandem);
        assertEquals(58, tandemRide.currentSpeed());
    }
}
