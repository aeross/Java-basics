public class Constructors {
    public static void main(String[] args) {

        // a constructor is a special method to initialise objects
        MotoBike RC211V = new MotoBike(125.50, 120.1, 1000, 400);
        System.out.println(RC211V.fuel_capacity);
        System.out.println(RC211V.weight);
        System.out.println(RC211V.cc);
        System.out.println(RC211V.top_speed + "\n");

        MotoBike2 YZRM1 = new MotoBike2();
        System.out.println(YZRM1.fuel_capacity);
        System.out.println(YZRM1.weight);
        System.out.println(YZRM1.cc);
        System.out.println(YZRM1.top_speed);
    }
}

class MotoBike {
    double fuel_capacity;
    double weight;
    int cc;
    int top_speed;

    // constructor
    MotoBike(double f, double w, int c, int t) {
    // note: the name of the constructor has to exactly match the name of the class
    // after the constructor is defined, all we need to do is set 
    // the attributes equal to the constructor parameters:
        fuel_capacity = f;
        weight = w;
        cc = c;
        top_speed = t;
    }
    // contrary to a method, a constructor does not have a return type, e.g. void MotoBike
}

class MotoBike2 {
    double fuel_capacity;
    double weight;
    int cc;
    int top_speed;

    MotoBike2() {
    // instead of passing the values from parameters, a constructor can also
    // construct "built-in" values without any parameters needed
        fuel_capacity = 130;
        weight = 110.75;
        cc = 1000;
        top_speed = 396;
    }
}