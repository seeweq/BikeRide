package bicycles;

import bicycles.models.RoadBike;
import bicycles.models.Tandem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TandemTest {
    @Test
    public void shouldAccelerate() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        assertEquals(12, bicycle.currentSpeed());
    }
    //check accelerate and brake method
    @Test
    public void shouldAccelerateAndBrakeCorrect() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());

    }
    //check for multiple accelerates
    @Test
    public void shouldDoMultipleAcceleratesCorrectly() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        assertEquals(36, bicycle.currentSpeed());

    }
    //check multiple accelerates and brakes
    @Test
    public void shouldDoMultipleAccelerateAndBrakesCorrectly() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.brake();
        assertEquals(5, bicycle.currentSpeed());

    }
    //check if it stops
    @Test
    public void shouldBeAbleToStop() {

        Tandem bicycle = new Tandem();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
        bicycle.stop();
        assertEquals(0, bicycle.currentSpeed());

    }
}
