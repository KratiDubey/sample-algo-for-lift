package com.sourav.algo;

import com.sourav.model.Lift;

import java.util.List;

/**
 * @author Sourav Ghosh
 */
public class LiftResolver {

    /**
     * This is done at the bare minimum level
     * Need to enhance the algorithm
     *
     * @param lifts
     * @param userPosition
     * @return
     */
    //TODO below implementation is wrong, resolved lift would be the one closest to user
    public Lift resolveLift(List<Lift> lifts, Lift.POSITION userPosition){
        int minimumDistance = Math.abs(lifts.get(0).getPosition().ordinal() - userPosition.ordinal());
        Lift resolvedLift = lifts.get(0);
        for(Lift lift:lifts){
            if(Math.abs(lift.getPosition().ordinal()- userPosition.ordinal())<minimumDistance){
                resolvedLift = lift;
            }
        }
        return resolvedLift;
    }
}
