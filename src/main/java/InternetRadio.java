public class InternetRadio implements IConnect {
    public String connectionStatus(String network) {
        return String.format("Radio is connected to network %s.", network);
    }

    public String tune(String station) {
        return String.format("Radio is now tuned to %s. Rock on. ", station);
    }
}
