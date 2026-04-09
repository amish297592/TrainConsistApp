import java.util.ArrayList;
import java.util.List;

// GoodsBogie class
class GoodsBogie {
    String type;   // Cylindrical, Open, Box
    String cargo;  // Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainUC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist  Management App ===");

        // Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Safety validation using stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Display result
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        System.out.println("\nIs Train Safety Compliant? " + isSafe);

        // Program continues...
    }
}