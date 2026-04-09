import java.util.Arrays;

public class TrainUC17 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogies));

        // Built-in sorting
        Arrays.sort(bogies);

        // After sorting
        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nProgram continues...");
    }
}