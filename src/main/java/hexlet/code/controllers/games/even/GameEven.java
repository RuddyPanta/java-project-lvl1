package hexlet.code.controllers.games.even;

import hexlet.code.controllers.CheckIsWordYesOrNo;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.models.Player;

public class GameEven {
    public static void gameEven() {
        //генерация случайного числа для игрока и вывод на экран
        int randomNumber = RandomNumberForGame.randomRandom(100);
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        System.out.println("Question: " + randomNumber);
        //проверка числа, где true - чет, false - нечет
        boolean answer = CheckNumberEven.checkEven(randomNumber);
        //запрос ответа от игрока
        String answerPlayer = ScannerIn.scannerInStr();
        //проверка ввода игрока на yes или no
        if (!CheckIsWordYesOrNo.checkIsWordYesOrNo(answerPlayer)) {
            ExitProgram.exitProgramWrong();
        }
        System.out.println("Your answer: " + answerPlayer);
        // сравнение ответа игрока
        //если игрок ответил - no (нечетное), а число четное
        if (answerPlayer.equals("no") && answer) {
               System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
               System.out.println("Let's try again, " + Player.getPlayerName());
               ExitProgram.exitProgramStandard();

        }
        //если игрок ответил - yes (четное), т.е. число нечетное
        if (answerPlayer.equals("yes") && !answer) {
               System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
               System.out.println("Let's try again, " + Player.getPlayerName());
               ExitProgram.exitProgramStandard();
        }
        System.out.println("Correct!");
//
    }
}
