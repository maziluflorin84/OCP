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
        // long val5 = 3123456789;
        long val5 = 3123456789L;
        System.out.println("val5 = " + val5);
        float val6 = 123.45f;
        System.out.println("val6 = " + val6);
        double val7 = 123.456;
        System.out.println("val7 = " + val7);
        char val8 = 'a';
        System.out.println("val8 = " + val8);
        
        System.out.print("0 hex -> " + Integer.valueOf("0", 16) + "; ");
        System.out.print("1 hex -> " + Integer.valueOf("1", 16) + "; ");
        System.out.print("2 hex -> " + Integer.valueOf("2", 16) + "; ");
        System.out.print("3 hex -> " + Integer.valueOf("3", 16) + "; ");
        System.out.print("4 hex -> " + Integer.valueOf("4", 16) + "; ");
        System.out.print("5 hex -> " + Integer.valueOf("5", 16) + "; ");
        System.out.print("6 hex -> " + Integer.valueOf("6", 16) + "; ");
        System.out.print("7 hex -> " + Integer.valueOf("7", 16) + "; ");
        System.out.print("8 hex -> " + Integer.valueOf("8", 16) + "; ");
        System.out.print("9 hex -> " + Integer.valueOf("9", 16) + "; ");
        System.out.print("a hex -> " + Integer.valueOf("a", 16) + "; ");
        System.out.print("b hex -> " + Integer.valueOf("b", 16) + "; ");
        System.out.print("c hex -> " + Integer.valueOf("c", 16) + "; ");
        System.out.print("d hex -> " + Integer.valueOf("d", 16) + "; ");
        System.out.print("e hex -> " + Integer.valueOf("e", 16) + "; ");
        System.out.print("f hex -> " + Integer.valueOf("f", 16) + "; ");
        
        System.out.println();
        
        int binary1 = 0b01111111111111111111111111111111;
        long binary2 = 0b011111111111111111111111111111111L;
        int octal1 = 017777777777;
        long octal2 = 020000000000L;
        System.out.println("0b01111111111111111111111111111111 binary -> " + Integer.valueOf(binary1) + "; ");
        System.out.println("0b011111111111111111111111111111111L binary -> " + Long.valueOf(binary2) + "; ");
        System.out.println("017777777777 octal -> " + Integer.valueOf(octal1) + "; ");
        System.out.println("0177777777771 octal -> " + Long.valueOf(octal2) + "; ");
    }
}