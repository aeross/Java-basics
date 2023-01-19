public class Abstraction {
    public static void main(String[] args) {

        // an abstract class cannot be made into an object
        //Animal myAnimal = new Animal();  // error

        // the purpose of an abstract class is for it to act as a
        // parent class to other subclasses
        Cat myCat = new Cat();
        myCat.animalSound();

    }
}

abstract class Animal {
    // an abstract class can have an abstract method -- it means that this method
    // must exist in the any subclass that has this class as the parent class
    public abstract void animalSound();
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("meow");
    }
}