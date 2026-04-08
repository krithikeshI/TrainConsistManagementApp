import java.util.*;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " Bogie - Capacity: " + capacity);
    }
}

// Main Class
public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create List of Bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add Passenger Bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort using Comparator (Ascending Order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display Sorted Bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):");
        for (Bogie b : bogies) {
            b.display();
        }

        // Step 5: Sort in Descending Order (Optional Enhancement)
        bogies.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nBogies Sorted by Capacity (Descending):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}