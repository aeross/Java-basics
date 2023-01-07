// Hello! This is the first Java script to begin our programming adventures.

// Single-line comments are made using double slash.
// This is an example of a single-line comment.

/* This 
is 
an 
example 
of 
a 
multi-line 
comment. */

/** Or this. */

// ------------------------------------------------------------------------------------------------

/**
A typical Java function consists of:

    ReturnType name(parameter) {
        ...
    }

And usually, a basic Java script contains just this function:

    void main() {
        ...
    }

Java functions can't exist on their own. They need to belong in a class.
Every java program needs to at least have one main class.

class Main { 
    void main() {
        ...
    }
}

In java, classes and functions should have an access modifier. The modifiers determine whether
a class or a function can be accessed by other classes or functions. An example of an access modifier
is public.

public class Main { 
    public void main() {
        ...
    }
}

NOTE: a function inside a class is also called a method.
*/

public class Main { 
    public static void main(String[] args) {
        System.out.println("hello world");

/**
To compile the file, type in the terminal
    javac filename.java
in the terminal. To run the file, type
    java filename

Note that the name of the public class (in this case, Main) needs to be the same as the
name of the .java file in order for the file to be successfully compiled.
*/

    // What you'll see down below is the basic syntax to get more familiarity of Java.
    // There might be more time required to understand these if you're new to programming, but
    // if you've mastered other programming language(s) but new to Java, this should be sufficient.

    // Variables
    byte _byte = 10;      // one byte, range [-128, 127]
    short _short = 100;   // two bytes, range [-32k, 32k]
    int integer = 1000;   // four bytes, range [-2b, 2b]
    long _long = 10000L;   // add 'L' at the end
    float _float = 1.1F;   // add 'F' at the end
    double _double = 2.2;
    char character = 'a';
    boolean bool = true;
    // in Java, large numbers can be separated using '_' for readability
    int population = 125_200_000;
    // multiple variable declarations in a line
    int a = 1, b = 2;


    // If statements
    System.out.println("");
    int nice = 69;
    if (nice < 69) {
        System.out.println("too small");
    } else if (nice > 69) {
        System.out.println("too large");
    } else {
        System.out.println("nice");
    }

    // Try statements
    System.out.println("");
    // When the try statement is good
    try {
        int numerator = 10;
        int denumenator = 5;
        int result = numerator / denumenator;
        System.out.println(result);
    } catch(Exception e) {
        System.out.println("something's wrong!");
    } finally {
        System.out.println("this will get printed out regardless of the try catch result");
    }
    // When the try statement throws an exception
    try {
        int numerator = 10;
        int denumenator = 0;
        int result = numerator / denumenator;
        System.out.println(result);
    } catch(Exception e) {
        System.out.println("something's wrong!");
    } finally {
        System.out.println("this will get printed out regardless of the try catch result");
    }
    
    // Loops
    System.out.println("");
    int i, limit = 10;
    for (i = 0; i < limit; i++) {
    }
    System.out.println(i);
    
    limit = 0;
    while (i > limit) {
        i--;
    }
    System.out.println(i);
    
    
    }
}