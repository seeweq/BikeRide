package bicycles.ride;

import java.util.ArrayList;

import bicycles.Bicycle;
import bicycles.BicycleType;
public class FunRide {


    private final int maxBikes;
    ArrayList<Bicycle> bikes = new ArrayList<>();


    public FunRide(int max){
        this.maxBikes = max;
    }

    public void accept(Bicycle bicycle){

        if(bikes.size() >= maxBikes){
            System.out.println("The limit for bikes has been exceeded ");
        }else if(!bikes.contains(bicycle)){
            bikes.add(bicycle);
        }
        System.out.println(bikes.size() + " " + "has been added" );

    }

    public int getCountForType(BicycleType bikeType){

        int numberOfBikesInThisType = 0;

       for(Bicycle bike: bikes){
            if(bike.getBikeTypes() == bikeType){
                numberOfBikesInThisType ++;

            }
       }
        System.out.println("There " + numberOfBikesInThisType + "" + " of " + bikeType + " type in the Fun Ride");

        return numberOfBikesInThisType;
    }

    public int getEnteredCount(){
        return bikes.size();
    }

}
