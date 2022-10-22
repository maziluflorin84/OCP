package chapter1;

import chapter1.pack.Test;

public class Something {
    public static void main(String[] args) {
        Test test = new Test();

        System.out.println(test.getName());
        test.setName("BLANK");
        System.out.println("After test.setName(\"BLANK\"); the value of name is " + test.getName());

        if (args == null){
            System.out.println("There are no parameters");
        } else {
            System.out.println("These are the parameters:");
            for (String val : args) {
                System.out.println(val);
            }
        }
    }
}
