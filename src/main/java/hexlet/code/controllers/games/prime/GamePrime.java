package hexlet.code.controllers.games.prime;

import hexlet.code.controllers.CheckIsWordYesOrNo;
import hexlet.code.controllers.ExitProgram;
import hexlet.code.controllers.RandomNumberForGame;
import hexlet.code.controllers.ScannerIn;

public class GamePrime {
    public static void gamePrime() {
        //генерируем число
        int number = RandomNumberForGame.randomRandom(500);
        //по умолчанию число простое
        boolean numberIsPrime = true;
        boolean answerPlayerIsPrime;
        //если число разделиться без остатка, то оно составное
        //Наименьший положительный и отличный от 1 делитель основного числа а
        // не превосходит √a, где √a является арифметическим корнем заданного числа
        //в данном примере я не замарачиваюсь, что иногда делитель составное число
        for (int i = 2; i < Math.sqrt((double) number); i++) {
            if (number % i == 0) {
                numberIsPrime = false;
            }
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println("Question: " + number);
        String answerPlayer = ScannerIn.scannerInStr();
        //проверка ввода игрока на yes или no
        if (!CheckIsWordYesOrNo.checkIsWordYesOrNo(answerPlayer)) {
            ExitProgram.exitProgramWrong();
        }
        //присваивание boolean значение ответу игрока
        if (answerPlayer.equals("yes")) {
            answerPlayerIsPrime = true;
        } else {
            answerPlayerIsPrime = false;
        }
        System.out.println("Your answer: " + answerPlayer);
        if (answerPlayerIsPrime != numberIsPrime) {
            String answerComputer = "no";
            if (numberIsPrime) {
                answerComputer = "yes";
            }
            System.out.println(answerPlayer + " is wrong answer ;(. Correct answer was " + answerComputer);
            ExitProgram.exitProgramStandard();
            }
        System.out.println("Correct!");
        }
    }

