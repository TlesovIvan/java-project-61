package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static String[][] generateQA() {
        String[][] questionAnswer = new String[Engine.MAXROUNDCOUNTER][2];
        Random random = new Random();
        for (int i = 0; i < questionAnswer.length; i++) {
            questionAnswer[i][0] = String.valueOf(random.nextInt(Engine.MAXRANDOMNUMBER));
            questionAnswer[i][1] = isEven(Integer.parseInt(questionAnswer[i][0]));
        }
        return questionAnswer;
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
