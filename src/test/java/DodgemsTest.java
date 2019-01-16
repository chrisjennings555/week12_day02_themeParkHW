import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Fun Cars");
    }

    @Test
    public void dodgemsHaveName(){
        assertEquals("Fun Cars", dodgems.getName());
    }
}
