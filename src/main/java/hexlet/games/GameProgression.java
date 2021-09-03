package hexlet.games;

import hexlet.code.Engine;
import hexlet.code.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameProgression {

    private static final int MIN_LIMIT = 5;
    private static final int MAX_STEP = 9;
    private static final String SPACE = " ";
    private static final String PROGRESSION = "What number is missing in the progression?";

    private static int[] createArray() {
        // арифметической прогрессии
        //мин 5 ячеек мах 15
        int[] mathArr;
        mathArr = new int[MIN_LIMIT + UtilsForGames.randomRandom(Engine.LIFE_OF_GAME)];
        mathArr[0] = 1;

        //генерация случайного шага
        int step = UtilsForGames.randomRandom(MAX_STEP);

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
                sb.append(".." + SPACE);
                continue;
            }
            sb.append(mathArr[j] + SPACE);
        }

        return sb;

    }

    public static void gameProgression() {

        List<String> questions = new ArrayList<>(Engine.LIFE_OF_GAME);
        List<String> computerAnswers = new ArrayList<>(Engine.LIFE_OF_GAME);

        for (int i = 0; i < Engine.LIFE_OF_GAME; i++) {
            int[] mathArr = createArray();
            int index = UtilsForGames.randomRandom(mathArr.length);
            questions.add(createArrayWistSpace(index, mathArr).toString());
            computerAnswers.add(String.valueOf(mathArr[index - 1]));
        }

        Engine.run(PROGRESSION, questions, computerAnswers);

    }
}
