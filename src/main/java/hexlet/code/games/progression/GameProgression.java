package hexlet.code.games.progression;

import hexlet.code.games.Engine;
import hexlet.code.games.Game;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameProgression {

    private static final int MIN_LIMIT = 5;
    private static final int MAX_STEP = 9;
    private static int[] mathArr;
    private static final String SPACE = " ";

    private static void createArray() {
       // арифметической прогрессии
        //мин 5 ячеек мах 15
        mathArr = new int[MIN_LIMIT + UtilsForGames.randomRandom(Engine.getMaxLimit())];
        mathArr[0] = 1;

        //генерация случайного шага
        int step = UtilsForGames.randomRandom(MAX_STEP);

        //заполнение массива арифметической прогрессией
        for (int j = 1; j < mathArr.length; j++) {
            mathArr[j] = mathArr[j - 1] + step;
        }
    }

    private static StringBuilder createArrayWistSpace(int index) {

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

        List<String> questions = new ArrayList<>(Engine.getLifeOfGame());
        List<String> computerAnswers = new ArrayList<>(Engine.getLifeOfGame());

        for (int i = 0; i < Engine.getLifeOfGame(); i++) {
            createArray();
            int index = UtilsForGames.randomRandom(mathArr.length);
            questions.add(String.valueOf(createArrayWistSpace(index).toString()));
            computerAnswers.add(String.valueOf(mathArr[index - 1]));
        }

        Engine.run(Game.PROGRESSION, questions, computerAnswers);

    }
}
