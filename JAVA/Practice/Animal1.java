class Animal1{
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.makeSound(); // Output: The animal makes a sound.
        dog.makeSound(); // Output: The dog barks.
        cat.makeSound(); // Output: The cat meows.
    }
