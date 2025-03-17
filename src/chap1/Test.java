package chap1;

public class Test {
    public final static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println("No. of arguments : " + args.length);
        Tested tested = new Tested();
        tested.runTest();
    }
}

class Tested {
    boolean value = true;
    public void runTest() {
        checkValue(this.value);
    }
    
    private void checkValue(boolean val) {
        System.out.println(val);
    }
}