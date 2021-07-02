package hexlet.code.utils;

import hexlet.code.games.calc.GameCalc;
import hexlet.code.games.even.GameEven;
import hexlet.code.games.gcd.GameGCD;
import hexlet.code.games.prime.GamePrime;
import hexlet.code.games.progression.GameProgression;


public class StartMenu {

        public static void startMenu() {

            //запуск главного меню
            final int greet = 1;
            final int even = 2;
            final int calc = 3;
            final int gcd = 4;
            final int progression = 5;
            final int prime = 6;
            final int exit = 0;


            System.out.println("Please enter the game number and press Enter.\n"
                    + greet + " - Greet\n"
                    + even + " - Even\n"
                    + calc + " - Calc\n"
                    + gcd + " - GCD\n"
                    + progression + " - Progression\n"
                    + prime + " - Prime\n"
                    + exit + " - Exit");

            switch (Integer.parseInt(UtilsScanner.scannerIn())) {
                case greet -> UtilsInfoForPlayer.askName();
                case even -> {
                    GameEven.gameEven();
                    UtilsInfoForPlayer.congratulations();
                }
                case calc -> {
                    GameCalc.gameCalc();
                    UtilsInfoForPlayer.congratulations();
                }
                case gcd -> {
                    GameGCD.gameGCD();
                    UtilsInfoForPlayer.congratulations();
                }
                case progression -> {
                    GameProgression.gameProgression();
                    UtilsInfoForPlayer.congratulations();
                }
                case prime -> {
                    GamePrime.gamePrime();
                    UtilsInfoForPlayer.congratulations();
                }
                default -> UtilsInfoForPlayer.exitProgramWrong();
            }
        }

}
