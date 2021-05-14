package bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {
    public void accelerate(){
        changeSpeed(12);
    }
    public void brake(){
        changeSpeed(-7);

    } @Override
    public BicycleType getBikeTypes() {

        return BicycleType.TANDEM;
    }

}
