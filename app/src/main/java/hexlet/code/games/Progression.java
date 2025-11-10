package hexlet.code.games;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static String[][] generateQA() {
        String[][] questionAnswer = new String[3][2];
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
        int startElement = random.nextInt(30);
        int step = random.nextInt(10);
        int length = random.nextInt(5) + 5;
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
