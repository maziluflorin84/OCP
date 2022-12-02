package chapter2._01_creating_objects;

public class Egg {
    
    public Egg() {
        number = 5;                          // 5th
    }
    
    public static void main(String[] args) { // 1st
        Egg egg = new Egg();                 // 2nd
        System.out.println(egg.number);      // 6th
    }
    
    private int number = 3;                  // 3rd
    
    { number = 4; }                          // 4th
}