package chapter2._01_creating_objects;

public class Bird {
    public static void main(String[] args) {
        { System.out.println("Feathers"); }
        // This in not an instance initializer
    }
    
    { System.out.println("Snowy"); }
    // This is an instance initializer
}