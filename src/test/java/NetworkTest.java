import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    DesktopComputer desktopComputer;
    Printer printer;

    @Before
    public void before() {
        network = new Network("CodeClan");
        desktopComputer = new DesktopComputer("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktopComputer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canConnectPrinter() {
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktopComputer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }
}
