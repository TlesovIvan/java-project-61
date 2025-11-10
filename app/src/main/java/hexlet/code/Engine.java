package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void startGame(String[][] questionAnswer, String descriptionGame) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println(descriptionGame);
        for (int i = 0; i < questionAnswer.length; i++) {
            System.out.println("Question: " + questionAnswer[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (questionAnswer[i][1].equals(userAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + questionAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + Cli.userName + "!");
                break;
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
}
