package hexlet.code.controllers;
//сравнение ответа игрока и компьютера по целым числам
public class ComparisonTwoInt {
    public static void comparisonTwoInt(int answerPlayer, int answerComputer) {
        if (answerComputer == answerPlayer) {
            System.out.println("Correct!");
        } else {
            System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answerComputer);
            ExitProgram.exitProgramStandard();
        }
    }
}
