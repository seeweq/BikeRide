package bicycles;

public interface Bicycle {



    // speed should increment by 5 in this method
    void accelerate();
    //speed should decrement by 3 in this method
     void brake();

    //should return current speed
    int currentSpeed();

    //should reset speed to 0
    void stop();


}
