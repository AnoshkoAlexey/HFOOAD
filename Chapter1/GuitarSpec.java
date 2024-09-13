

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    @Override
    public boolean equals(Object object) {
        
        if (this == object)
            return true;

        if (object == null || object.getClass() != this.getClass())
            return false;

        GuitarSpec guitarSpec = (GuitarSpec)object;
        return builder == guitarSpec.builder && model.toLowerCase().equals(guitarSpec.model.toLowerCase()) &&
                type == guitarSpec.type &&    
                backWood == guitarSpec.backWood &&
                topWood == guitarSpec.topWood &&
                numStrings == guitarSpec.numStrings;

    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model.toLowerCase(), type, backWood, topWood, numStrings);
    }
}
