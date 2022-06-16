package be.intecbrussel.plants;

import java.util.Objects;

public class Plant {
    private String name;
    private double height;
    private Colour colour;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public Colour getColour() {
        return colour;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Plant{" + "name='" + name + '\'' + ", height=" + height + ", colour=" + colour + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
