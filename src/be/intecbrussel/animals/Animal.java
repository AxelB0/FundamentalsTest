package be.intecbrussel.animals;

import java.util.Objects;

public class Animal {

    private String name;
    private double weight;
    private double height;
    private double length;
    private int decibel;
    private String sound;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.sound = "";
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public int getDecibel() {
        return decibel;
    }

    public String getSound() {
        return sound;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDecibel(int decibel) {
        this.decibel = decibel;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeNoise() {
        System.out.println(sound + " (" + decibel + " decibel)");
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", weight=" + weight + ", height=" + height + ", length=" + length + ", decibel=" + decibel + ", sound='" + sound + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
