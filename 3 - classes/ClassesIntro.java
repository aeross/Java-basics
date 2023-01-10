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

    }
}

class SoccerPlayer {
    int shooting;
    int dribbling;
    int passing;
    double salary;
    long transfer_fee;
}