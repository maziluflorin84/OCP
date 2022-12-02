package chapter2._02_understanding_data_types;

public class Test {
    short bird = 'd';
    char mammal = (short)83;
    short reptile = -1;
    char fish = 65535;
    long max = 3123456789L;
    short aByte = 0b01111111;
    
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.bird);
        System.out.println(test.mammal);
        System.out.println(test.reptile);
        System.out.println(test.fish);
        System.out.println(test.max);
        System.out.println(test.aByte);
    }
}