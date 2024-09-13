

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private final List<Guitar> guitars;

    public Inventory() {
        
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,
        Builder builder, String model,
        Type type, Wood backWood, Wood topWood, int numStrings) {         
    
        GuitarSpec guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood, numStrings);
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new ArrayList<>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            if (searchSpec.equals(guitarSpec))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}