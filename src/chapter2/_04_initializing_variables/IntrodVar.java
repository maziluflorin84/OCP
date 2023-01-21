package chapter2._04_initializing_variables;

public class IntrodVar {
    public static void main(String[] args) {
        WhatType whatType = new WhatType();
        System.out.print("The Var type is a : ");
        System.out.println(whatType.whatTypeAmI().getClass().getSimpleName());
    }
}