package hexlet.code.games;

import hexlet.code.utils.UtilsScanner;
import hexlet.code.utils.UtilsInfoForPlayer;

import java.util.List;

public class Engine {


        public static void engine(List<String> taskList,
                                  List<String> questionList,
                                  List<String> computerAnswerList,
                                  final int lifeOfGame) {

           UtilsInfoForPlayer.askName();

           for (int i = 0; i < lifeOfGame; i++) {
               UtilsInfoForPlayer.printQuestion(taskList.get(i), questionList.get(i));
               String playerAnswer = UtilsScanner.scannerIn();

               if (!(computerAnswerList.get(i).equals(playerAnswer)) && playerAnswer instanceof String) {
                   UtilsInfoForPlayer.wrongAnswer(playerAnswer, computerAnswerList.get(i));
                   UtilsInfoForPlayer.exitProgramWrong();
               }

               UtilsInfoForPlayer.correct();
           }
        }
}
