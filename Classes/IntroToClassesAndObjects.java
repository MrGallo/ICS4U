class Person {
    String firstName;   // Create a field called 'firstName'
    String lastName;
    int age;
}

public class IntroToClassesAndObjects {
    public static void main(String[] args) {

        // Declare a variable called 'person1' to hold a Person object
        Person person1;

        // Create a new Person object with the 'new' keyword, then, assign it to the 'person1' variable.
        person1 = new Person();

        person1.firstName = "Jeff";     // Access object fields with "dot notation".
        person1.lastName = "Gordon";
        person1.age = 42;

        Person person2 = new Person();
        person2.firstName = "John";
        person2.lastName = "Smith";
        person2.age = 35;

        System.out.println("name: " + person1.firstName + " " + person1.lastName);
        System.out.println("age: " + person1.age);
        System.out.println();
        System.out.println("name: " + person2.firstName + " " + person2.lastName);
        System.out.println("age: " + person2.age);
    }
}
