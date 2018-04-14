package com.sourav.utilities;

import com.sourav.model.Lift;

import java.util.ArrayList;
import java.util.List;

public class BasicUtils {

    public static List<Lift> initLifts(){
        List<Lift> liftList = new ArrayList<>();
        Lift a = new Lift();
        a.setLiftName("A");
        BasicUtils.setAllToZero(a);
        liftList.add(a);

        Lift b = new Lift();
        b.setLiftName("B");
        BasicUtils.setAllToZero(b);
        liftList.add(b);

        Lift c = new Lift();
        c.setLiftName("C");
        BasicUtils.setAllToZero(c);
        liftList.add(c);

        Lift d = new Lift();
        d.setLiftName("D");
        BasicUtils.setAllToZero(d);
        liftList.add(d);

        return liftList;
    }

    public void setInitialState(){
        //TODO set all STATE to SLEEPING
    }

    private static void setAllToZero(Lift lift){
        //FIXME this can be done in constructor itself
        lift.setPositionIndex(0);
        lift.setTimeToReachDestination(0);
        lift.setTimeToReachUser(0);

    }
}
