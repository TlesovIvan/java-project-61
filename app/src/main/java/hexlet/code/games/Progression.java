package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    static final int MAXSTART = 30;
    static final int MAXSTEP = 10;
    static final int MINPROGRESSIONLENGTH = 5;
    public static String[][] generateQA() {
        String[][] questionAnswer = new String[Engine.MAXROUNDCOUNTER][2];
        for (int i = 0; i < questionAnswer.length; i++) {
            String[] qa = generateProgression();
            questionAnswer[i][0] = qa[0];
            questionAnswer[i][1] = qa[1];
        }
        return questionAnswer;
    }

    public static String[] generateProgression() {
        Random random = new Random();
        String[] qas = new String[2];
        int startElement = random.nextInt(MAXSTART);
        int step = random.nextInt(MAXSTEP) + 2;
        int length = random.nextInt(MINPROGRESSIONLENGTH) + MINPROGRESSIONLENGTH;
        int invisibleElement = random.nextInt(length);
        StringJoiner progression = new StringJoiner(" ");
        for (int i = 0; i < length; i++) {
            if (i == invisibleElement) {
                progression.add("..");
                qas[1] = Integer.toString(startElement + i * step);
                continue;
            }
            progression.add(Integer.toString(startElement + i * step));
        }
        qas[0] = String.valueOf(progression);
        return qas;
    }
}
