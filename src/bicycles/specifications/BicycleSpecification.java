package bicycles.specifications;

import bicycles.BicycleType;

public class BicycleSpecification {
    private final int accelerationSpeed;
    private final int brakeSpeed;
    public BicycleType bicycleType;

    public BicycleSpecification(int accelerationSpeed, int brakeSpeed, BicycleType bicycleType){
        this.accelerationSpeed = accelerationSpeed;
        this.brakeSpeed = - brakeSpeed;
        this.bicycleType = bicycleType;
    }

    public int getAccelerationSpeed(){
        return accelerationSpeed;
    }

    public int getBrakeSpeed(){
        return brakeSpeed;
    }


}
