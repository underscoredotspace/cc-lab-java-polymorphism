public class Printer implements IConnect {
    public String print(String data) {
        return "printing: " + data;
    }

    public String connectionStatus(String network) {
        return String.format("Ink Printer connected to network %s.", network);
    }
}
