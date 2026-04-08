import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create LinkedHashSet to store bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        System.out.println("Adding bogies to the train...\n");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("Attempting to add duplicate bogie: Sleeper\n");
        trainFormation.add("Sleeper"); // This will be ignored automatically

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):\n");

        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}