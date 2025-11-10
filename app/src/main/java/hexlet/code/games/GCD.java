package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    public static String[][] generateQA() {
        Random random = new Random();
        String[][] questionAnswer = new String[Engine.MAXROUNDCOUNTER][2];
        for (int i = 0; i < questionAnswer.length; i++) {
            int firstNumber = random.nextInt(Engine.MAXRANDOMNUMBER);
            int secondNumber = random.nextInt(Engine.MAXRANDOMNUMBER);
            questionAnswer[i][0] = firstNumber + " " + secondNumber;
            questionAnswer[i][1] = String.valueOf(evklidRespect(firstNumber, secondNumber));
        }
        return questionAnswer;
    }

    public static int evklidRespect(int firstNumber, int secondNumber) {
        while (secondNumber > 0) {
            int a = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = a;
        }
        return firstNumber;
    }
}
