package hexlet.code.games.prime;

import hexlet.code.utils.UtilsCommunicationWithThePlayer;
import hexlet.code.utils.UtilsForGames;
import hexlet.code.utils.UtilsInAndOutController;

public class GamePrime {
    private static final int MAX_LIMIT = 500;
    public static void gamePrime() {

        //генерируем число
        int number = UtilsForGames.randomRandom(MAX_LIMIT);

        //по умолчанию число простое
        boolean numberIsPrime = true;
        boolean answerPlayerIsPrime;

        //если число разделиться без остатка, то оно составное
        //Наименьший положительный и отличный от 1 делитель основного числа а
        // не превосходит √a, где √a является арифметическим корнем заданного числа
        //в данном примере я не замарачиваюсь, что иногда делитель составное число
        for (int i = 2; i < Math.sqrt((double) number); i++) {
            if (number % i == 0) {
                numberIsPrime = false;
            }
        }

        UtilsCommunicationWithThePlayer.gameInterfaceQuestion("Answer 'yes' if given number is prime."
                                                                        + " Otherwise answer 'no'.",
                number);

        String answerPlayer = UtilsInAndOutController.scannerInStr();

        //проверка ввода игрока на yes или no
        if (!UtilsForGames.checkIsWordYesOrNo(answerPlayer)) {
            UtilsInAndOutController.exitProgramWrong();
        }

        //присваивание boolean значение ответу игрока
        if (answerPlayer.equals("yes")) {
            answerPlayerIsPrime = true;
        } else {
            answerPlayerIsPrime = false;
        }

        if (answerPlayerIsPrime != numberIsPrime) {
            String answerComputer = "no";
            if (numberIsPrime) {
                answerComputer = "yes";
            }
            UtilsCommunicationWithThePlayer.wrongAnswer(answerPlayer);
            UtilsInAndOutController.exitProgramStandard();
        }
        UtilsCommunicationWithThePlayer.correct();
    }
}
