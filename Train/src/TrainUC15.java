// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // Validation rule
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            // If valid, assign cargo
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            // Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + (cargo == null ? "No Cargo" : cargo);
    }
}

// Main Class
public class TrainUC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will be handled)
        b2.assignCargo("Petroleum");

        // Display final state
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        // Program continues
        System.out.println("\nProgram continues safely...");
    }
}