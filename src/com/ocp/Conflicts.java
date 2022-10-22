package com.ocp;

import java.util.Date;

public class Conflicts {
    public static void main(String[] args) {
        long date = System.currentTimeMillis();
        Date date1 = new Date(date);
        java.sql.Date date2 = new java.sql.Date(date);
        System.out.println("System.currentTimeMillis(): " + date);
        System.out.println("First date: " + date1);
        System.out.println("Second date: " + date2);
    }
}
