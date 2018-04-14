package com.sourav.model;

public class Lift {

    public enum LIFTNAME{
        A,B,C,D
    }

    public enum POSITION{
        ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN
    }

    public enum WORKING_STATE{
        WORKING,SLEEPING
    }
    private LIFTNAME liftname;

    private POSITION position;

    private WORKING_STATE workingState;

    private int timeToReachUser;

    private int timeToReachDestination;

    public Lift() {
    }

    public Lift(LIFTNAME liftname) {
        this.liftname = liftname;
        this.position = POSITION.ZERO;
        this.workingState = WORKING_STATE.SLEEPING;
    }

    public LIFTNAME getLiftname() {
        return liftname;
    }

    public void setLiftname(LIFTNAME liftname) {
        this.liftname = liftname;
    }

    public POSITION getPosition() {
        return position;
    }

    public void setPosition(POSITION position) {
        this.position = position;
    }

    public WORKING_STATE getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WORKING_STATE workingState) {
        this.workingState = workingState;
    }

    public int getTimeToReachUser() {
        return timeToReachUser;
    }

    public void setTimeToReachUser(int timeToReachUser) {
        this.timeToReachUser = timeToReachUser;
    }

    public int getTimeToReachDestination() {
        return timeToReachDestination;
    }

    public void setTimeToReachDestination(int timeToReachDestination) {
        this.timeToReachDestination = timeToReachDestination;
    }

}
