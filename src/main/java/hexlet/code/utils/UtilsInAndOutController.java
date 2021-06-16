package hexlet.code.utils;

import hexlet.code.games.Player;
import java.util.Scanner;

public class UtilsInAndOutController {

    //получение информации от пользователя
    public static String scannerInStr() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static int scannerInInt() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Please enter the number and press Enter");
            return scannerInInt();
        }
    }

    //завершение программы
    public static void exitProgramStandard() {
        System.out.println("Let's try again, " + Player.getPlayerName() + "!");
        System.exit(0);
    }
    public static void exitProgramWrong() {
        // System.out.println("incorrect data entry");
        System.out.println("Let's try again, " + Player.getPlayerName() + "!");
        System.exit(0);
    }
}


