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

    // how "this" works
    public void frobnicate() {
        int cc = 1;
        System.out.println(cc); // refers to the local variable a, prints 1
        System.out.println(this.cc); // refers to the field a, prints the value of this.cc
        System.out.println(this); // refers to this entire object
    }

    // it's good practice to use "this" for clarity and less confusion
    int get_cc() {
        return this.cc;
    }
    void set_cc(int cc) {
        this.cc = cc;
    }
}