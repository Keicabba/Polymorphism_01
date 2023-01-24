package it.figuccia;

class Tester {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion");
        animal.animalSound();
        animal.animalSound("high");
        animal.animalSound("low");
    }
}
