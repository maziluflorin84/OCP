package chapter2._01_creating_objects;

public class Name {
    static String first = "Abc";
    static String last = "Def";
    static String full = first + last;
    
    public static void main(String[] args) {
        System.out.println(full);
    }
}