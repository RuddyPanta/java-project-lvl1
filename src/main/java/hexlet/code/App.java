package hexlet.code;

import hexlet.code.games.calc.GameCalc;
import hexlet.code.games.even.GameEven;
import hexlet.code.games.gcd.GameGCD;
import hexlet.code.games.prime.GamePrime;
import hexlet.code.games.progression.GameProgression;
import hexlet.code.utils.UtilsInfoForPlayer;
import hexlet.code.utils.UtilsScanner;

public class App {
  public static void main(String[] args) {

      //запуск главного меню
      final int greet = 1;
      final int even = 2;
      final int calc = 3;
      final int gcd = 4;
      final int progression = 5;
      final int prime = 6;
      final int exit = 0;
      final int numberOfAttempts = 3;

      System.out.println("Please enter the game number and press Enter.\n"
                  + greet + " - Greet\n"
                  + even + " - Even\n"
                  + calc + " - Calc\n"
                  + gcd + " - GCD\n"
                  + progression + " - Progression\n"
                  + prime + " - Prime\n"
                  + exit + " - Exit");

          switch (UtilsScanner.scannerInInt()) {
              case greet:
                  UtilsInfoForPlayer.askName();
                  break;

              case even:
                  UtilsInfoForPlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameEven.gameEven();
                  }
                  UtilsInfoForPlayer.congratulations();
                  break;

              case calc:
                  UtilsInfoForPlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameCalc.gameCalc();
                  }
                  UtilsInfoForPlayer.congratulations();
                  break;

              case gcd:
                  UtilsInfoForPlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameGCD.gameGCD();
                  }
                  UtilsInfoForPlayer.congratulations();
                  break;

              case progression:
                  UtilsInfoForPlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameProgression.gameProgression();
                   }
                  UtilsInfoForPlayer.congratulations();
                  break;

              case prime:
                  UtilsInfoForPlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GamePrime.gamePrime();
                    }
                  UtilsInfoForPlayer.congratulations();
                  break;

              case exit:
                  UtilsScanner.exitProgramStandard();
                  break;

              default:
                  UtilsScanner.exitProgramWrong();
                  break;
          }
      }
  }



