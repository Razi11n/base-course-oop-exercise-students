package Missions;
import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission implements MissionService{
    private String mTarget;
    public AttackMission(String target,Coordinates targetCoordinates) {
        this.mTarget = target;
        this.mTargetCoordinates = targetCoordinates;
    }

    @Override
    public void setMissionAction(String mission) {
        this.mTarget = mission;
    }

    @Override
    public String getMissionAction() {
        return this.mTarget;
    }
}
