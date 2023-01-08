import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // declare an array of integers
        int[] numbers = {1, 2, 3, 4};
        // prints the 0th index
        System.out.println(numbers[0]);
// ------------------------------------------------------------------------------------------------
        System.out.println("");
        // array of strings
        String[] names = {"Tom", "Ben", "Dan", "Sam"};
        System.out.println(names[0]);
        // the value of a specific element can be changed this way
        names[0] = "Ugly";
        System.out.println(names[0]);
// ------------------------------------------------------------------------------------------------
        System.out.println("");
        // find the length of an array
        int[] primes = {2, 11, 17, 3, 7, 13, 5};
        System.out.println(primes.length);
// ------------------------------------------------------------------------------------------------
        System.out.println("");
        // looping through an array
        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }
        // another method of looping through an array, using the for-each loop
        /**
        for (type variable : arrayname) {
            ...
        } 
        */
        for (int i: primes) {
            System.out.println(i);
        }
// ------------------------------------------------------------------------------------------------
        System.out.println("");
        // printing the entire array
        System.out.println(primes);  // well, this just gives out a gibberish value...
        // the solution is, we need this library!
        // import java.util.Arrays;
        System.out.println(Arrays.toString(primes));
// ------------------------------------------------------------------------------------------------
        // array manipulation
        // we'll do a selection sort to demonstrate as an example
        int min = 0;
        int temp, i, j, k = 0;

        // try to understand this block of code by yourself...or even optimise if possible :)
        for (i = 0; i < primes.length; i++) {
            for (j = i; j < primes.length; j++) {
                if (j == i) {
                    min = primes[j];
                    // found minimum at jth index -- save that index to k
                    // because j is gonna keep on running until primes.length
                    k = j;                    
                } else if (primes[j] < min) {
                    min = primes[j];
                    k = j;
                }
            }
            temp = primes[i];
            primes[i] = min;
            primes[k] = temp;
        }
        System.out.println(Arrays.toString(primes));
// ------------------------------------------------------------------------------------------------
        System.out.println("");
        // multidimensional array
        int[][] multidimArray = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        // for example, if we call multidimArray[1][1], it will access the 2nd element of the 
        // first array, which is {5, 6, 7, 8}, and the 2nd element of the second array, which is 6.
        System.out.println(multidimArray[1][1]);
    }
}