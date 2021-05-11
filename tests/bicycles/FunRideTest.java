package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void checkForBikesTakingARide(){
        FunRide takeAFunRide = new FunRide(8);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        assertEquals(1,takeAFunRide.getEnteredCount() );
    }

    @Test
    public void checkHowManyBikesOfTypeTakingARide(){
        FunRide takeAFunRide = new FunRide(8);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);
        assertEquals(3,takeAFunRide.getCountForType(BicycleType.ROADBIKE) );
    }

    @Test
    public void shouldNotAcceptIfBikesReachTheMaximum(){
        FunRide takeAFunRide = new FunRide(8);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        takeAFunRide.accept(BicycleType.ROADBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);
        takeAFunRide.accept(BicycleType.MOUNTAINBIKE);

        assertEquals(8,takeAFunRide.getEnteredCount());

    }
}
