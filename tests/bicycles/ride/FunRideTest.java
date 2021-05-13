package bicycles.ride;

import bicycles.Bicycle;
import bicycles.BicycleType;
import bicycles.models.MountainBike;
import bicycles.models.RoadBike;
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
    public void checkHowManyBikesOfTypeTakingARide(){
        FunRide takeAFunRide = new FunRide(8);
        Bicycle roadBicycle = new RoadBike();
        Bicycle mountBicycle = new MountainBike();
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(mountBicycle);
        assertEquals(3,takeAFunRide.getCountForType(BicycleType.ROADBIKE) );
    }

    @Test
    public void shouldNotAcceptIfBikesReachTheMaximum(){
        FunRide takeAFunRide = new FunRide(8);
        Bicycle roadBicycle = new RoadBike();
        Bicycle mountBicycle = new MountainBike();
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(roadBicycle);
        takeAFunRide.accept(mountBicycle);
        takeAFunRide.accept(mountBicycle);
        takeAFunRide.accept(mountBicycle);
        takeAFunRide.accept(mountBicycle);
        takeAFunRide.accept(mountBicycle);
        takeAFunRide.accept(mountBicycle);

        assertEquals(8,takeAFunRide.getEnteredCount());

    }
}
