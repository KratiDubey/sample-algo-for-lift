package com.sourav.model;

public class Lift {

    enum LIFTNAME{
        A,B,C,D
    }

    public enum POSITION{
        ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN
    }

    enum WORKING_STATE{
        WORKING,SLEEPING
    }

    private String liftName;

    private int positionIndex;

    private int timeToReachUser;

    private int timeToReachDestination;

    private LIFTNAME liftname;

    private POSITION position;

    private WORKING_STATE workingState;

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
