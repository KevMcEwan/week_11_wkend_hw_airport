import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Plane plane1;
    private Passenger passenger1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING737, AirlineType.RYANAIR);
        flight = new Flight(plane1, 123, "Amsterdam");
        passenger1 = new Passenger();
    }

    @Test
    public void hasFlightNumber(){
        assertEquals(123, flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Amsterdam", flight.getDestination());
    }

    @Test
    public void flightHasPlaneType(){
        assertEquals(plane1, flight.getPlane());
    }

    @Test
    public void countFlightPassengers(){
        assertEquals(0, flight.countFlightPassengers());
    }

    @Test
    public void canAddPassengerToFlight(){
        assertEquals(0, flight.countFlightPassengers());
        flight.addPassengerToFlight(passenger1);
        assertEquals(1, flight.countFlightPassengers());
    }

}
