package hexlet.code.games;

import hexlet.code.utils.UtilsInfoForPlayer;

import java.util.List;
import java.util.Scanner;

public class Engine {

        private static final int LIFE_OF_GAME = 3;
        private static final int MAX_LIMIT = 100;

        public static int getLifeOfGame() {
            return LIFE_OF_GAME;
        }

        public static int getMaxLimit() {
            return MAX_LIMIT;
        }

        public static void run(String game,
                                  List<String> questions,
                                  List<String> computerAnswers) {

           UtilsInfoForPlayer.askName();

           for (int i = 0; i < LIFE_OF_GAME; i++) {
               UtilsInfoForPlayer.printQuestion(Game.taskDescription(game), questions.get(i));
               Scanner sc = new Scanner(System.in);
               String playerAnswer = sc.next();

               if (!(computerAnswers.get(i).equals(playerAnswer))) {
                   UtilsInfoForPlayer.wrongAnswer(playerAnswer, computerAnswers.get(i));
                   UtilsInfoForPlayer.exitProgramWrong();
               }

               UtilsInfoForPlayer.correct();
           }

            UtilsInfoForPlayer.congratulations();

        }
}
