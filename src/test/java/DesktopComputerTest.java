import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DesktopComputerTest {
    DesktopComputer desktopComputer;

    @Before
    public void before() {
        desktopComputer = new DesktopComputer("Keith's Desktop", "Apple", "Macbook Pro");
    }

    @Test
    public void hasName(){
        assertEquals("Keith's Desktop", desktopComputer.getName());
    }

    @Test
    public void hasMake(){
        assertEquals("Apple", desktopComputer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Macbook Pro", desktopComputer.getModel());
    }

    @Test
    public void canGetConnectionStatus() {
        assertEquals("Computer Keith's Desktop connected to network Codeclan.", desktopComputer.connectionStatus("Codeclan"));


    }

}
