import java.util.ArrayList;

public class Plane {
    private PlaneType planeType;
    private AirlineType airlineType;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, AirlineType airlineType){
        this.planeType = planeType;
        this.airlineType = airlineType;
        passengers = new ArrayList<>();
    }

    public PlaneType getPlaneType(){
        return planeType;
    }

    public AirlineType getAirlineType(){
        return airlineType;
    }

    public int countPassengers(){
        return passengers.size();
    }

    public void addPassengerToPlane(Passenger passenger){
        passengers.add(passenger);
    }
}
