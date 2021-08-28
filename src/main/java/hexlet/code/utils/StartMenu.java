package hexlet.code.utils;

import hexlet.code.games.Game;
import hexlet.code.games.calc.GameCalc;
import hexlet.code.games.even.GameEven;
import hexlet.code.games.gcd.GameGCD;
import hexlet.code.games.prime.GamePrime;
import hexlet.code.games.progression.GameProgression;

import java.util.Scanner;


public class StartMenu {



        public static void startMenu() {

            //запуск главного меню
             System.out.println("Please enter the game number and press Enter.\n"
                    + Game.GREET + " - Greet\n"
                    + Game.EVEN + " - Even\n"
                    + Game.CALC + " - Calc\n"
                    + Game.GCD + " - GCD\n"
                    + Game.PROGRESSION + " - Progression\n"
                    + Game.PRIME + " - Prime\n"
                    + Game.EXIT + " - Exit");

            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case  Game.GREET -> UtilsInfoForPlayer.askName();
                case Game.EVEN -> {
                    GameEven.gameEven();
                   }
                case Game.CALC -> {
                    GameCalc.gameCalc();
                  }
                case Game.GCD -> {
                    GameGCD.gameGCD();
                  }
                case Game.PROGRESSION -> {
                    GameProgression.gameProgression();
                  }
                case Game.PRIME -> {
                    GamePrime.gamePrime();
                  }
                default -> UtilsInfoForPlayer.exitProgramWrong();
            }
        }

}
