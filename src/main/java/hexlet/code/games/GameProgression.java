package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;

public class GameProgression {

    private static final String QUESTION_CONSOLE = "What number is missing in the progression?";

    private static int[] createArray() {
        // арифметической прогрессии
        //мин 5 ячеек мах 15
        int[] mathArr;
        final int minLimit = 5;
        mathArr = new int[minLimit + Utils.randomRandom(Engine.LIFE_OF_GAME)];
        mathArr[0] = 1;

        //генерация случайного шага
        final int maxStep = 9;
        final int step = Utils.randomRandom(maxStep);

        //заполнение массива арифметической прогрессией
        for (int j = 1; j < mathArr.length; j++) {
            mathArr[j] = mathArr[j - 1] + step;
        }

        return mathArr;
    }

    private static StringBuilder createArrayWistSpace(int index, int[] mathArr) {

        //куда будет собираться массив и символ пропуска
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < mathArr.length; j++) {
            if (j == index - 1) {
                sb.append("..").append(" ");
                continue;
            }
            sb.append(mathArr[j]).append(" ");
        }

        return sb;

    }

    public static void gameProgression() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {
            int[] mathArr = createArray();
            final int index = Utils.randomRandom(mathArr.length);
            questions.add(createArrayWistSpace(index, mathArr).toString());
            computerAnswers.add(String.valueOf(mathArr[index - 1]));
        }

        Engine.run(QUESTION_CONSOLE, questions, computerAnswers);

    }
}
