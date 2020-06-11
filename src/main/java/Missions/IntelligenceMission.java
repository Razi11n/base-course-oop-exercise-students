package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission implements MissionService{
    private String mRegion  ;
    public IntelligenceMission(String region ,Coordinates targetCoordinates) {
        super();
        this.mRegion = region ;
        this.mTargetCoordinates = targetCoordinates;
    }

    @Override
    public void setMissionAction(String mission) {
        this.mRegion = mission;
    }

    @Override
    public String getMissionAction() {
        return this.mRegion;
    }
}
