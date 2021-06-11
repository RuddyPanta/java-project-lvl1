package hexlet.code.view;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.controllers.games.calc.GameCalc;
import hexlet.code.controllers.games.even.GameEven;
import hexlet.code.controllers.games.gcd.GameGCD;
import hexlet.code.controllers.games.prime.GamePrime;
import hexlet.code.controllers.games.progression.GameProgression;
import hexlet.code.models.Player;
//меню для выбора игр
public class FirstInterface {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;
    public static void gameMenu() {
       System.out.println("Please enter the game number and press Enter.\n"
                        + GREET + " - Greet\n"
                        + EVEN + " - Even\n"
                        + CALC + " - Calc\n"
                        + GCD + " - GCD\n"
                        + PROGRESSION + " - Progression\n"
                        + PRIME + " - Prime\n"
                        + EXIT + " - Exit");
       switch (ScannerIn.scannerInInt()) {
           case GREET:
               Greet.askName();
               break;

           case EVEN:
               Greet.askName();
               GameEven.gameEven();
               GameEven.gameEven();
               GameEven.gameEven();
               System.out.println("Congratulations, " + Player.getPlayerName() + "!");
               break;

           case CALC:
               Greet.askName();
               GameCalc.gameCalc();
               GameCalc.gameCalc();
               GameCalc.gameCalc();
               System.out.println("Congratulations, " + Player.getPlayerName() + "!");
               break;

           case GCD:
               Greet.askName();
               GameGCD.gameGCD();
               GameGCD.gameGCD();
               GameGCD.gameGCD();
               System.out.println("Congratulations, " + Player.getPlayerName() + "!");
               break;

           case PROGRESSION:
               Greet.askName();
               GameProgression.gameProgression();
               GameProgression.gameProgression();
               GameProgression.gameProgression();
               System.out.println("Congratulations, " + Player.getPlayerName() + "!");
               break;

           case PRIME:
               Greet.askName();
               GamePrime.gamePrime();
               GamePrime.gamePrime();
               GamePrime.gamePrime();
               System.out.println("Congratulations, " + Player.getPlayerName() + "!");
               break;

           case EXIT:
               ExitProgram.exitProgramStandard();
               break;

           default: ExitProgram.exitProgramWrong();
               break;
       }
    }
}
