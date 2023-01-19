/**
Inheritance means dividing classes into two parts: superclass and subclass.
Subclass is the class that inherits from superclass, i.e. they act as child and parent class.

Inheritance and polymorphism are useful because they allow attributes and
methods to be reused from other classes.
**/

// superclass
class Person {
    String name;
    int age;
    double weight;
    double height;
}

// subclass
class Male extends Person {
    int pSize;   // an attribute that are specific to the Male class (subclass)
}

public class Inheritance {
    public static void main(String[] args) {
        Male eric = new Male();
        eric.name = "Eric";  // attribute from superclass
        eric.pSize = 6;      // attribute from subclass
        System.out.println(eric.name + "'s pSize is " + eric.pSize + " in.");
    }
}