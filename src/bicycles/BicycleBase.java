package bicycles;

public abstract class BicycleBase implements Bicycle{
    private int speed;

    protected void changeSpeed(int accelerationOrBakes){
        speed += accelerationOrBakes;
    }
    public int currentSpeed(){
        if(speed < 0){
            return   speed= 0 ;
        }
        return  speed;
    }
    public void stop(){
        speed = 0;
        System.out.println(speed);
    }


}
