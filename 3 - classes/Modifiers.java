public class Modifiers {
    public static void main(String[] args) {
        /**
        if you've been wondering, "what do those public or private or any other
        kinds of word mean in front of a class or a method?"
        those are called *modifiers*.

        there are various types of modifiers, they are: public, private, and static.
        there are also other modifiers such as final or abstract, but they are
        directly related to more advanced OOP concepts such as inheritance and abstraction.
        
        since we're only sticking to the basics in this example,
        we'll only discuss a few common ones.
        */
        
        // VARIABLES
        /*
        so far, we've been declaring variables as vartype varname.
        however, we can also specify its modifier, e.g. public vartype varname.
        this also applies to constructors and methods.
        if no modifier is specified, Java will by default set the modifier to public.
        */
        MotoBike3 RC211V = new MotoBike3(125.50, 120.1, 1000, 400);
        // public variable can be accessed or modified outside of that class
        RC211V.fuel_capacity = 124.50;
        System.out.println(RC211V.fuel_capacity);
        // private variables are not accessible
        //System.out.println(RC211V.cc);  // will throw an error
        // nor changeable
        //RC211V.cc = 990;         // will throw an error
        // we can only access them by calling a method from the class whose private
        // variable belongs to if such method exists
        System.out.println(RC211V.set_cc(990));

        // the static variable
        MotoBike3.tyres = 2;   
        // this value becomes global to all objects:
        System.out.println(RC211V.tyres);
        MotoBike3 GSXRR = new MotoBike3(125.50, 120.1, 1000, 400);
        MotoBike3 YZRM1 = new MotoBike3(130, 110.75, 1000, 396);
        MotoBike3 Desmo = new MotoBike3(122.25, 118.30, 1000, 420);
        System.out.println(GSXRR.tyres);
        System.out.println(YZRM1.tyres);
        System.out.println(Desmo.tyres);
        
    }
}

class MotoBike3 {
    public double fuel_capacity; // public means this is accessible for all classes
    double weight;     // no modifier means Java will set this to public by default
    private int cc;    // private means this is accessible for this class only
    int top_speed;        
    static int tyres;  // static means the value of this variable becomes global to all objects of this class

    MotoBike3(double f, double w, int c, int t) {
        fuel_capacity = f;
        weight = w;
        cc = c;
        top_speed = t;
    }

    // we can access the private variables in this class
    int set_cc(int c) {
        cc = c;
        return cc;
    }
}