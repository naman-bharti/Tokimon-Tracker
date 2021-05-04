package TokimonPackage;

/**
 * Tokimon class models the information about a Tokimon. Data includes name, type, height, weight and strength.
 * It supports getting and setting these attributes of a Tokimon.
 */

public class Tokimon {
    private String name;
    private String type;
    private double height;
    private double weight;
    private int strength;

    public Tokimon(String name, String type, double height, double weight, int strength) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " [Name:" + name +
                ", Strength:" + strength +
                ", Height:" + height +
                ", Weight:" + weight +
                ", Ability:" + type +
                ']';
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }
}
