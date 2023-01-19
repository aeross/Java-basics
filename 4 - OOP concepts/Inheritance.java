/**
Inheritance means dividing classes into two parts: superclass and subclass.
Subclass is the class that inherits from superclass, i.e. they act as child and parent class.

Inheritance and polymorphism are useful because they allow attributes and
methods to be reused from other classes.
**/

// parent class
class Person {
    String name;
    int age;
    double weight;
    double height;
}

// child class
class Male extends Person {
    int pSize;   // an attribute that is specific to the Male class
}

public class Inheritance {
    public static void main(String[] args) {
        Male eric = new Male();  // only need to create an object from Male
        eric.name = "Eric";      // attribute from Person class
        eric.pSize = 6;          // attribute from Male class
        System.out.println(eric.name + "'s pSize is " + eric.pSize + " in.");
    }
}