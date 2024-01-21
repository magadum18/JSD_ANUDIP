import java.util.Scanner;

// Animal superclass
class Animal {
    // Method to make a sound
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog subclass
class Dog extends Animal {
    // Override makeSound method for Dog
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Cat subclass
class Cat extends Animal {
    // Override makeSound method for Cat
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class AnimalEg {
    public static void main(String[] args) {
        // Create objects of Animal, Dog, and Cat classes
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Display sounds
        System.out.println("Generic Animal sound:");
        genericAnimal.makeSound();

        System.out.println("\nDog sound:");
        myDog.makeSound();

        System.out.println("\nCat sound:");
        myCat.makeSound();

        // Allow the user to create and display objects dynamically
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter 'D' to create a Dog or 'C' to create a Cat: ");
        String userInput = scanner.next();

        Animal userAnimal;
        if (userInput.equalsIgnoreCase("D")) {
            userAnimal = new Dog();
        } else if (userInput.equalsIgnoreCase("C")) {
            userAnimal = new Cat();
        } else {
            userAnimal = new Animal();
        }

        System.out.println("\nUser's Animal sound:");
        userAnimal.makeSound();

        // Close the scanner
        scanner.close();
    }
}
