package AerialVehicles;

public interface AerialVehicleService {
    public void flyTo();
    public void land();
    public void check();
    public void repair();
    public void setHoursOfFlightSinceLastRepair(int flyHours);
    public int getHoursOfFlightSinceLastRepair();
}
