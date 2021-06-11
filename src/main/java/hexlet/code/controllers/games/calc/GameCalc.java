package hexlet.code.controllers.games.calc;

import hexlet.code.controllers.ComparisonTwoInt;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GameCalc {
    public static void gameCalc() {
       //формируем случайные числа и операнд
       int varA = RandomNumberForGame.randomRandom(100);
       int varB = RandomNumberForGame.randomRandom(100);
       int varSign = RandomNumberForGame.randomRandom(9);
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
               ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
               break;
           //вычитание
           case 4:
           case 5:
           case 6:
               System.out.println("Question: " + varA + "-" + varB);
               answerPlayer = ScannerIn.scannerInInt();
               answerComputer = varA - varB;
               System.out.println("Your answer: " + answerPlayer);
               ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
               break;
           //умножение
           case 7:
           case 8:
           case 9:
               System.out.println("Question: " + varA + "*" + varB);
               answerPlayer = ScannerIn.scannerInInt();
               answerComputer = varA * varB;
               System.out.println("Your answer: " + answerPlayer);
               ComparisonTwoInt.comparisonTwoInt(answerPlayer, answerComputer);
               break;
           default:
               ExitProgram.exitProgramWrong();
               break;
       }
    }
}
