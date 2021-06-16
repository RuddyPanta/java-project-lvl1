package hexlet.code.games.gcd;

import hexlet.code.utils.UtilsCommunicationWithThePlayer;
import hexlet.code.utils.UtilsForGames;
import hexlet.code.utils.UtilsInAndOutController;

public class GameGCD {
    private static final int MAX_LIMIT = 1000;
    public static void gameGCD() {
        //формируем две случайные переменные
        int varA = UtilsForGames.randomRandom(MAX_LIMIT);
        int varB = UtilsForGames.randomRandom(MAX_LIMIT);

        String sign = " ";

        UtilsCommunicationWithThePlayer.gameInterfaceQuestion("Find the greatest common"
                                                                        + " divisor of given numbers.",
                                                                            varA, sign, varB);

        //запрос от игрока ответа
        int answerPlayer = UtilsInAndOutController.scannerInInt();
        int answerComputer = SearchGCD.searchGCD(varA, varB);

        UtilsCommunicationWithThePlayer.gameInterfaceAnswer(answerPlayer);

        //если ответ не совпадает, закрытие программы
        UtilsForGames.comparisonTwoInt(answerPlayer, answerComputer);
    }
}
