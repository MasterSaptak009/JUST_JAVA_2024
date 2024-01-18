/*Define a base class Animal with a method makeSound(). Create 
two subclasses Dog and Cat that override the makeSound() method 
to print a specific sound. */

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}
// Subclass Bird
 class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}
// Subclass Cat
 class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
public class LAB_Q4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        animal.makeSound(); // Output: The animal makes a sound
        bird.makeSound();   // Output: The bird chirps
        cat.makeSound();    // Output: The cat meows
    }
}