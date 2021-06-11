package hexlet.code.view;

import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.models.Player;
//меню для выбора игр
public class FirstInterface {
   public static void gameMenu() {
       System.out.println("Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
                        + "3 - Calc\n"
                        + "4 - GCD\n"
                        + "5 - Progression\n"
                        + "6 - Prime\n"
                        + "0 - Exit");
       switch (ScannerIn.scannerInInt()) {
           case 1:
               Greet.askName();
               FirstInterface.gameMenu();
               break;

           case 2:
               Greet.askName();
               GameEven.gameEven();
               GameEven.gameEven();
               GameEven.gameEven();
               System.out.println("Congratulations, " + Player.getPlayerName());
               break;

           case 3:
               Greet.askName();
               GameCalc.gameCalc();
               GameCalc.gameCalc();
               GameCalc.gameCalc();
               System.out.println("Congratulations, " + Player.getPlayerName());
               break;

           case 4:
               Greet.askName();
               GameGCD.gameGCD();
               GameGCD.gameGCD();
               GameGCD.gameGCD();
               System.out.println("Congratulations, " + Player.getPlayerName());
               break;

           case 5:
               Greet.askName();
               GameProgression.gameProgression();
               GameProgression.gameProgression();
               GameProgression.gameProgression();
               System.out.println("Congratulations, " + Player.getPlayerName());
               break;

           case 6:
               Greet.askName();
               GamePrime.gamePrime();
               GamePrime.gamePrime();
               GamePrime.gamePrime();
               System.out.println("Congratulations, " + Player.getPlayerName());
               break;
           case 0: ExitProgram.exitProgram("exit");
               break;

           default: ExitProgram.exitProgram("wrong");
               break;
       }
    }
}