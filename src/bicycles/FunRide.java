package bicycles;

import java.util.ArrayList;
import bicycles.BicycleType;
public class FunRide {


    private final int maxBikes;
    ArrayList<BicycleType> bikes = new ArrayList<>();


    public FunRide(int max){
        this.maxBikes = max;
    }

    public void accept(BicycleType bicycle){

        if(bikes.size() >= maxBikes){
            System.out.println("The limit for bikes has been exceeded ");
        }else {
            bikes.add(bicycle);
        }
        System.out.println(bikes.size() + " " + "has been added" );
    }

    public int getCountForType(BicycleType bikeType){

        int numberOfBikesInThisType = 0;

       for( BicycleType type: bikes){
            if(type == bikeType){
                numberOfBikesInThisType += 1;

            }
       }
        System.out.println(numberOfBikesInThisType + "" + " of " + bikeType + " type are in the Fun Ride");

        return numberOfBikesInThisType;
    }

    public int getEnteredCount(){
        return bikes.size();
    }

}
