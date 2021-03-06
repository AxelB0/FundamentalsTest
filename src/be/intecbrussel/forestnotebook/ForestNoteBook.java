package be.intecbrussel.forestnotebook;

import be.intecbrussel.animals.*;
import be.intecbrussel.plants.*;

import java.util.*;

public class ForestNoteBook {

    private List<Animal> animals = new ArrayList<Animal>();
    private List<Plant> plants = new ArrayList<Plant>();
    private List<Carnivore> carnivores = new ArrayList<Carnivore>();
    private List<Omnivore> omnivores = new ArrayList<Animal>();
    private List<Herbivore> herbivores = new ArrayList<Herbivore>();
    private int plantCount;
    private int animalCount;

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public List<Animal> getOmnivores() {
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
        animals.stream().limit(animalCount - 1).forEach(animal -> System.out.printf("%s, ", animal.getName()));
        System.out.printf("%s.\n", animals.get(animalCount - 1).getName());

        System.out.println("These are our carnivores:");
        carnivores.stream().forEach(System.out::println);
        System.out.println("These are our omnivores:");
        omnivores.stream().forEach(System.out::println);
        System.out.println("These are our herbivores:");
        herbivores.stream().forEach(System.out::println);
    }

    public void addAnimal(Animal animal) {
        if (animals.contains(animal)) {
            System.out.println("we already have this one!");
            return;
        }

        animals.add(animal);

        if (animal instanceof Omnivore) {
            addAnimalToSubList(omnivores, animal);
            return;
        }

        animalCount++;

        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
            return;
        }


        if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
            return;
        }
    }

    private void addAnimalToSubList(List<? extends Animal> sublist, Animal animal) {
//        sublist.add(animal); would be nice if it would work

        if (animal instanceof Omnivore) {
            return;
        }

        animalCount++;
    }

    public void addPlant(Plant plant) {
        if (plants.contains(plant)) {
            System.out.println("We already have this one!");
            return;
        }
        plants.add(plant);
        plantCount++;
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName, String::compareToIgnoreCase));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName, String::compareToIgnoreCase));
    }

    public void sortPlantsByColour() {
        plants.sort(Comparator.comparing(Plant::getColour));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortAnimalsByDecibel() {
        animals.stream()
                .filter(a -> a.getDecibel() >= 50)
                .sorted(Comparator.comparingInt((Animal animal) -> animal.getDecibel()).reversed())
                .forEach(System.out::println);

    }

}
