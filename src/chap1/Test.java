package chap1;

public class Test {
    public static void main(String[] args) {
        Tested tested = new Tested();
        tested.runTest();
    }
}

class Tested {
    boolean value;
    public void runTest() {
        checkValue(this.value);
    }
    
    private void checkValue(boolean val) {
        System.out.println(val);
    }
}