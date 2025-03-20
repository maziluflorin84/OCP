package chap1.block;

public class Textblock {
    public static void main(String[] args) {
        prepare();
    }
    
    public static void prepare() {
        String labelled = label("""
            Java Study Guide
            For Java 21
            2024 Edition""", "Jeanne & Scott");
        System.out.println(labelled);
    }
    
    public static String label(String title, String author) {
        return """
               Book:
               """ + title + " by " + author;
    }
}