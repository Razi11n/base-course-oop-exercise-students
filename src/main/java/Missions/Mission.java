package Missions;
import Entities.Coordinates;
public abstract class Mission{
    public Coordinates mTargetCoordinates;

    public Mission(Coordinates TargetCoordinates) {
        this.mTargetCoordinates = TargetCoordinates;
    }

    public Mission() {
        this.mTargetCoordinates = null;
    }

    public void beginMessage()
        {
        System.out.println("Beginning Mission!");
    }
    public void cancelMessage()
    {
        System.out.println("Abort Mission!");
    }
    public void finishMessage()
    {
        System.out.println("Finish Mission!");
    }
    public Coordinates getCoordinates() {
        return this.mTargetCoordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.mTargetCoordinates = coordinates;
    }

    public abstract void setMissionAction(String mission);

    public abstract String getMissionAction();
}
