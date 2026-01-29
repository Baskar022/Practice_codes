import java.util.*;

public class ShipRecord {
    private String shipId;
    private String port;
    private String date;
    private String status;

    public ShipRecord(int shipId, String port, String date, String status) {
        this.shipId = shipId;
        this.port = port.intern();
        this.date = date;
        this.status = status.intern();
    }

    public String getShipId() {
        return shipId;
    }

    public String getPort() {
        return port;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    /*
     * void displayShip() {
     * StringBuilder shipResult = new StringBuilder();
     * shipResult.append("[Ship: ").append(getShipId()).append(" | Port: ").append(
     * getPort()).append(" | Date: ")
     * .append(getDate()).append(" | Status: ").append(getStatus() + "]");
     * System.out.println(shipResult.toString());
     * }
     */
    @Override
    public String toString() {
        return String.format("[Ship: %d | Port: %s | Date: %s | Status: %s]", shipId, port, date, status);
    }
}

