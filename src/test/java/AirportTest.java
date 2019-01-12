import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    private Airport airport;

    private Hangar hangar1;
    private Hangar hangar2;

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;
    private Plane plane4;
    private Plane plane5;
    private Plane plane6;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA320, AirlineType.RYANAIR);
        plane2 = new Plane(PlaneType.BOEING777, AirlineType.BRITISHAIRWAYS);
        plane3 = new Plane(PlaneType.BOMBARDIERDASH8, AirlineType.FLYBE);
        plane4 = new Plane(PlaneType.BOEING737, AirlineType.EASYJET);
        plane5 = new Plane(PlaneType.AIRBUSA320, AirlineType.EASYJET);
        plane6 = new Plane(PlaneType.BOEING737, AirlineType.FLYBE);

        hangar1 = new Hangar();
        hangar1.addPlaneToHangar(plane1);
        hangar1.addPlaneToHangar(plane2);

        hangar2 = new Hangar();
        hangar2.addPlaneToHangar(plane3);
        hangar2.addPlaneToHangar(plane4);
        hangar2.addPlaneToHangar(plane5);

        airport = new Airport("EDI");
    }

    @Test
    public void airportHasAirportCode(){
        assertEquals("EDI", airport.getAirportCode());
    }

    @Test
    public void airportStartsWithZeroHangars(){
        assertEquals(0, airport.countHangars());
    }

    @Test
    public void canAddHangarToAirport(){
        assertEquals(0, airport.countHangars());
        airport.addHangar(hangar1);
        assertEquals(1, airport.countHangars());
    }

    @Test
    public void countPlanesInHangar(){
        airport.addHangar(hangar1);
        assertEquals(2, hangar1.countPlanesInHangar());
        airport.addHangar(hangar2);
        assertEquals(3, hangar2.countPlanesInHangar());
    }

    @Test
    public void canAddPlaneToHangar(){
        airport.addHangar(hangar1);
        assertEquals(2, hangar1.countPlanesInHangar());
        hangar1.addPlaneToHangar(plane6);
        assertEquals(3, hangar1.countPlanesInHangar());
    }

    @Test
    public void canRemovePlaneFromHangar(){
        airport.addHangar(hangar1);
        assertEquals(2, hangar1.countPlanesInHangar());
        hangar1.removePlaneFromHangar(plane1);
        assertEquals(1, hangar1.countPlanesInHangar());
    }

    @Test
    public void canCountFlights(){
        assertEquals(0, airport.countFlights());
    }

    @Test
    public void canCreateFlight(){

        airport.createFlight(plane1, 321, "Dubai");
        assertEquals(1, airport.countFlights());
    }


}
