import java.util.ArrayList;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies after insertion
        System.out.println("Passenger Bogies after adding:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 5: Display bogies after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 6: Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie NOT found.");
        }

        // Step 7: Final list state
        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);
    }
}