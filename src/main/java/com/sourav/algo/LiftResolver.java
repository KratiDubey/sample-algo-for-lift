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
     * @param destination
     * @return
     */
    public Lift resolveLift(List<Lift> lifts,int destination){
        int minimumDistance = lifts.get(0).getPosition().ordinal() - destination;
        Lift resolvedLift = lifts.get(0);
        for(Lift lift:lifts){
            if(lift.getPosition().ordinal()-destination<minimumDistance){
                resolvedLift = lift;
            }
        }
        return resolvedLift;
    }
}
