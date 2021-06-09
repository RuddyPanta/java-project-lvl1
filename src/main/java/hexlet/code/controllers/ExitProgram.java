package hexlet.code.controllers;

import hexlet.code.models.Player;
//завершение программы
public class ExitProgram {
    public static void exitProgram(String answer) {
        //завершение программы
        if (answer.equals("exit")) {
            System.out.println("See you late, " + Player.getPlayerName());
            System.exit(0);
        }
        // завершение программы при неправильном
        // вводе данных
        if (answer.equals("wrong")) {
            System.out.println("incorrect data entry");
            System.out.println("Let's try again, " + Player.getPlayerName());
            System.exit(0);
        }

    }
}
