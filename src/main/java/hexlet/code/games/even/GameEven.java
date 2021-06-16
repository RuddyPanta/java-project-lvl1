package hexlet.code.games.even;

import hexlet.code.utils.UtilsCommunicationWithThePlayer;
import hexlet.code.utils.UtilsForGames;
import hexlet.code.utils.UtilsInAndOutController;

public class GameEven {
    private static final int MAX_LIMIT = 100;
    public static void gameEven() {

        //генерация случайного числа для игрока и вывод на экран
        int randomNumber = UtilsForGames.randomRandom(MAX_LIMIT);
        UtilsCommunicationWithThePlayer.gameInterfaceQuestion("Answer 'yes' if number even"
                                                                        + " otherwise answer 'no'.",
                                                                        randomNumber);

        //проверка числа, где true - чет, false - нечет
        boolean answer = UtilsForGames.checkEven(randomNumber);

        //запрос ответа от игрока
        String answerPlayer = UtilsInAndOutController.scannerInStr();

        //проверка ввода игрока на yes или no
        if (!UtilsForGames.checkIsWordYesOrNo(answerPlayer)) {
            UtilsInAndOutController.exitProgramWrong();
        }

        UtilsCommunicationWithThePlayer.gameInterfaceAnswer(answerPlayer);

        // сравнение ответа игрока
        //если игрок ответил - no (нечетное), а число четное
        if (answerPlayer.equals("no") && answer) {
            UtilsCommunicationWithThePlayer.wrongAnswer(answerPlayer);
            UtilsInAndOutController.exitProgramStandard();
        }

        //если игрок ответил - yes (четное), т.е. число нечетное
        if (answerPlayer.equals("yes") && !answer) {
            UtilsCommunicationWithThePlayer.wrongAnswer(answerPlayer);
            UtilsInAndOutController.exitProgramStandard();
        }

        UtilsCommunicationWithThePlayer.correct();
    }
}
