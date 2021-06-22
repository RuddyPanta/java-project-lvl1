package hexlet.code.games;

import hexlet.code.utils.UtilsScanner;
import hexlet.code.utils.UtilsInfoForPlayer;

public class Engine {
        private static String getStr() {

            return UtilsScanner.scannerInStr();

        }

        private static int getInt() {

            return UtilsScanner.scannerInInt();

        }
        public static void engine(String task, String question, int typeGame, String computerAnswer) {

           UtilsInfoForPlayer.printQuestion(task, question);
           String playerAnswer = null;
           if (typeGame == 1) {
               playerAnswer = getStr();
           }
           if (typeGame == 2) {
               playerAnswer = String.valueOf(getInt());
           }
           if (!(computerAnswer.equals(playerAnswer)) && playerAnswer instanceof String) {
                UtilsInfoForPlayer.wrongAnswer(playerAnswer, computerAnswer);
                UtilsInfoForPlayer.exitProgramWrong();
           }

           UtilsInfoForPlayer.correct();
        }
}
