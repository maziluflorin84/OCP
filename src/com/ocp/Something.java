package com.ocp;

import com.ocp.p1.Test1;

public class Something {
    public static void main(String[] args) {
        Test1 test1 = new Test1();

        System.out.println(test1.getName());
        test1.setName("BLANK");
        System.out.println("After test1.setName(\"BLANK\"); the value of name is " + test1.getName());

        if (args.length == 0){
            System.out.println("There are no parameters");
        } else {
            System.out.println("These are the parameters:");
            for (String val : args) {
                System.out.println(val);
            }
        }
    }
}
