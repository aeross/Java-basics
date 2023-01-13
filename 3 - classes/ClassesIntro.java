public class ClassesIntro {
    public static void main(String[] args) {
        // from the class 'SoccerPlayer', an object can be created.
        // here, the object created is called 'messi'.
        SoccerPlayer messi = new SoccerPlayer();

        // the variables inside a class are called attributes.
        // we can access attributes as follows.
        messi.shooting = 99;
        messi.dribbling = 99;
        messi.passing = 99;
        messi.salary = 30.500;
        messi.transfer_fee = 120_000_000L;
        System.out.println(messi.shooting);
        System.out.println(messi.dribbling);
        System.out.println(messi.passing);
        System.out.println(messi.salary);
        System.out.println(messi.transfer_fee);

        // we can create multiple objects of one class and change the attribute values 
        // in one object without affecting the attribute values in the others
        SoccerPlayer neymar = new SoccerPlayer();
        neymar.transfer_fee = 222_000_000L;
        System.out.println(neymar.transfer_fee);

        // declaring the values of a class's attributes is essential,
        // but notice how much space and effort this takes!
        // the solution: "Constructors"
        // visit Constructors.java for more explanation
    }
}

class SoccerPlayer {
    int shooting;   // from 1 to 99, with 1 being the worst and 99 being the best
    int dribbling;  // same, from 1 to 99
    int passing;    // also from 1 to 99
    double salary;
    long transfer_fee;

    // this is a method, Visit ClassMethods.java for more details
    public double overall() {
        // the overall ability of a player
        return (shooting + dribbling + passing) / (double)3;
    }
}