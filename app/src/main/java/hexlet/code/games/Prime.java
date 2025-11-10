package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    static final int SECONDUSUALNUMBER = 3;
    public static String[][] generateQA() {
        Random random = new Random();
        String[][] questionAnswer = new String[Engine.MAXROUNDCOUNTER][2];
        for (int i = 0; i < questionAnswer.length; i++) {
            questionAnswer[i][0] = String.valueOf(random.nextInt(Engine.MAXRANDOMNUMBER));
            questionAnswer[i][1] = isPrime(Integer.parseInt(questionAnswer[i][0]));
        }
        return questionAnswer;
    }

    public static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        if (number == 2) {
            return "yes";
        }
        if (number % 2 == 0) {
            return "no";
        }
        for (int i = SECONDUSUALNUMBER; i < (int) Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
