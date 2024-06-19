import java.util.*;
public class IteratorMethod {
   

    public static void main(String[] args) {
       
        Map<String, String> CC = new HashMap<>();
        
       
        CC.put("USA", "Washington D.C.");
        CC.put("India", "New Delhi");
        CC.put("France", "Paris");
        CC.put("Japan", "Tokyo");
        CC.put("Australia", "Canberra");
        
        
        System.out.println("Iterating using forEach loop:");
        CC.forEach((country, capital) -> {
            System.out.println("Capital of " + country + " is " + capital);
        });
        System.out.println();
        
        
        System.out.println("Iterating using keySet() ");
        Set<String> countries = CC.keySet();
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            String country = iterator.next();
            String capital = CC.get(country);
            System.out.println("Capital of " + country + " is " + capital);
        }
        System.out.println();
        
        
        System.out.println("Iterating using entrySet() and forEach loop:");
        Set<Map.Entry<String, String>> entries = CC.entrySet();
        entries.forEach(entry -> {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Capital of " + country + " is " + capital);
        });
        System.out.println();
        
        
        System.out.println("Iterating using entrySet() and Iterator:");
        Iterator<Map.Entry<String, String>> mapIterator = CC.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, String> entry = mapIterator.next();
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Capital of " + country + " is " + capital);
        }
    }
}


