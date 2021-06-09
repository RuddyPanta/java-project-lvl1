package hexlet.code.view;

import hexlet.code.controllers.CheckNumberEven;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.models.Player;

public class GameEven {
    public static void gameEven() {
        //по умолчанию игрок ввел неверные данные
        boolean errorIn = true;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        //генерация случайного числа для игрока и вывод на экран
        int randomNumber = RandomNumberForGame.numberAt100();
        System.out.println("Question: " + randomNumber);
        //проверка числа, где true - чет, false - нечет
        boolean answer = CheckNumberEven.checkEven(randomNumber);
        //запрос ответа от игрока
        String answerPlayer = ScannerIn.scannerInStr();
        System.out.println("Your answer: " + answerPlayer);
        // сравнение ответа игрока
        //если игрок ответил - yes, т.е. число чет
        if (answerPlayer.equals("yes")) {
           if (answer) {
                //и число действительно чет
                System.out.println("Correct!");
                errorIn = false;
           } else {
                //на самом деле нечет
               System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
               System.out.println("Let's try again, " + Player.getPlayerName());
               ExitProgram.exitProgram("exit");
           }
        }
        //если игрок ответил - no, т.е. число нечет
        if (answerPlayer.equals("no")) {
           if (!answer) {
                //и число действительно нечет
                System.out.println("Correct!");
                errorIn = false;
           } else {
                //на самом деле чет
               System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
               System.out.println("Let's try again, " + Player.getPlayerName());
               ExitProgram.exitProgram("exit");
           }
        }

        if (errorIn) {
            ExitProgram.exitProgram("wrong");
        }
    }
}
