

public class Play {

    public static void main(String[] args) {

        // PrisonerSays.introductorySpeech();
        // ConsoleEnter.fromConsString();
        // PrisonerSays.letsPlay();

        // Сдача карт.
        Distribution firstPlayer = new Distribution();
        firstPlayer.dealTwoCards();
        PrisonerSays.each();
        ConsoleEnter.fromConsString();
        if (ConsoleEnter.saidString.equalsIgnoreCase("n")) {
            System.out.println("Итог: очков у игрока " + firstPlayer.userScore);
        } else if (firstPlayer.userScore == 21) {
            System.out.println("Win");
        } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {

                while (firstPlayer.userScore<21) { // посмотреть точно ли надо вайл, или обойтись пятью ифами или см ниже
                    firstPlayer.dealOneCard();// тут прописать иф, чтобы не было предложений еще тянуть
                    PrisonerSays.each();// Вместо этого вывести на экран ты проиграл и выйти из сумрака
                    ConsoleEnter.fromConsString();
                }
            System.out.println("lose");
            }
        }
    }