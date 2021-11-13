public class UserDistribution {

    static Distribution firstPlayer = new Distribution();
    static Distribution secondPlayer = new Distribution();

    static public void getUserDistribution() throws InterruptedException {


        firstPlayer.dealTwoCards();
        if (firstPlayer.userScore == 21) {
            System.out.println("Очко. Моя очередь.");
        } else if (firstPlayer.userScore == 22) {
            System.out.println("2 туза. Сдавай.");
        } else {
            PrisonerSays.each();
            ConsoleEnter.fromConsString();
            if (ConsoleEnter.saidString.equalsIgnoreCase("n")) {
                System.out.println("Итог: очков у игрока " + firstPlayer.userScore);
            } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {

                while (true) {
                    firstPlayer.dealOneCard();
                    if (firstPlayer.userScore == 21) {
                        System.out.println("Арестант: Очко. Сдавай.");
                        break;
                    } else if (firstPlayer.userScore > 21) {
                        System.out.println("Арестант: Перебор. Моя очередь.");
                        break;
                    } else if (firstPlayer.userScore < 21) {
                        PrisonerSays.each();
                        ConsoleEnter.fromConsString();
                        if (ConsoleEnter.saidString.equalsIgnoreCase("n")) {
                            System.out.println("Арестант: Моя очередь");
                            break;
                        }
                    }
                }
            }
        }
    }

    static public void getPrisonerDistribution() throws InterruptedException {

        secondPlayer.dealTwoCardsForPrisoner();
        if (secondPlayer.prisonerScore == 21) {
            System.out.println("????");
        } else if (secondPlayer.prisonerScore == 22) {
            System.out.println("Арестант: Два туза. Что там у тебя было? ");
        } else {
            while (true) {
                secondPlayer.dealOneCardForPrisoner();

                if (secondPlayer.prisonerScore == 21) {
                    System.out.println("Арестант: Очко.");
                    break;
                } else if (secondPlayer.prisonerScore > 21) {
                    System.out.println("Арестант: Перебор.");
                    break;
                } else if (secondPlayer.prisonerScore > firstPlayer.userScore) {
                    System.out.println("Арестант: Мне хватит. Считаем очки.");
                    break;
                } else {

                    Thread.sleep(1000);
                }
            }
        }
    }
}



