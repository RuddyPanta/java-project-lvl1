package hexlet.code.controllers;

import hexlet.code.models.Player;
//завершение программы
public class ExitProgram {
    //завершение программы
    public static void exitProgramStandard() {
        System.out.println("Let's try again, " + Player.getPlayerName() + "!");
        System.exit(0);
    }
    // завершение программы при неправильном
    // вводе данных
    public static void exitProgramWrong() {
       // System.out.println("incorrect data entry");
        System.out.println("Let's try again, " + Player.getPlayerName() + "!");
        System.exit(0);
    }
}
