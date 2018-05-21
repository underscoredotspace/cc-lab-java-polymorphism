import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InternetRadioTest {
    private InternetRadio internetRadio;

    @Before
    public void setUp() throws Exception {
        internetRadio = new InternetRadio();
    }

    @Test
    public void connectionStatus() {
        assertEquals("Radio is connected to network Codeclan.", internetRadio.connectionStatus(("Codeclan")));
    }

    @Test
    public void canTuneToStation() {
        assertEquals("Radio is now tuned to 6Music. Rock on. ", internetRadio.tune("6Music"));
    }
}