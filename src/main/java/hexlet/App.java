package hexlet;


import hexlet.code.Engine;
import hexlet.games.GameCalc;
import hexlet.games.GameEven;
import hexlet.games.GameGCD;
import hexlet.games.GamePrime;
import hexlet.games.GameProgression;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        final String GREET = "1";
        final String EVEN = "2";
        final String CALC = "3";
        final String GCD = "4";
        final String PROGRESSION = "5";
        final String PRIME = "6";
        final String EXIT = "0";

        //запуск главного меню
        System.out.println("Please enter the game number and press Enter.\n"
                + GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALC + " - Calc\n"
                + GCD + " - GCD\n"
                + PROGRESSION + " - Progression\n"
                + PRIME + " - Prime\n"
                + EXIT + " - Exit");

        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case GREET -> Engine.askName();
            case EVEN -> {
                GameEven.gameEven();
            }
            case CALC -> {
                GameCalc.gameCalc();
            }
            case GCD -> {
                GameGCD.gameGCD();
            }
            case PROGRESSION -> {
                GameProgression.gameProgression();
            }
            case PRIME -> {
                GamePrime.gamePrime();
            }
            default -> Engine.exitProgramWrong();
        }
    }


}




