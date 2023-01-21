package chapter2._04_initializing_variables;

public class CheckAnswer {
    public static void main(String[] args) {
        new CheckAnswer();
    }

    public CheckAnswer() {
        boolean value = true;
        System.out.println(findAnswer(value));
    }

    private int findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            return answer = 1;
        } else {
            return answer = 2;
        }
    }
}