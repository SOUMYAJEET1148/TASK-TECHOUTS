import java.util.*;
public class ReadonlyData{

    public static void main(String[] args) {
        
        List<String> li = new ArrayList<>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");

       
        List<String> ReadOnlyList = Collections.unmodifiableList(li);

        
        try {
            ReadOnlyList.add("Cocunut"); 
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify read-only list.");
        }

    
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        
        Set<Integer> ReadOnlySet = Collections.unmodifiableSet(s);

       
        try {
            ReadOnlySet.add(4); 
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify read-only set.");
        }

       
        Map<String, Integer> ls = new HashMap<>();
        ls.put("One", 1);
        ls.put("Two", 2);
        ls.put("Three", 3);

        Map<String, Integer> ReadOnlyMap = Collections.unmodifiableMap(ls);

      
        try {
            ReadOnlyMap.put("Four", 4); 
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify read-only map.");
        }

       
        System.out.println("ReadOnly List: " + li);
        System.out.println("ReadOnly Set: " + ReadOnlySet);
        System.out.println("ReadOnly Map: " +ReadOnlyMap);
    }
}



