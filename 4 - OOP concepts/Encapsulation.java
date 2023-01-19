class Encapsulation {
    public static void main(String[] args) {
        Animal cat = new Animal();
        /*
        cat.name = "Creme Puff";       // error
        System.out.println(cat.name);  // error
        */
        cat.setName("Creme Puff");
        System.out.println(cat.getName());
    }
}

/*
Encapsulation is a standard practice of object oriented programming that
hides variables from other classes to make sure such data is hidden from users.

The way to achieve this is to set variables as private and
provide getters and setters to access those variables.
*/

public class Animal {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}