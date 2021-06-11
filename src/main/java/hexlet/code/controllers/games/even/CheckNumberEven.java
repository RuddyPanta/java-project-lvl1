package hexlet.code.controllers.games.even;

//проверка на чет или нечет числа int
//чет - true
//нечет - false

public class CheckNumberEven {
    public static boolean checkEven(int number) {
                if (number % 2 == 0) {
                    return true;
                }

                return false;
              }
}
