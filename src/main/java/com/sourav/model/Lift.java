package com.sourav.model;

public class Lift {

    private String liftName;

    /*public enum LIFTNAME{
        A,B,C,D
    }*/


    private int positionIndex;

    /*public enum POSITION{
        ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN
    }*/

    private int timeToReachUser;

    private int timeToReachDestination;

    public enum WORKING_STATE{
        WORKING,SLEEPING
    }

    public Lift() {
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

    public Lift(String liftName, int positionIndex, int timeToReachUser, int timeToReachDestination) {
        this.liftName = liftName;
        this.positionIndex = positionIndex;
        this.timeToReachUser = timeToReachUser;
        this.timeToReachDestination = timeToReachDestination;
    }

    public String getLiftName() {
        return liftName;
    }

    public void setLiftName(String liftName) {
        this.liftName = liftName;
    }

    public int getPositionIndex() {
        return positionIndex;
    }

    public void setPositionIndex(int positionIndex) {
        this.positionIndex = positionIndex;
    }
}
