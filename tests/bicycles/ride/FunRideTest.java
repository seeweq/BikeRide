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
        FunRide takeAFunRide = new FunRide(8);
        Bicycle roadBicycle = new RoadBike();
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
        Bicycle roadBicycle = new RoadBike();
        Bicycle roadBicycle1 = new RoadBike();
        Bicycle mountBicycle = new MountainBike();
        takeAFunRide.accept(roadBicycle1);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(mountBicycle);
        assertEquals(2,takeAFunRide.getCountForType(BicycleType.ROADBIKE) );
    }

    @Test
    public void shouldNotAcceptIfBikesReachTheMaximum(){
        FunRide takeAFunRide = new FunRide(8);
        Bicycle roadBicycle = new RoadBike();
        Bicycle roadBicycle1 = new RoadBike();
        Bicycle roadBicycle01 = new RoadBike();
        Bicycle mountBicycle = new MountainBike();
        Bicycle mountBicycle2 = new MountainBike();
        Bicycle mountBicycle02 = new MountainBike();
        Tandem tandem = new Tandem();
        Tandem tandem3 = new Tandem();
        Tandem tandem03 = new Tandem();
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
