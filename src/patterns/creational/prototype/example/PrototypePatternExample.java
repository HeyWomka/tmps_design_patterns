package patterns.creational.prototype.example;

public class PrototypePatternExample {
    public static void main(String[] args) {
        Person original = new Person("John Doe", 30);
        System.out.println("Original: " + original);

        Person clone = original.clone();
        System.out.println("Clone: " + clone);

        // Modifying the clone
        clone.setName("Jane Doe");
        clone.setAge(25);

        System.out.println("Modified Clone: " + clone);
        System.out.println("Original after clone modification: " + original);
    }
}
