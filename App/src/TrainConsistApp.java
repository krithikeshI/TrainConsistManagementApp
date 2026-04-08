import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}