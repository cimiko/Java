package go.g2academy;

public class IfElseDemo {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade of " + testscore + " is: " + grade);

        String condition = "abcdef";
        if (condition.equals("abcdef")) {
            System.out.println("Condition is abcdef");
        } else if (!condition.equals("abcdef")) {
            System.out.println("Condition is not abcdef");
        }




    }
}
