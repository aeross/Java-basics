// we can also call methods that are inside in another class, whether
// that class is in the same .java or in another .java, as long as it is
// in the same directory.
public class ClassMethods {
    public static void main(String[] args) {
        // class from the same file
        Body Suarez = new Body();
        Suarez.height = 182;
        Suarez.weight = 85.5;
        Suarez.calculateBMI();
        System.out.println(Suarez.returnBMI());
        System.out.println(Suarez.calculateBFP(35, 'M'));

        // class from another file
        SoccerPlayer Lewandowski = new SoccerPlayer();
        Lewandowski.shooting = 91;
        Lewandowski.dribbling = 80;
        Lewandowski.passing = 85;
        System.out.println(Lewandowski.overall());
    }
}

class Body {
    double height;  // in kg
    double weight;  // in cm
    
    void calculateBMI() {
        // the formula is given as kg/m^2
        double height_m = height / 100.0;
        System.out.println(weight / (height_m * height_m));
    }

    // what if we want to return the result instead of printing it?
    double returnBMI() {
        double height_m = height / 100.0;
        return weight / (height_m * height_m);
    }

    // what if we want to use (a) parameter(s) for our method?
    double calculateBFP(int age, char gender) {
        // we'll calculate the body fat percentage using the formula
        // (1.20 * BMI) + (0.23 * Age) - constant
        double BFP = 0;
        double BMI = returnBMI();

        if (gender == 'F') {
            BFP = (1.20 * BMI) + (0.23 * age) - 5.4;
        } else if (gender == 'M') {
            BFP = (1.20 * BMI) + (0.23 * age) - 16.2;
        }

        return BFP;
    }
}