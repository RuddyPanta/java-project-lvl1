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

        final String greet = "1";
        final String even = "2";
        final String calc = "3";
        final String gcd = "4";
        final String progression = "5";
        final String prime = "6";
        final String exit = "0";

        //запуск главного меню
        System.out.println("Please enter the game number and press Enter.\n"
                + greet + " - Greet\n"
                + even + " - Even\n"
                + calc + " - Calc\n"
                + gcd + " - GCD\n"
                + progression + " - Progression\n"
                + prime + " - Prime\n"
                + exit + " - Exit");

        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case greet -> Engine.askName();
            case even -> {
                GameEven.gameEven();
            }
            case calc -> {
                GameCalc.gameCalc();
            }
            case gcd -> {
                GameGCD.gameGCD();
            }
            case progression -> {
                GameProgression.gameProgression();
            }
            case prime -> {
                GamePrime.gamePrime();
            }
            default -> Engine.exitProgramWrong();
        }
    }


}




