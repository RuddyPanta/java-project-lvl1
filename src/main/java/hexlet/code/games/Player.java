package hexlet.code.games;

//вся информация об игроке
public class Player {
    //имя игрока по умолчанию
    private static String playerName = "NoName";

    public static String getPlayerName() {
        return playerName;
    }
    public static void setPlayerName(String name) {
        playerName = name;
    }
}
