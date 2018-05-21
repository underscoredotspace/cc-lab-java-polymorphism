import java.util.*;

public class Network {
    private String name;
    private int maxConnections;
    private ArrayList<IConnect> devices;

    public Network(String name, int maxConnections) {
        this.devices = new ArrayList<>();
        this.name = name;
        this.maxConnections = maxConnections;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device) {
        if (this.availableSlots() > 0) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int availableSlots() {
        return this.maxConnections - this.deviceCount();
    }
}