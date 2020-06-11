package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;

public class F15 extends AerialVehicle implements  AerialVehicleService,AerialAttackVehicle,AerialIntelligenceVehicle, JetVehicle{

    public Integer mNumberOfMissiles = 0;
    public String mMissileType = "";
    public String mSensorType = "";
    public F15(String sensorType, Integer numberOfMissiles, String typeOfMissiles,  String pilotName, AttackMission mission, Integer flightHours, boolean isReadyToFly) {
        super();
        this.mNumberOfMissiles = numberOfMissiles;
        this.mMissileType = typeOfMissiles;
        this.mSensorType = sensorType;
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
    public String collectIntelligence() {
        String str =this.mPilotName + ": " + this.getClass().getSimpleName() + " Collecting Data in " + this.mMission.getMissionAction()
                + " with sensor type: " +  this.mSensorType;
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


}
