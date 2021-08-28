package hexlet.code.games;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public static final String GREET = "1";
    public static final String EVEN = "2";
    public static final String CALC = "3";
    public static final String GCD = "4";
    public static final String PROGRESSION = "5";
    public static final String PRIME = "6";
    public static final String EXIT = "0";

    private static HashMap<String, String> tasks = new HashMap<>((Map.of(

            EVEN, "Answer 'yes' if number even otherwise answer 'no'.",
            CALC, "What is the result of the expression?",
            GCD, "Find the greatest common divisor of given numbers.",
            PROGRESSION, "What number is missing in the progression?",
            PRIME, "Answer 'yes' if given number is prime. Otherwise answer 'no'."
    )));

    public static String taskDescription(String game) {
            return tasks.get(game);
    }





}
