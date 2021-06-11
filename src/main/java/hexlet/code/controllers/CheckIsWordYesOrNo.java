package hexlet.code.controllers;
//возвращает true если игрок ввел yes или no
//если игрок ошибся возвращает false
public class CheckIsWordYesOrNo {
    public static boolean checkIsWordYesOrNo(String word) {
        if (word.equals("yes") || word.equals("no")) {
            return true;
        }

        return false;
    }
}
