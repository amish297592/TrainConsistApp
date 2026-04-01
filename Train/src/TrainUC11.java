import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainUC11 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (can be replaced with user input later)
        String trainID = "TRN-1234";
        String cargoCode = "PET-AB";

        // Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate inputs
        boolean isTrainValid = trainMatcher.matches();
        boolean isCargoValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nTrain  ID: " + trainID);
        System.out.println("Valid Train ID? " + isTrainValid);

        System.out.println("\nCargo Code: " + cargoCode);
        System.out.println("Valid Cargo Code? " + isCargoValid);

        // Program continues...
    }
}