package hexlet.code.view;

import hexlet.code.controllers.CheckNumberEven;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomForGame;
import hexlet.code.controllers.ScannerIn;

public class GameEven {
    public static void gameEven() {
        //по умолчанию игрок ввел неверные данные
        boolean errorIn = true;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        //генерация случайного числа для игрока и вывод на экран
        int randomNumber = RandomForGame.numberAt100();
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
                ExitProgram.exitProgram("yes");
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
                ExitProgram.exitProgram("no");
           }
        }

        if (errorIn) {
            ExitProgram.exitProgram("wrong");
        }
    }
}
