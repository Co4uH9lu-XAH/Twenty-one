public class UserDistribution {

    static Distribution firstPlayer = new Distribution();
    static Distribution secondPlayer = new Distribution();

    static public void getUserDistribution() throws InterruptedException {
/* Раздача карт игроку с предложением тянуть еще, подсчетом очков и выходом из цикла
в зависимости от взятых карт. Если перебор, то игрок проиграл и сдача заново.
Сначала, как мы помним, сдается две карты, потом в зависимости от ответа игрока или по одной, или раздача
прекращается.
 */

        firstPlayer.dealTwoCards();
        if (firstPlayer.userScore == 21) {
            System.out.println("Арестант: Очко. Моя очередь.");
        } else if (firstPlayer.userScore == 22) {
            System.out.println("Арестант: 2 туза. Сдавай.");
        } else {
            PrisonerSays.each();
            ConsoleEnter.fromConsString();
            if (ConsoleEnter.saidString.equalsIgnoreCase("n")) {
                System.out.println("Итог: очков у игрока " + firstPlayer.userScore);
            } else if (ConsoleEnter.saidString.equalsIgnoreCase("y")) {

                while (true) {
                    firstPlayer.dealOneCard();
                    if (firstPlayer.userScore == 21) {
                        break;
                    } else if (firstPlayer.userScore > 21) {
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
/* Раздача арестанту и проверка результата. Если арестант набирает больше очков, чем игрок, выход из цикла.
Если арестанту прилетает 2 туза, он выиграл. Если оба игрока набрали по 19, 20, 21, то арестант согласен на ничью.
Если у игрока меньше 18 очков, то арестант пока тянет еще. В дальнейшем планирую сделать логику выбора
тянуть ли еще, если набралс оглядкой
на те карты, которые уже вышли из колоды.
 */
    static public void getPrisonerDistribution() throws InterruptedException {

        secondPlayer.dealTwoCardsForPrisoner();
        if (secondPlayer.prisonerScore == 21) {
            System.out.println("????");
        } else if (secondPlayer.prisonerScore == 22) {
            System.out.println("Арестант: Два туза. Что там у тебя было? ");
        } else if (secondPlayer.prisonerScore>firstPlayer.userScore){
        } else {
            while (true) {
                secondPlayer.dealOneCardForPrisoner();

                if (secondPlayer.prisonerScore == 18) {
                    break;
                } else if (secondPlayer.prisonerScore == 19) {
                    break;
                } else if (secondPlayer.prisonerScore == 20) {
                    break;
                } else if (secondPlayer.prisonerScore == 21){
                    break;
                } else if (secondPlayer.prisonerScore > 21) {
                    break;
                } else if (secondPlayer.prisonerScore > firstPlayer.userScore) {
                    break;
                }
            }
        }
    }
}



