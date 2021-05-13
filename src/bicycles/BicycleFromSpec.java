package bicycles;

public class BicycleFromSpec extends BicycleBase {
    public BicycleSpecification bicycleSpecification;
    public BicycleType bicycleTypes;
    public BicycleFromSpec(BicycleSpecification bicycle) {
        this.bicycleSpecification = bicycle;
    }


    public void accelerate() {
        this.changeSpeed(bicycleSpecification.getAccelerationSpeed());
    }


    public void brake() {
        this.changeSpeed(bicycleSpecification.getBrakeSpeed());
    }

    @Override
    public BicycleType getBikeTypes() {
        return bicycleTypes;
    }

}
