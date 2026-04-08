import java.util.LinkedList;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Step 2: Add initial bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Step 3: Insert Pantry Car at position 2
        // Index 2 means 3rd position
        train.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(train);

        // Step 4: Remove first and last bogie
        train.removeFirst();  // removes Engine
        train.removeLast();   // removes Guard

        // Step 5: Display final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}