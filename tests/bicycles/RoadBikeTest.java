package bicycles;

import bicycles.models.RoadBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadBikeTest {

    //check if speed increases by 11
    //check accelerate method
    @Test
    public void shouldAccelerate() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        assertEquals(11, bicycle.currentSpeed());
    }
    //check accelerate and brake method
    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(7, bicycle.currentSpeed());

    }
    //check for multiple accelerates
    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(33, bicycle.currentSpeed());

    }
    //check multiple accelerates and brakes
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(10, bicycle.currentSpeed());

    }
    //check if it stops
    @Test
    public void shouldBeAbleToStop() {

        RoadBike bicycle = new RoadBike();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
    }

