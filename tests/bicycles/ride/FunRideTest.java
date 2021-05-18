package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import bicycles.specifications.BicycleFromSpec;
import bicycles.specifications.BicycleSpecification;
import org.junit.jupiter.api.Test;
import bicycles.ride.FunRide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void checkForBikesTakingARide(){
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBicycle= new BicycleFromSpec(roadBikeSpec);
        FunRide takeAFunRide = new FunRide(8);
        takeAFunRide.accept(roadBicycle);
        assertEquals(1,takeAFunRide.getEnteredCount() );
    }
    @Test
    public void checkForBikesTakingARideWithSpec(){
        FunRide takeAFunRide = new FunRide(8);
        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7,BicycleType.TANDEM);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        takeAFunRide.accept(tandem);
        assertEquals(1,takeAFunRide.getCountForType(BicycleType.TANDEM)  );
    }


    @Test
    public void checkHowManyBikesOfTypeTakingARide(){
        FunRide takeAFunRide = new FunRide(8);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBicycle = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadBicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadBicycle01 = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3,BicycleType.MOUNTAINBIKE);
        Bicycle mountBicycle = new BicycleFromSpec(mountainBikeSpec);

        takeAFunRide.accept(roadBicycle1);
        takeAFunRide.accept(roadBicycle01);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(mountBicycle);
        assertEquals(3,takeAFunRide.getCountForType(BicycleType.ROADBIKE) );
    }

    @Test
    public void shouldNotAcceptIfBikesReachTheMaximum(){
        FunRide takeAFunRide = new FunRide(8);
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.ROADBIKE);
        Bicycle roadBicycle= new BicycleFromSpec(roadBikeSpec);
        Bicycle roadBicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle roadBicycle01 = new BicycleFromSpec(roadBikeSpec);

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3,BicycleType.MOUNTAINBIKE);
        Bicycle mountBicycle = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountBicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle mountBicycle02 = new BicycleFromSpec(mountainBikeSpec);

        BicycleSpecification tandemSpec = new BicycleSpecification(12, 7,BicycleType.TANDEM);
        Bicycle tandem = new BicycleFromSpec(tandemSpec);
        Bicycle tandem3 = new BicycleFromSpec(tandemSpec);
        Bicycle tandem03 = new BicycleFromSpec(tandemSpec);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(roadBicycle1);
        takeAFunRide.accept(roadBicycle01);
        takeAFunRide.accept(mountBicycle);
        takeAFunRide.accept(mountBicycle2);
        takeAFunRide.accept(mountBicycle02);
        takeAFunRide.accept(tandem);
        takeAFunRide.accept(tandem3);
        takeAFunRide.accept(tandem03);

        assertEquals(8,takeAFunRide.getEnteredCount());

    }
}
