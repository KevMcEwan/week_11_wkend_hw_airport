public class Flight {
    private Plane plane;
    private int flightNumber;
    private String destination;

    public Flight(Plane plane, int flightNumber, String destination){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
    }

    public int getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public Plane getPlane(){
        return plane;
    }

    public int countFlightPassengers(){
        return plane.countPassengers();
    }

    public void addPassengerToFlight(Passenger passenger){
        plane.addPassengerToPlane(passenger);
    }
}
