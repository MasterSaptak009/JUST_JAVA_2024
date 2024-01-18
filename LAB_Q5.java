/*Design a class hierarchy for a zoo management system. Include classes 
for Animal, Mammal, Bird, and Reptile. Implement methods for 
feeding, breeding, and habitat management. */

import java.util.ArrayList;
import java.util.List;

// Base class
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void feed();

    public abstract void breed();

    public abstract void manageHabitat();
}

// Mammal subclass
class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the mammal is being fed.");
    }

    @Override
    public void breed() {
        System.out.println("Mammals reproduce through live birth.");
    }

    @Override
    public void manageHabitat() {
        System.out.println(getName() + " the mammal's habitat is being managed.");
    }
}

// Bird subclass
class Bird extends Animal {
    private String featherColor;

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the bird is being fed.");
    }

    @Override
    public void breed() {
        System.out.println("Birds reproduce by laying eggs.");
    }

    @Override
    public void manageHabitat() {
        System.out.println(getName() + " the bird's habitat is being managed.");
    }
}

// Reptile subclass
class Reptile extends Animal {
    private boolean isColdBlooded;

    public Reptile(String name, int age, boolean isColdBlooded) {
        super(name, age);
        this.isColdBlooded = isColdBlooded;
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the reptile is being fed.");
    }

    @Override
    public void breed() {
        System.out.println("Reptiles reproduce by laying eggs.");
    }

    @Override
    public void manageHabitat() {
        System.out.println(getName() + " the reptile's habitat is being managed.");
    }
}

// Zoo Management System
public class LAB_Q5 {
    public static void main(String[] args) {
        List<Animal> zooAnimals = new ArrayList<>();

        // Adding animals to the zoo
        zooAnimals.add(new Mammal("Lion", 5, "Golden"));
        zooAnimals.add(new Bird("Eagle", 3, "Brown"));
        zooAnimals.add(new Reptile("Snake", 2, true));

        // Managing the zoo
        for (Animal animal : zooAnimals) {
            System.out.println("\nManaging " + animal.getName() + ":");
            animal.feed();
            animal.breed();
            animal.manageHabitat();
        }
    }
}