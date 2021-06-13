package hexlet.code.view;
import hexlet.code.controllers.ScannerIn;
import hexlet.code.controllers.Player;


//Приветствие пользователя и индикация его имени,
// запись имени в class Player

public class Greet {
    public static void askName() {
        if (Player.getPlayerName().equals("NoName")) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            Player.setPlayerName(ScannerIn.scannerInStr());
            System.out.println("Hello, " + Player.getPlayerName() + "!");
        }
     }
}
