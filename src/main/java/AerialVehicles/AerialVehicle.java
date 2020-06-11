package AerialVehicles;

import Missions.Mission;


public abstract class AerialVehicle {
    public Mission mMission;
    public String mPilotName;
    public Integer mFlightHours;
    public boolean mIsReadyToFly;

    public AerialVehicle(Mission Mission, String PilotName, Integer FlightHours, boolean IsReadyToFly) {
        this.mMission = Mission;
        this.mPilotName = PilotName;
        this.mFlightHours = FlightHours;
        this.mIsReadyToFly = IsReadyToFly;
    }

    public AerialVehicle() {
        this.mMission = null;
        this.mPilotName = "";
        this.mFlightHours =0;
        this.mIsReadyToFly = true;
    }
}
