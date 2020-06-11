package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission implements MissionService{
    private String mObjective ;
    public BdaMission(String objective,Coordinates targetCoordinates) {
        this.mObjective = objective;
        this.mTargetCoordinates = targetCoordinates;
    }

    @Override
    public void setMissionAction(String mission) {
        this.mObjective = mission;
    }

    @Override
    public String getMissionAction() {
        return this.mObjective;
    }
}
