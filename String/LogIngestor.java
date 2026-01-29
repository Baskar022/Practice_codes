import java.util.*;
public class LogIngestor {

    public String[] parseLog(String rawLog) {
        String[] shipLog = rawLog.split(";");
        return shipLog;
    }
    public static void main(String[] args) {
        String rawLog = "101,MUMBAI,2026-01-29,ARRIVED;102,dubai,2026-01-29,DEPARTED;ERROR:103-SIGNAL-LOST;104,SINGAPORE,2026-01-30,docked; 105,,2026-01-29,ARRIVED ";
        
        LogIngestor logs = new LogIngestor();
        String[] shipLog = logs.parseLog(rawLog);
        
    }
}