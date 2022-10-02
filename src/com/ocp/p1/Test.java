package com.ocp.p1;

import com.ocp.p2.Test1;

public class Test {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        System.out.println(test1.getName());
        test1.setName("BLANK");
        System.out.println("After test1.setName(\"BLANK\"); the value of name is " + test1.getName());
    }
}
