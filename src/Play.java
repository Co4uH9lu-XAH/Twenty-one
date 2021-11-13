

public class Play {

    public static void main(String[] args) {

        // PrisonerSays.introductorySpeech();
        // ConsoleEnter.fromConsString();
        // PrisonerSays.letsPlay();

        // Сдача карт.
        Distribution firstPlayer = new Distribution();
        firstPlayer.dealTwoCards();
        if (firstPlayer.userScore == 21) {
            System.out.println("You win");
        } else if (firstPlayer.userScore == 22) {
            System.out.println("2 aces. Win");
        } else {
            PrisonerSays.each();
            ConsoleEnter.fromConsString();
            if (ConsoleEnter.saidString.equalsIgnoreCase("n")) {
                System.out.println("Итог: очков у игрока " + firstPlayer.userScore);
            } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {

                while (true) {
                    firstPlayer.dealOneCard();
                    if (firstPlayer.userScore == 21) {
                        System.out.println("Win");
                        break;
                    } else if (firstPlayer.userScore > 21) {
                        System.out.println("Lose");
                        break;
                    } else if (firstPlayer.userScore < 21) {
                        PrisonerSays.each();
                        ConsoleEnter.fromConsString();
                        if (ConsoleEnter.saidString.equalsIgnoreCase("n")) {
                            System.out.println("My deal");
                            break;
                        }
                    }
                }
            }
        }
    }
}
