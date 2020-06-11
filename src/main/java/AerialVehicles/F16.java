package AerialVehicles;
import Missions.*;

public class F16 extends AerialVehicle implements  AerialVehicleService,AerialAttackVehicle, JetVehicle, AerialBdaVehicle{

    public Integer mNumberOfMissiles = 0;
    public String mMissileType = "";
    public String mCameraType ="";
    public F16(String cameraType, Integer numberOfMissiles, String typeOfMissiles, String pilotName, AttackMission mission, Integer flightHours, boolean isReadyToFly) {
        super();
        this.mCameraType = cameraType;
        this.mNumberOfMissiles = numberOfMissiles;
        this.mMissileType = typeOfMissiles;
        this.mPilotName = pilotName;
        this.mMission = mission;
        this.mFlightHours=flightHours;
        this.mIsReadyToFly = isReadyToFly;
    }

    public void setMission(Mission mission){
        this.mMission.mTargetCoordinates = mission.mTargetCoordinates;
        this.mMission.setMissionAction(mission.getMissionAction());
    }

    @Override
    public String attack() {

        String str= this.mPilotName + ": " + this.getClass().getSimpleName() + " Attacking " + this.mMission.getMissionAction() + " with: "
                +  this.mMissileType + "X" +  this.mNumberOfMissiles ;

        return str;
    }

    @Override
    public void flyTo() {
        System.out.println("Flying to : " + this.mMission.getCoordinates().getLatitude() + this.mMission.getCoordinates().getLongitude());
    }

    @Override
    public void land() {
        System.out.println("Landing");

    }

    @Override
    public void check() {
        if(this.mFlightHours >= MAX_HOURS_TO_FIX)
            this.repair();
    }

    @Override
    public void repair() {
        this.mFlightHours = 0;
        this.mIsReadyToFly = true;
    }

    @Override
    public void setHoursOfFlightSinceLastRepair(int flightHours) {
        this.mFlightHours=flightHours;
    }

    @Override
    public int getHoursOfFlightSinceLastRepair() {
        return this.mFlightHours;
    }


    @Override
    public String preformBda() {
        String str = this.mPilotName + ": " + this.getClass().getSimpleName() + " taking pictures of " +
                this.mMission.getMissionAction() + " with: " +  this.mCameraType + " camera";

        return str;
    }
}
