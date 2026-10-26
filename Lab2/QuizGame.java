package Lab2;


import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String question = "What is the only capital city named after a U.S. president?";
        String correctAnswer = "monrovia"; // Capital of Liberia (named after James Monroe)

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean isCorrect = false;

        System.out.println("Question: " + question);

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + " - Enter your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Good");
                isCorrect = true;
                break;
            } else {
                if (i < attempts) {
                    System.out.println("Incorrect. Try again.");
                }
            }
        }

        if (!isCorrect) {
            System.out.println("Incorrect. The correct answer is: Monrovia");
        }

        scanner.close();
    }
}

