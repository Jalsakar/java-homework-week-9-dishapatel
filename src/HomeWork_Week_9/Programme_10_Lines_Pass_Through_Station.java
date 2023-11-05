package HomeWork_Week_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */
public class Programme_10_Lines_Pass_Through_Station {
    public static void main(String[] args) {
       Programme_10_Lines_Pass_Through_Station station = new Programme_10_Lines_Pass_Through_Station();
       station.toCheckLineWithStation();
    }
    public void toCheckLineWithStation(){
       //Create a map to store stations and the kines that pass through them
        Map<String, Set<String>> stationLines = new HashMap<>();

        //Add data for zone 1 Stations
        stationLines.put("King's Cross St Pancras", Set.of("Victoria Line", "Northern Line", "Piccadilly Line", "Circle Line", "Hammersmith & City Line"));
        stationLines.put("Oxford Circus", Set.of("Bakerloo Line", "Central Line", "Victoria Line"));
        stationLines.put("Waterloo", Set.of("Bakerloo Line", "Northern Line", "Jubilee Line", "Waterloo & City Line"));
        stationLines.put("Embankment", Set.of ("Bakerloo Line", "District Line", "Circle Line", "Northern Line"));
        stationLines.put("London Bridge", Set.of("Jubilee Line", "Northern Line"));

        //Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Input the user query for a station
        System.out.println("Enter a station name in zone 1 : ");
        String stationQuery = scanner.nextLine();

        //Check if the station exists in the map
        if (stationLines.containsKey(stationQuery)){
            Set<String> lines = stationLines.get(stationQuery);
            System.out.println("Lines passing through " + stationQuery + " : " + lines);
        }else {
            System.out.println("The station " + stationQuery + " is not in Zone 1 or not found in the data." );
        }
        //Close the scanner to release the system resources
        scanner.close();
    }
}// Run the program