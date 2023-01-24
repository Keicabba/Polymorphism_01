package it.figuccia;

public class Animal {
    private String animalName;

    public Animal(String name) {
        this.animalName = name;
    }

    public void animalSound() {
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity) {
        if (intensity.equals("high")) {
            System.out.println("Roarrrrrrrr!");
        } else if (intensity.equals("low")) {
            System.out.println("Roar");
        } else {
            System.out.println("Cannot reproduce it properly.");
        }
    }
}
