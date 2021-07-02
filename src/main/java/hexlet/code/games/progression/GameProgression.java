package hexlet.code.games.progression;

import hexlet.code.games.Engine;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameProgression {
    private static final int MAX_LIMIT = 10;
    private static final int MIN_LIMIT = 5;
    private static final int MAX_STEP = 9;
    private static final int LIFE_OF_GAME = 3;

//    private static int[] mathArr;
//
//    private static int step;
//    private static int index;
//
//    private static String task;
//    private static String question;
//    private static String computerAnswer;
//    private static String space = " ";
//
//    private static List<String> taskList = new ArrayList<>(LIFE_OF_GAME);
//    private static List<String> questionList = new ArrayList<>(LIFE_OF_GAME);
//    private static List<String> computerAnswerList = new ArrayList<>(LIFE_OF_GAME);
//
//    private static StringBuilder sb = new StringBuilder();


    public static void gameProgression() {

        int[] mathArr;

        int step;
        int index;

        String task;
        String question;
        String computerAnswer;
        String space = " ";

        List<String> taskList = new ArrayList<>(LIFE_OF_GAME);
        List<String> questionList = new ArrayList<>(LIFE_OF_GAME);
        List<String> computerAnswerList = new ArrayList<>(LIFE_OF_GAME);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < LIFE_OF_GAME; i++) {
            //массив для хранения арифметической прогрессии
            //мин 5 ячеек мах 15
            mathArr = new int[MIN_LIMIT + UtilsForGames.randomRandom(MAX_LIMIT)];
            mathArr[0] = 1;

            //генерация случайного шага
            step = UtilsForGames.randomRandom(MAX_STEP);

            //заполнение массива арифметической прогрессией
            for (int j = 1; j < mathArr.length; j++) {
                mathArr[j] = mathArr[j - 1] + step;
            }

            //генерация индекса для пропуска при выводе
            //массива на экран
            index = UtilsForGames.randomRandom(mathArr.length);

            //куда будет собираться массив и символ пропуска

            for (int j = 0; j < mathArr.length; j++) {
                if (j == index - 1) {
                    sb.append(".." + space);
                    continue;
                }
                sb.append(mathArr[j] + space);
            }


            task = "What number is missing in the progression?";
            question = sb.toString();
            sb.delete(0, sb.length());
            computerAnswer = String.valueOf(mathArr[index - 1]);

            taskList.add(task);
            questionList.add(String.valueOf(question));
            computerAnswerList.add(computerAnswer);


        }

        Engine.engine(taskList, questionList, computerAnswerList, LIFE_OF_GAME);

    }
}
