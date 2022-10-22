package chapter1.pack;

public class Test {
    String name;

    public Test() {
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
