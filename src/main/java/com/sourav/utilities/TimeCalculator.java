package com.sourav.utilities;

import com.sourav.model.Lift;

public class TimeCalculator {

    private static final int TIME_REQUIRED_FOR_TRAVERSING_EACH_FLOOR = 3;

    public int calculateTimeToReachUser(Lift lift,int userPosition){
        //need to resolve lift first
        //TODO calculate mod of the distance
        return (lift.getPositionIndex() - userPosition)*TIME_REQUIRED_FOR_TRAVERSING_EACH_FLOOR;
    }

    public int calculateTimeToReachDestination(int timeToReachUser,int userPosition,int destination){
        //TODO calculate mod of the distance
        return (destination-userPosition)*TIME_REQUIRED_FOR_TRAVERSING_EACH_FLOOR + timeToReachUser;
    }
}
