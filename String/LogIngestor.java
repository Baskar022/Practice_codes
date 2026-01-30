import java.util.*;

public class LogIngestor {

    /*
     * public String[] cleaning(String[] uncleanValue){ String[] cleanData={};
     * for(int i=0; i<uncleanValue.length;i++){
     * String updated=uncleanValue[i].toUpperCase().trim();
     * cleanData[i]=updated;
     * 
     * }
     * return cleanData;
     * }
     */
    public ShipRecord[] parseLog(String rawLog) {
        String[] shipLog = rawLog.split(";");
        ShipRecord[] validRecords = new ShipRecord[shipLog.length];
        int validCount = 0;
        for (int i = 0; i < shipLog.length; i++) {
            if (shipLog[i].startsWith("ERROR") || shipLog[i].isEmpty()) {
                continue;
            } else {
                String[] part = shipLog[i].split(",");
                if(part.length < 4){
                    continue;
                }
                for (int j = 0; j < part.length; j++) {
                    part[j] = part[j].toUpperCase().trim();
                }
                
                validRecords[validCount]=newRecord(part);
                validCount++;

            }
        }
        return validRecords;
    }

    private ShipRecord newRecord(String[] part) {
        return new ShipRecord(part[0],part[1],part[2],part[3]);
        
    }

    public static void main(String[] args) {
        String rawLog = "101,MUMBAI,2026-01-29,ARRIVED;102,dubai,2026-01-29,DEPARTED;ERROR:103-SIGNAL-LOST;104,SINGAPORE,2026-01-30,docked; 105,,2026-01-29,ARRIVED ";

        LogIngestor logs = new LogIngestor();
        ShipRecord[] shipLog = logs.parseLog(rawLog);
        for( int i=0;i<shipLog.length;i++) {
            if(shipLog[i] != null){
            System.out.println(shipLog[i]);
        }
    }
    }
}