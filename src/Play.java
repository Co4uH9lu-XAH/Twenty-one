

public class Play {

    public static void main(String[] args) {

        // PrisonerSays.introductorySpeech();
        // ConsoleEnter.fromConsString();
        // PrisonerSays.letsPlay();

        // Сдача карт.
        Distribution firstPlayer = new Distribution();
        firstPlayer.dealTwoCards();

        // Ифэлсы первой запрошенной карты
        if (ConsoleEnter.saidString.equalsIgnoreCase("no")){
            System.out.println("My deal");
        } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {
            firstPlayer.dealOneCard();
            // ифэлсы второй запрошенной карты
            if (ConsoleEnter.saidString.equalsIgnoreCase("no")){
                System.out.println("My deal");
            } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {
                firstPlayer.dealOneCard();
                // ифэлсы третьей запрошенной карты
                if (ConsoleEnter.saidString.equalsIgnoreCase("no")){
                    System.out.println("My deal");
                } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {
                    firstPlayer.dealOneCard();
                } else{
                    PrisonerSays.dontUnderstand();
                } // конец третьих элсифов
            } else {
                PrisonerSays.dontUnderstand();
            } // конец вторых илсэфов
        } else {
            PrisonerSays.dontUnderstand();
        } // конец первых идсэфов
        System.out.println("Итог: очков у игрока " + firstPlayer.userScore);
    }
}



