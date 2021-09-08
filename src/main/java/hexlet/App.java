package hexlet;


import hexlet.code.Engine;
import hexlet.games.GameCalc;
import hexlet.games.GameEven;
import hexlet.games.GameGCD;
import hexlet.games.GamePrime;
import hexlet.games.GameProgression;

import java.util.Scanner;


public class App {

    private static final String GREET = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
    private static final String EXIT = "0";

    public static void main(String[] args) {

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
            case EVEN -> GameEven.gameEven();
            case CALC -> GameCalc.gameCalc();
            case GCD -> GameGCD.gameGCD();
            case PROGRESSION -> GameProgression.gameProgression();
            case PRIME -> GamePrime.gamePrime();
            default -> {
                break;
            }

        }
    }


}




