package hexlet.code;

import hexlet.code.games.calc.GameCalc;
import hexlet.code.games.even.GameEven;
import hexlet.code.games.gcd.GameGCD;
import hexlet.code.games.prime.GamePrime;
import hexlet.code.games.progression.GameProgression;
import hexlet.code.utils.UtilsCommunicationWithThePlayer;
import hexlet.code.utils.UtilsInAndOutController;

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

          switch (UtilsInAndOutController.scannerInInt()) {
              case greet:
                  UtilsCommunicationWithThePlayer.askName();
                  break;

              case even:
                  UtilsCommunicationWithThePlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameEven.gameEven();
                  }
                  UtilsCommunicationWithThePlayer.congratulations();
                  break;

              case calc:
                  UtilsCommunicationWithThePlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameCalc.gameCalc();
                  }
                  UtilsCommunicationWithThePlayer.congratulations();
                  break;

              case gcd:
                  UtilsCommunicationWithThePlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameGCD.gameGCD();
                  }
                  UtilsCommunicationWithThePlayer.congratulations();
                  break;

              case progression:
                  UtilsCommunicationWithThePlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GameProgression.gameProgression();
                   }
                  UtilsCommunicationWithThePlayer.congratulations();
                  break;

              case prime:
                  UtilsCommunicationWithThePlayer.askName();
                  for (int i = 0; i < numberOfAttempts; i++) {
                      GamePrime.gamePrime();
                    }
                  UtilsCommunicationWithThePlayer.congratulations();
                  break;

              case exit:
                  UtilsInAndOutController.exitProgramStandard();
                  break;

              default:
                  UtilsInAndOutController.exitProgramWrong();
                  break;
          }
      }
  }



