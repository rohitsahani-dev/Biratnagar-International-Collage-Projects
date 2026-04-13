package Week_6;

import java.util.*;

public class Q_11 {
public static void main(String[] args) {
    
    HashMap<String, String> countryCapitals = new HashMap<>();
    countryCapitals.put("Nepal", "Kathmandu");
    countryCapitals.put("Japan", "Tokyo");
    countryCapitals.put("France", "Paris");
    countryCapitals.put("Germany", "Berlin");
    countryCapitals.put("USA", "Washington");

    
    System.out.println("--- Iterating Map ---");
    for (String country : countryCapitals.keySet()) {
        System.out.println("Country: " + country + ", Capital: " + countryCapitals.get(country));
    }

    
    System.out.println("\n--- Testing Methods ---");
    printMap(countryCapitals);
    
    System.out.println("Capital of Japan: " + getCapital(countryCapitals, "Japan"));
    System.out.println("Is 'Paris' in the map? " + containsCapital(countryCapitals, "Paris"));
}

public static void printMap(HashMap<String, String> map) {
    System.out.println("Full Map: " + map);
}


public static String getCapital(HashMap<String, String> map, String country) {
    return map.get(country);
}

public static boolean containsCapital(HashMap<String, String> map, String capital) {
    return map.containsValue(capital);

}
	
}
