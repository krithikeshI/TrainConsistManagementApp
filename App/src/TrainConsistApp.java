import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create HashSet for Bogie IDs
        Set<String> bogieSet = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates intentionally)
        bogieSet.add("BG101");
        bogieSet.add("BG102");
        bogieSet.add("BG103");
        bogieSet.add("BG101"); // Duplicate
        bogieSet.add("BG104");
        bogieSet.add("BG102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("🚆 Unique Bogie IDs in Train Consist:");
        for (String id : bogieSet) {
            System.out.println(id);
        }
    }
}