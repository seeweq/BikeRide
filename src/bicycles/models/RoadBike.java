package bicycles.models;

import bicycles.Bicycle;
import bicycles.BicycleBase;
import bicycles.BicycleType;

public class RoadBike extends BicycleBase {

    public void accelerate(){
      changeSpeed(11);
    }
    public void brake(){
      changeSpeed(-4);

    }
    @Override
    public BicycleType getBikeTypes() {

        return BicycleType.ROADBIKE;
    }


}
