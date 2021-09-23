
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("Larry");
        strings.add("Araceli");
        strings.add("Joe");
        
        removeLast(strings);
        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.get(strings.size() - 1));
        }
    }

}
