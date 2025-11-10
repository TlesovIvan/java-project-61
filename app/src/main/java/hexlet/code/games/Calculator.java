package hexlet.code.games;

import java.util.Random;

public class Calculator {
    public static String[][] generateQA() {
        String[][] questionAnswer = new String[3][2];
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
        int firstNumber = random.nextInt(150);
        int secondNumber = random.nextInt(150);
        int randomNumberForSign = random.nextInt(3) + 1;
        switch (randomNumberForSign) {
            case 1:
                qas[0] = firstNumber + " + " + secondNumber;
                qas[1] = String.valueOf(firstNumber + secondNumber);
                break;
            case 2:
                qas[0] = firstNumber + " - " + secondNumber;
                qas[1] = String.valueOf(firstNumber - secondNumber);
                break;
            case 3:
                qas[0] = firstNumber + " * " + secondNumber;
                qas[1] = String.valueOf(firstNumber * secondNumber);
                break;
        }
        return qas;
    }
}
