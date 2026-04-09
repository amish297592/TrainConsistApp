import java.util.Arrays;

public class TrainUC19 {

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].compareTo(key);

            if (result == 0) {
                return true; // Found
            } else if (result < 0) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=== Train  Consist Management App ===");

        // Unsorted bogie IDs
        String[] bogies = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Sort before binary search
        Arrays.sort(bogies);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogies));

        // Search key
        String searchKey = "BG309";

        System.out.println("\nSearching for Bogie ID: " + searchKey);

        // Perform Binary Search
        boolean found = binarySearch(bogies, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie Found in Train Consist ✅");
        } else {
            System.out.println("Bogie NOT Found ❌");
        }

        System.out.println("\nProgram continues...");
    }
}