package com.sourav.model;

import com.sourav.algo.LiftResolver;
import com.sourav.utilities.BasicUtils;
import com.sourav.utilities.TimeCalculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private int floorPosition;

    public User(int floorPosition) {
        this.floorPosition = floorPosition;
    }

    public User() {
    }

    public int getFloorPosition() {
        return floorPosition;
    }

    public void setFloorPosition(int floorPosition) {
        this.floorPosition = floorPosition;
    }

    public Map<String, String> pressDestination(int destination){

        //sanity check
        if(destination<0 || destination>7){
            throw new IllegalArgumentException("The floor you are trying to access does not exist");
        }

        Map<String,String> infoMap = new HashMap<>();
        TimeCalculator timeCalculator = new TimeCalculator();
        //TODO init all lifts
        List<Lift> liftList = BasicUtils.initLifts();
        //TODO reply with a Lift object, the resolved lift
        //resolve lift
        LiftResolver liftResolver = new LiftResolver();
        Lift resolvedLift = liftResolver.resolveLift(liftList,destination);
        infoMap.put("LiftName",resolvedLift.getLiftName());
        //TODO send additional information -> time to reach user
        int timeToReachUser = timeCalculator.calculateTimeToReachUser(resolvedLift,this.getFloorPosition());
        infoMap.put("TimeToReachUser",String.valueOf(timeToReachUser));
        //TODO send additional information -> time to reach destination
        int timeTOReachDestination =
                timeCalculator.calculateTimeToReachDestination(timeToReachUser,this.getFloorPosition(),destination);
        infoMap.put("TimeToReachDestination",String.valueOf(timeTOReachDestination));

        return infoMap;
    }
}
