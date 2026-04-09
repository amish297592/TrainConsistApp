public class TrainUC18 {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("===  Train Consist   Management App ===");

        // Array of bogie IDs
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchKey = "BG309";

        System.out.println("\nSearching for Bogie ID: " + searchKey);

        // Perform search
        boolean found = linearSearch(bogies, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie Found in Train Consist ✅");
        } else {
            System.out.println("Bogie NOT Found ❌");
        }

        System.out.println("\nProgram continues...");
    }
}