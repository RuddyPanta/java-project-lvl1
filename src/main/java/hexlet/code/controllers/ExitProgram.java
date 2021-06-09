package hexlet.code.controllers;

import hexlet.code.models.Player;
//завершение программы
public class ExitProgram {
    public static void exitProgram(String answer) {
        //если выбрано 0 из меню выбора игр
        if (answer.equals("exit")) {
            System.out.println("See you late, " + Player.getPlayerName());
            System.exit(0);
        }
        // неправильный ввод данных
        if (answer.equals("wrong")) {
            System.out.println("incorrect data entry");
            System.out.println("Let's try again, " + Player.getPlayerName());
            System.exit(0);
        }
        //выход для игы Even
        if (answer.equals("yes")) {
        //если ответ чет, а на самом деле нечет
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again, " + Player.getPlayerName());
            System.exit(0);
        //если ответ нечет, а на самом деле чет
        } else if (answer.equals("no")) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
            System.out.println("Let's try again, " + Player.getPlayerName());
            System.exit(0);
        }
    }
}
