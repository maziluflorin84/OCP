package com.ocp.p1;

public class Test1 {
    String name;

    public Test1() {
        this.name = "test" + new Test2().string() + new Test3().string();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Test2 {
    String string() {
        return " new ";
    }
}
class Test3 {
    String string() {
        return "class";
    }
}
