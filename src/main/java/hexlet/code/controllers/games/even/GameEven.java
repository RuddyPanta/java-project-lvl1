package hexlet.code.controllers.games.even;

import hexlet.code.controllers.CheckIsWordYesOrNo;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.view.GamesInterface;

public class GameEven {
    private static final int MAX_LIMIT = 100;
    public static void gameEven() {

        //генерация случайного числа для игрока и вывод на экран
        int randomNumber = RandomNumberForGame.randomRandom(MAX_LIMIT);
        GamesInterface.gameInterfaceQuestion("Answer 'yes' if number even otherwise answer 'no'.", randomNumber);

        //проверка числа, где true - чет, false - нечет
        boolean answer = CheckNumberEven.checkEven(randomNumber);

        //запрос ответа от игрока
        String answerPlayer = ScannerIn.scannerInStr();

        //проверка ввода игрока на yes или no
        if (!CheckIsWordYesOrNo.checkIsWordYesOrNo(answerPlayer)) {
            ExitProgram.exitProgramWrong();
        }
        GamesInterface.gameInterfaceAnswer(answerPlayer);

        // сравнение ответа игрока
        //если игрок ответил - no (нечетное), а число четное
        if (answerPlayer.equals("no") && answer) {
            GamesInterface.wrongAnswer(answerPlayer);
            ExitProgram.exitProgramStandard();

        }

        //если игрок ответил - yes (четное), т.е. число нечетное
        if (answerPlayer.equals("yes") && !answer) {
            GamesInterface.wrongAnswer(answerPlayer);
            ExitProgram.exitProgramStandard();
        }
        GamesInterface.correct();
//
    }
}
