import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA320, AirlineType.EASYJET);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUSA320, plane.getPlaneType());
    }
}
