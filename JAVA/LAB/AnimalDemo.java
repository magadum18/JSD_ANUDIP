// Animal class (Superclass)
class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog class (Subclass)
class Dog extends Animal {
    // Override the makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Cat class (Subclass)
class Cat extends Animal {
    // Override the makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class
public class AnimalDemo {
    public static void main(String[] args) {
        // Create objects of each class

        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Display the sounds made by each animal
    
        System.out.println("\nDog Sound:");
        myDog.makeSound();

        System.out.println("\nCat Sound:");
        myCat.makeSound();
    }
}
