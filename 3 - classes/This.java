public class Modifiers {
    public static void main(String[] args) {
    }
}

class MotoBike3 {
    public double fuel_capacity;
    double weight;
    private int cc;
    int top_speed;        
    static int tyres;


    // instead of using f, w, c, and t as the parameter names,
    // we can simply use the actual variable names and use "this"
    MotoBike3(double fuel_capacity, double weight, int cc, int top_speed) {
        this.fuel_capacity = fuel_capacity;
        this.weight = weight;
        this.cc = cc;
        this.top_speed = top_speed;
    }

    // we can access the private variables in this class
    int get_cc() {
        return this.cc;
    }
    void set_cc(int cc) {
        this.cc = cc;
    }
    // these methods are called *getters* and *setters*
}