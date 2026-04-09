import java.util.Arrays;

public class TrainUC20 {

    // Search Method with Validation
    public static boolean searchBogie(String[] bogies, String key) {

        // Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("Cannot perform search: Train consist is empty");
        }

        // Linear Search (can also use binary if sorted)
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Case 1: Empty bogie list
        String[] emptyBogies = {};

        try {
            System.out.println("\nSearching in empty train...");
            searchBogie(emptyBogies, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Case 2: Valid bogie list
        String[] bogies = {"BG101", "BG205", "BG309"};

        try {
            System.out.println("\nSearching in valid train...");

            boolean found = searchBogie(bogies, "BG205");

            if (found) {
                System.out.println("Bogie Found ✅");
            } else {
                System.out.println("Bogie NOT Found ❌");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}