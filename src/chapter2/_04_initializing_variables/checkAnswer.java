package chapter2._04_initializing_variables;

public class checkAnswer {
    public static void main(String[] args) {
        
    }

    private void checkAnswer() {
        boolean value;
        findAnswer(value);
    }

    private void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
    }
}