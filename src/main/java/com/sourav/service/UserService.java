package com.sourav.service;

import com.sourav.algo.LiftResolver;
import com.sourav.model.Lift;
import com.sourav.model.User;
import com.sourav.utilities.BasicUtils;
import com.sourav.utilities.TimeCalculator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    private User user;

    private TimeCalculator timeCalculator;

    private LiftResolver liftResolver;

    /**
     * This method would return a map of information,
     * Which Lift would be coming
     * How much time it would take to reach user
     * How much time it would take to reach destination
     *
     * @param destination : Which floor the user wants to go
     * @return infoMap : A map of information
     */
    public Map<String, String> pressDestination(int destination){

        //sanity check
        if(destination<0 || destination>7){
            throw new IllegalArgumentException("The floor you are trying to access does not exist");
        }
        Map<String,String> infoMap = new HashMap<>();
        TimeCalculator timeCalculator = new TimeCalculator();

        //initiating all lifts at ground level and at sleeping state
        List<Lift> liftList = BasicUtils.initLifts();

        //resolve lift
        LiftResolver liftResolver = new LiftResolver();
        Lift resolvedLift = liftResolver.resolveLift(liftList,destination);

        //send additional information -> time to reach user
        int timeToReachUser = timeCalculator.calculateTimeToReachUser(resolvedLift,user.getFloorPosition());
        infoMap.put("TimeToReachUser",String.valueOf(timeToReachUser));

        //send additional information -> time to reach destination
        int timeTOReachDestination =
                timeCalculator.calculateTimeToReachDestination(timeToReachUser,user.getFloorPosition(),destination);
        infoMap.put("TimeToReachDestination",String.valueOf(timeTOReachDestination));

        return infoMap;
    }
}
