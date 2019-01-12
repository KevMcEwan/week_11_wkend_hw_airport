import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {
    Hangar hangar1;
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        hangar1 = new Hangar();

        plane1 = new Plane(PlaneType.AIRBUSA320, AirlineType.RYANAIR);
        plane2 = new Plane(PlaneType.BOEING777, AirlineType.BRITISHAIRWAYS);
        plane3 = new Plane(PlaneType.BOMBARDIERDASH8, AirlineType.EASYJET);
    }

    @Test
    public void hangarStartsEmpty(){
        assertEquals(0, hangar1.countPlanesInHangar());
    }

    @Test
    public void canCountPlanesInHangar(){
        assertEquals(0, hangar1.countPlanesInHangar());
        hangar1.addPlaneToHangar(plane1);
        assertEquals(1, hangar1.countPlanesInHangar());
    }

    @Test
    public void canRemovePlaneFromHangar(){
        assertEquals(0, hangar1.countPlanesInHangar());
        hangar1.addPlaneToHangar(plane1);
        hangar1.addPlaneToHangar(plane2);
        hangar1.addPlaneToHangar(plane3);
        assertEquals(3, hangar1.countPlanesInHangar());
        hangar1.removePlaneFromHangar(plane1);
        assertEquals(2, hangar1.countPlanesInHangar());
    }

}
