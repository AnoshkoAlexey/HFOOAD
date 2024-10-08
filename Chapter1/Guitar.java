

public class Guitar {
    private final String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;
    
    public Guitar(String serialNumber, double price,
        GuitarSpec guitarSpec) {

        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
    public GuitarSpec getSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }
}