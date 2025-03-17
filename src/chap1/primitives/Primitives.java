package chap1.primitives;

public class Primitives {
    public static void main(String[] args) {
        boolean val1 = true;
        System.out.println("val1 = " + val1);
        byte val2 = 127;
        System.out.println("val2 = " + val2);
        short val3 = 32767;
        System.out.println("val3 = " + val3);
        int val4 = 2147483647;
        System.out.println("val4 = " + val4);
        long val5 = 123L;
        System.out.println("val5 = " + val5);
        float val6 = 123.45f;
        System.out.println("val6 = " + val6);
        double val7 = 123.456;
        System.out.println("val7 = " + val7);
        char val8 = 'a';
        System.out.println("val8 = " + val8);
        
        System.out.println(Integer.valueOf("0", 16));
        System.out.println(Integer.valueOf("1", 16));
        System.out.println(Integer.valueOf("2", 16));
        System.out.println(Integer.valueOf("3", 16));
        System.out.println(Integer.valueOf("4", 16));
        System.out.println(Integer.valueOf("5", 16));
        System.out.println(Integer.valueOf("6", 16));
        System.out.println(Integer.valueOf("7", 16));
        System.out.println(Integer.valueOf("8", 16));
        System.out.println(Integer.valueOf("9", 16));
        System.out.println(Integer.valueOf("A", 16));
        System.out.println(Integer.valueOf("B", 16));
        System.out.println(Integer.valueOf("C", 16));
        System.out.println(Integer.valueOf("D", 16));
        System.out.println(Integer.valueOf("E", 16));
        System.out.println(Integer.valueOf("F", 16));
        // System.out.println(Integer.valueOf("G", 16));
    }
}