import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private AirlineType airlineType;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, AirlineType airlineType){
        this.planeType = planeType;
        this.airlineType = airlineType;
        this.passengers = passengers;
    }

    public PlaneType getPlaneType(){
        return planeType;
    }
}
