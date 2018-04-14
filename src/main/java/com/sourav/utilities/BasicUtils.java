package com.sourav.utilities;

import com.sourav.model.Lift;

import java.util.ArrayList;
import java.util.List;

public class BasicUtils {

    public static List<Lift> initLifts(){
        List<Lift> liftList = new ArrayList<>();
        Lift LiftA = new Lift(Lift.LIFTNAME.A);
        Lift LiftB = new Lift(Lift.LIFTNAME.B);
        Lift LiftC = new Lift(Lift.LIFTNAME.C);
        Lift LiftD = new Lift(Lift.LIFTNAME.D);

        liftList.add(LiftA);
        liftList.add(LiftB);
        liftList.add(LiftC);
        liftList.add(LiftD);

        return liftList;
    }

}
