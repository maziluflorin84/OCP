package chapter2._04_initializing_variables;

public class DoesThisCompile {
    public static void main(String[] args) {
        var question;
        question = 1;
        var answer;
        var check = true;
        if(check) {
            answer = 2;
        } else {
            answer = 3;
        }
    }
}