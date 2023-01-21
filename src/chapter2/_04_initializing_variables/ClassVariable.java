package chapter2._04_initializing_variables;

public class ClassVariable {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        
        System.out.println("Person 1 name : " + person1.getPersonName());
        System.out.println("Person 2 name : " + person2.getPersonName());
        
        person1.setPersonName("Ion");
        System.out.println("Setting Person 1 name to " + person1.getPersonName());
        System.out.println("Person 2 name : " + person2.getPersonName());
    }
}

class Person {
    private static String name;
    
    public Person() {
        name = "Florin";
    }
    
    public String getPersonName() {
        return this.name;
    }
    
    public void setPersonName(String value) {
        this.name = value;
    }
}