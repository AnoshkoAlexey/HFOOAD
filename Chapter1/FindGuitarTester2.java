import java.util.Iterator;
import java.util.List;

public class FindGuitarTester2 {
    public static void main(String[] args)  {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        InitializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
                Guitar guitar = i.next();
                GuitarSpec guitarSpec = guitar.getSpec();
                System.out.println("We have a " +
                    guitarSpec.getBuilder() + " " + guitarSpec.getModel() + " " +
                    guitarSpec.getNumStrings() + "-string " +
                    guitarSpec.getType() + " guitar:\n " +
                    guitarSpec.getBackWood() + " back and sides,\n " +
                    guitarSpec.getTopWood() + " top.\n You can have it for only $" +
                    guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
            }
        }

    private static void InitializeInventory(Inventory inventory) {
        // Add guitars to the inventory... 
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);
    }

}

