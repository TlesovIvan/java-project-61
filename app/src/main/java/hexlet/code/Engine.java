package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAXRANDOMNUMBER = 100;
    static final int MAXCOUNTER = 3;
    public static final int MAXROUNDCOUNTER = 3;
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
                System.out.println("'" + userAnswer +
                        "' is wrong answer ;(. Correct answer was '" +
                        questionAnswer[i][1] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (counter == MAXCOUNTER) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
