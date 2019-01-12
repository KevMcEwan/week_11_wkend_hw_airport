import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA320, AirlineType.EASYJET );
        passenger1 = new Passenger();
        passenger2 = new Passenger();
        passenger3 = new Passenger();
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUSA320, plane.getPlaneType());
    }

    @Test
    public void canGetAirlineType(){
        assertEquals(AirlineType.EASYJET, plane.getAirlineType());
    }

    @Test
    public void planeStartsWithNoPassengers(){
        assertEquals(0, plane.countPassengers());
    }

    @Test
    public void canAddPassengerToPlane(){
        assertEquals(0, plane.countPassengers());
        plane.addPassengerToPlane(passenger1);
        plane.addPassengerToPlane(passenger2);
        assertEquals(2, plane.countPassengers());
    }

}
