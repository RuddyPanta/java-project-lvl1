package hexlet.code.controllers.games.calc;

import hexlet.code.controllers.ExitProgram;
import hexlet.code.view.GamesInterface;

//сравнение ответа игрока и компьютера по целым числам
public class ComparisonTwoInt {
    public static void comparisonTwoInt(int answerPlayer, int answerComputer) {
        if (answerComputer == answerPlayer) {
            GamesInterface.correct();
        } else {
            GamesInterface.wrongAnswer(answerPlayer, answerComputer);
            ExitProgram.exitProgramStandard();
        }
    }
}
