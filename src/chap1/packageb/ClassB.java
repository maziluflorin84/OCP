package chap1.packageb;

import chap1.packagea.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        System.out.println("Inside " + ClassB.class.getSimpleName());
    }
}