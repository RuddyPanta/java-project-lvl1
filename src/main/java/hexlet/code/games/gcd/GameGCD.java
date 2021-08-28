package hexlet.code.games.gcd;

import hexlet.code.games.Engine;
import hexlet.code.games.Game;
import hexlet.code.utils.UtilsForGames;

import java.util.ArrayList;
import java.util.List;

public class GameGCD {

    private static int searchGCD(int varA, int varB) {
        while (varA != 0 && varB != 0) {
            if (varA > varB) {
                varA = varA % varB;
            } else {
                varB = varB % varA;
            }
        }
        return varA + varB;
    }

      public static void gameGCD() {

        List<String> questions = new ArrayList<>(Engine.getLifeOfGame());
        List<String> computerAnswers = new ArrayList<>(Engine.getLifeOfGame());

        int varA;
        int varB;



        for (int i = 0; i < Engine.getLifeOfGame(); i++) {
            varA = UtilsForGames.randomRandom(Engine.getMaxLimit());
            varB = UtilsForGames.randomRandom(Engine.getMaxLimit());

            questions.add(String.valueOf(varA + " " + varB));
            computerAnswers.add(String.valueOf(searchGCD(varA, varB)));
        }

        Engine.run(Game.GCD, questions, computerAnswers);
    }
}
