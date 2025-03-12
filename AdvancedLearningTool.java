package advanced.learning.tool;

import java.util.Scanner; // Import Scanner

public class AdvancedLearningTool {
    
    public static void main(String[] args) {
        String[] questions = {
            "Question1: What is the result of 1+1: ",
            "Question2: What is the result of 2+2: ",
            "Question3: What is the result of 3+3: ",
            "Question4: What is the result of 4+4: ",
            "Question5: What is the result of 5+5: "
        };
        
        int[] answers = {2, 4, 6, 8, 10}; // Correct answers
        int correct = 0;
        
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]); // Display question
            int userAnswer = scanner.nextInt(); // Get user input

            if (userAnswer == answers[i]) {
                System.out.println("Correct");
                correct++;
            } else {
                System.out.println("Incorrect");
            }
        }

        System.out.println("You got " + correct + " out of 5 correct");
        scanner.close(); // Close Scanner
    }
}