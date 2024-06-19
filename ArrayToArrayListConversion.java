import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ArrayToArrayListConversion {
    public static void main(String[] args) {
        
        String[] array = {"Apple", "Banana", "Cherry"};

        
        List<String> arrayList1 = new ArrayList<>(Arrays.asList(array));

        
        List<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, array);

        
        List<String> arrayList3 = new ArrayList<>();
        for (String element : array) {
            arrayList3.add(element);
        }

      
        System.out.println("ArrayList 1: " + arrayList1);
        System.out.println("ArrayList 2: " + arrayList2);
        System.out.println("ArrayList 3: " + arrayList3);
    }
}
