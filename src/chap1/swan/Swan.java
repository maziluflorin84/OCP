package chap1.swan;

public class Swan {
    int numberEggs;
    
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;
        System.out.println(mother.numberEggs);
    }
}