/*
Polymorphism also uses the same superclass - subclass concepts as inheritance.
Polymorphism means "many forms", it allows us to use the same methods from different classes.
*/

// parent class
class Feline {
    public void felineSound() {
        System.out.println("meow meow");
    } 
}

// subclasses
class Cat extends Feline {
}

class Tiger extends Feline {
    public void felineSound() {
        System.out.println("rawr rawr");
    }
}

class Cougar extends Feline {
    public void felineSound() {
        System.out.println("AAAaaAaAAAAaaaAaaAaAAaA");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        Feline myFeline = new Feline();
        myFeline.felineSound();

        // we can call methods from the parent class
        Cat myCat = new Cat();
        myCat.felineSound();

        // when a method of the same name also exists in the subclass, 
        // it overrides the method in the parent class
        Tiger myTiger = new Tiger();
        myTiger.felineSound();

        Cougar myCougar = new Cougar();
        myCougar.felineSound();

        Flerken myFlerken = new Flerken();
        myFlerken.felineSound();
        myFlerken.eatSound();
        myFlerken.eatSound(10);
    } 
}


// it is also possible for methods to have the same name in the same class,
// as long as they take in different parameters
class Flerken extends Feline {
    public void eatSound() {
        System.out.println("nom nom nom");
    }

    public void eatSound(int number) {
        for (int i=0; i < number; i++) {
            System.out.print("nom ");
        }
        System.out.print("\n");
    }
}
// this is called "method overloading"