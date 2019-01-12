import java.util.ArrayList;

public class Airport {
    private String airportCode;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public String getAirportCode(){
        return airportCode;
    }

    public int countHangars(){
        return hangars.size();
    }

    public void addHangar(Hangar hangar){
        hangars.add(hangar);
    }

    public int countFlights(){
        return flights.size();
    }

//    public Plane removePlaneFromHangar(Hangar hangar, Plane plane){
//        return hangar.removePlaneFromHangar(plane);
//    }

    public Flight createFlight(Plane plane, int flightNumber, String destination, Hangar){
        Flight flight = new Flight(plane, flightNumber, destination);
        flights.add(flight);
        return flight;
    }

}
