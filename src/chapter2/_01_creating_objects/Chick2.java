package chapter2._01_creating_objects;

public class Chick2 {
    
    private String name = "Fluffy";                // Runs 3rd
    
    { System.out.println("setting field"); }       // Runs 4th
    
    public Chick2() {
        name = "Tiny";                             // Runs 5th
        System.out.println("setting constructor"); // Runs 6th
    }
    
    public static void main(String[] args) {       // Runs first
        Chick2 chick = new Chick2();               // Runs 2nd
        System.out.println(chick.name);            // Runs 7th
    }
}