package be.intecbrussel.nature;

import be.intecbrussel.animals.*;
import be.intecbrussel.forestnotebook.ForestNoteBook;
import be.intecbrussel.plants.*;

public class app {
    public static void main(String[] args) {
        ForestNoteBook myForestNoteBook = new ForestNoteBook();

        Tree plant1 = new Tree("Maple", 34.5);
        Bush plant2 = new Bush("George", 9.11);
        Flower plant3 = new Flower("Sunflower", 7);
        Weed plant4 = new Weed("Snoop Dogg's favourite weed", 420);
        Tree plant5 = new Tree("Oak", 12.3);
        Tree plant6 = new Tree("Maple", 7);

        plant1.setColour(Colour.RED);
        plant2.setColour(Colour.BLUE);
        plant3.setColour(Colour.GREEN);
        plant4.setColour(Colour.YELLOW);
        plant5.setColour(Colour.BROWN);

        Herbivore herbivore1 = new Herbivore("Gorilla", 170, 1.6, 0.5);
        Herbivore herbivore2 = new Herbivore("Rabbit", 2, 0.3, 0.2);
        Herbivore herbivore3 = new Herbivore("Elephant", 4000, 5.5, 2.9);
        Herbivore herbivore4 = new Herbivore("Gorilla", 21, 12, 12);
        Carnivore carnivore1 = new Carnivore("Snek", 59, 0.4, 6);
        Carnivore carnivore2 = new Carnivore("Lion", 190, 1, 2.3);
        Carnivore carnivore3 = new Carnivore("Frog", 0.22, 0.06, 0.09);
        Omnivore omnivore1 = new Omnivore("Bear", 200, 1.8, 0.6);
        Omnivore omnivore2 = new Omnivore("human", 69, 1.8, 0.2);
        Omnivore omnivore3 = new Omnivore("Dog", 30, 0.8, 1.07);

        myForestNoteBook.addPlant(plant1);
        myForestNoteBook.addPlant(plant2);
        myForestNoteBook.addPlant(plant3);
        myForestNoteBook.addPlant(plant4);
        myForestNoteBook.addPlant(plant5);
        myForestNoteBook.addPlant(plant6); // duplicate test

        myForestNoteBook.addAnimal(herbivore1);
        myForestNoteBook.addAnimal(herbivore2);
        myForestNoteBook.addAnimal(herbivore3);
        myForestNoteBook.addAnimal(herbivore4); //duplicate test
        myForestNoteBook.addAnimal(carnivore1);
        myForestNoteBook.addAnimal(carnivore2);
        myForestNoteBook.addAnimal(carnivore3);
        myForestNoteBook.addAnimal(omnivore1);
        myForestNoteBook.addAnimal(omnivore2);
        myForestNoteBook.addAnimal(omnivore3);

        myForestNoteBook.printNoteBook();

        myForestNoteBook.sortAnimalsByName();
        myForestNoteBook.sortPlantsByName();

        myForestNoteBook.printNoteBook();

        myForestNoteBook.sortPlantsByColour();

        myForestNoteBook.printNoteBook();

        herbivore1.setDecibel(60);
        herbivore2.setDecibel(20);
        omnivore2.setDecibel(80);
        carnivore3.setDecibel(100);

        System.out.println("\nAnimals sorted by decibel:");

        myForestNoteBook.sortAnimalsByDecibel();


    }
}
