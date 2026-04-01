import java.util.HashSet;
import java.util.Set;

public class TrainUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train   Consist Management App ===");

        // Create HashSet for Bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG105"); // Duplicate
        bogieIDs.add("BG106"); // Duplicate

        // Display unique bogie IDs
        System.out.println("\nBogie IDs in the system:");
        System.out.println(bogieIDs);

        // Program continues...
    }
}