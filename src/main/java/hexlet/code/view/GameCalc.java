package hexlet.code.view;

import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GameCalc {
    //метод сравнение ответов
    private static void comparisonOfAnswers(int answerPlayer, int answerComputer) {
        if (answerComputer == answerPlayer) {
            System.out.println("Correct!");
        } else {
            System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answerComputer);
            ExitProgram.exitProgram("exit");
        }
    }
    public static void gameCalc() {
        //формируем случайные числа и операнд
       int varA = RandomNumberForGame.numberAt100();
       int varB = RandomNumberForGame.numberAt100();
       int varSign = RandomNumberForGame.randomAt9();
       System.out.println("What is the result of the expression?");
       int answerPlayer;
       int answerComputer;
       //используется кубик с 9ю гранями для
       //повышения вариативности
       switch (varSign) {
           //сложение
           case 1:
           case 2:
           case 3:
               System.out.println("Question: " + varA + "+" + varB);
               answerPlayer = ScannerIn.scannerInInt();
               answerComputer = varA + varB;
               System.out.println("Your answer: " + answerPlayer);
               comparisonOfAnswers(answerPlayer, answerComputer);
               break;
           //вычитание
           case 4:
           case 5:
           case 6:
               System.out.println("Question: " + varA + "-" + varB);
               answerPlayer = ScannerIn.scannerInInt();
               answerComputer = varA - varB;
               System.out.println("Your answer: " + answerPlayer);
               comparisonOfAnswers(answerPlayer, answerComputer);
               break;
           //умножение
           case 7:
           case 8:
           case 9:
               System.out.println("Question: " + varA + "*" + varB);
               answerPlayer = ScannerIn.scannerInInt();
               answerComputer = varA * varB;
               System.out.println("Your answer: " + answerPlayer);
               comparisonOfAnswers(answerPlayer, answerComputer);
               break;
           default:
               ExitProgram.exitProgram("wrong");
               break;
       }
    }
}
