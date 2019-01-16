import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Fun Coaster");
    }

    @Test
    public void rollercoasterHasName(){
        assertEquals("Fun Coaster", rollercoaster.getName());
    }

}
