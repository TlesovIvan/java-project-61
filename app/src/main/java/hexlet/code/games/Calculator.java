package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    static final int COUNTSIGN = 3;
    public static String[][] generateQA() {
        String[][] questionAnswer = new String[Engine.MAXROUNDCOUNTER][2];
        for (int i = 0; i < questionAnswer.length; i++) {
            String[] qa = generateSign();
            questionAnswer[i][0] = qa[0];
            questionAnswer[i][1] = qa[1];
        }
        return questionAnswer;
    }

    public static String[] generateSign() {
        String[] qas = new String[2];
        Random random = new Random();
        int firstNumber = random.nextInt(Engine.MAXRANDOMNUMBER);
        int secondNumber = random.nextInt(Engine.MAXRANDOMNUMBER);
        int randomNumberForSign = random.nextInt(COUNTSIGN) + 1;
        switch (randomNumberForSign) {
            case 1:
                qas[0] = firstNumber + " + " + secondNumber;
                qas[1] = String.valueOf(firstNumber + secondNumber);
                break;
            case 2:
                qas[0] = firstNumber + " - " + secondNumber;
                qas[1] = String.valueOf(firstNumber - secondNumber);
                break;
            case COUNTSIGN:
                qas[0] = firstNumber + " * " + secondNumber;
                qas[1] = String.valueOf(firstNumber * secondNumber);
                break;
            default:
                break;
        }
        return qas;
    }
}
