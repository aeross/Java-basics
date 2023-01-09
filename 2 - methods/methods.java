public class methods {
    // this is the main method
    public static void main(String[] args) {

        // calling a method from the same class is simple when such method returns void
        printHelloWorld();

        // when a method returns something, we can't just call it like we did above, 
        // but we also need to take the return value into consideration
        String return_value = returnHelloWorld();
        System.out.println(return_value);

        // information can be passed to methods as (a) parameter(s)
        // parameters act as variables inside the method
        // in this case, a and b are parameters that are being passed inside the method
        int a = 23, b = 54;
        System.out.println(addTwoNumbers(a, b));

        // methods are useful because they can be used multiple times whilst only written once
        int num1[] = {11, 32, 24, 45, 17, 21, 31, 22, 27, 31, 24, 34};
        int num2[] = {74, 67, 55, 56, 57, 71, 50, 86, 77, 94, 90, 69};
        int num3[] = {6, 27, 43, 43, 17, 2, 100, 99, 17, 23, 65, 19};
        getAverage(num1);
        getAverage(num2);
        getAverage(num3);
    }

    // this is a method we created ourselves
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    // not only void, a method can return other variable types
    public static String returnHelloWorld() {
        return "Hello World!";
    }

    // the variables inside the method's brackets (a, b) are called parameters
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    // an example of a less trivial method
    public static void getAverage(int array[]) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        System.out.println((double)sum / array.length);
    }
}