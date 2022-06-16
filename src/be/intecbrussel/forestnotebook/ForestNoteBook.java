package be.intecbrussel.forestnotebook;

import be.intecbrussel.animals.*;
import be.intecbrussel.plants.*;

import java.util.ArrayList;
import java.util.List;

public class ForestNoteBook {

    private List<Animal> animals = new ArrayList<Animal>();
    private List<Plant> plants = new ArrayList<Plant>();
    private List<Carnivore> carnivores = new ArrayList<Carnivore>();
    private List<Omnivore> omnivores = new ArrayList<Omnivore>();
    private List<Herbivore> herbivores = new ArrayList<Herbivore>();
    private int plantCount;
    private int animalCount;

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void printNoteBook() {

        System.out.println("\nWe have " + plantCount + " plants.");
        plants.stream().forEach(plant -> System.out.println(plant.toString()));


        System.out.println("We have " + animalCount + " animals.");
        animals.stream().limit(animalCount - 1)
                .forEach(animal -> System.out.printf("%s, ", animal.getName()));
        System.out.printf("%s.\n", animals.get(animalCount - 1).getName());

        System.out.println("These are our carnivores:");
        carnivores.stream().forEach(System.out::println);
        System.out.println("These are our omnivores:");
        omnivores.stream().forEach(System.out::println);
        System.out.println("These are our herbivores:");
        herbivores.stream().forEach(System.out::println);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        } else if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
        } else if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        }
        animalCount++;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
        plantCount++;
    }

    public void sortAnimalsByName() {
    }

    public void sortPlantsByName() {
    }

    public void sortPlantsByColour() {
    }

    public void sortAnimalsByHeight() {
    }

}
