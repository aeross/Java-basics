/** 
Another way to achieve abstraction is with interface. Like abstract classes,
an interface cannot be used to create an object.

An interface automatically sets methods as abstract and public,
and attributes as static, public, and final.

This means, interface methods can never contain a body, and all the methods
must be overriden by any class that implements the interface.
**/

interface FirstInterface {
    public void myMethod(); // interface methods don't have a body
}

interface SecondInterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class Interface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}