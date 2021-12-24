public class PlayersDistribution {

     Distribution firstRound = new Distribution();
     Distribution secondRound = new Distribution();

     public void getUserDistribution() throws InterruptedException {
/* Раздача карт игроку с предложением тянуть еще, подсчетом очков и выходом из цикла
в зависимости от взятых карт. Если перебор, то игрок проиграл и сдача заново.
Сначала, как мы помним, сдается две карты, потом в зависимости от ответа игрока или по одной, или раздача
прекращается.
 */

        firstRound.dealTwoCards();
        if (firstRound.userScore == 21) {
            System.out.println("Арестант: Очко.");
            PrisonerSays.prisonerChange();
        } else if (firstRound.userScore == 22) {
            System.out.println("Арестант: 2 туза. Теперь мне карты.");
        } else {
            PrisonerSays.each();
            ConsoleEnter.fromConsStringAnsw();
            if (ConsoleEnter.saidAnsw.equalsIgnoreCase("n") ||
                ConsoleEnter.saidAnsw.equalsIgnoreCase("т")) {
                System.out.println("У "+ ConsoleEnter.saidName+": " + firstRound.userScore+" очков.");
            } else if (ConsoleEnter.saidAnsw.equalsIgnoreCase("y")||
                    ConsoleEnter.saidAnsw.equalsIgnoreCase("н")) {

                while (true) {
                    firstRound.dealOneCard();
                    if (firstRound.userScore == 21) {
                        break;
                    } else if (firstRound.userScore > 21) {
                        break;
                    } else if (firstRound.userScore < 21) {
                        PrisonerSays.each();
                        ConsoleEnter.fromConsStringAnsw();
                        if (ConsoleEnter.saidAnsw.equalsIgnoreCase("n") ||
                                ConsoleEnter.saidAnsw.equalsIgnoreCase("т")) {
                            PrisonerSays.prisonerChange();
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
     public void getPrisonerDistribution() throws InterruptedException {

        firstRound.dealTwoCardsForPrisoner();
        if (firstRound.prisonerScore == 21) {
            System.out.println("Арестант: Экая удача. Бывает и такое.");
            PrisonerSays.playerChange();
        } else if (firstRound.prisonerScore == 22) {
            System.out.println("Арестант: Ну тут я выиграл.");
        } else if (firstRound.prisonerScore>firstRound.userScore){
            System.out.println("Арестант: пожалуй, хватит.");
        } else {
            while (true) {
                firstRound.dealOneCardForPrisoner();

                if (firstRound.prisonerScore == 18) {
                    break;
                } else if (firstRound.prisonerScore == 19) {
                    break;
                } else if (firstRound.prisonerScore == 20) {
                    break;
                } else if (firstRound.prisonerScore == 21){
                    break;
                } else if (firstRound.prisonerScore > 21) {
                    break;
                } else if (firstRound.prisonerScore > firstRound.userScore) {
                    break;
                }
            }
        }
        // Ниже костыли, которые я прикрутил для обнуления очков и раздачи до исправления. В этой версии они не нужны.
        //firstPlayer.dealDeck.clear(); - обнуляет карты на руках
        //firstPlayer.setDealDeckIndex(0);
        //firstPlayer.setUserScore(0); - обнуляет очки игрока

        //System.out.println("Тест надпись: "+ firstPlayer.dealDeck.toString()); - это посмотреть, как работало
    }

     public void getPrisonerDistributionWhenPrisonerFirst() throws InterruptedException {

        secondRound.dealTwoCardsForPrisoner();
        if (secondRound.prisonerScore == 21) {
            System.out.println("Арестант: Вот свезло так свезло");
        } else if (secondRound.prisonerScore == 22) {
            System.out.println("Арестант: Два туза. Поперла карта.");
            Rounds.prisonerPoints++;
        } else if (secondRound.prisonerScore > 18) {
            System.out.println("Арестант: Пожалуй, хватит.");
        } else {
            while (true) {
                if (secondRound.prisonerScore > 18) {
                    break;
                }else if (secondRound.prisonerScore <= 18){
                    System.out.println("Арестант: Еще возьму.");
                    secondRound.dealOneCardForPrisoner();
                }
            }
        }
    }
     public void getUserDistributionWhenUserSecond() throws InterruptedException {
        secondRound.dealTwoCards();
        if (secondRound.userScore == 21) {
            System.out.println("Арестант: Очко.");
        } else if (secondRound.userScore == 22) {
            System.out.println("Арестант: 2 туза. Редкая удача.");
        } else {
            PrisonerSays.each();
            ConsoleEnter.fromConsStringAnsw();
            if (ConsoleEnter.saidAnsw.equalsIgnoreCase("n") ||
                    ConsoleEnter.saidAnsw.equalsIgnoreCase("т")) {
                System.out.println("У "+ ConsoleEnter.saidName+": " + secondRound.userScore+" очков.");
            } else if (ConsoleEnter.saidAnsw.equalsIgnoreCase("y")||
                    ConsoleEnter.saidAnsw.equalsIgnoreCase("н")) {

                while (true) {
                    secondRound.dealOneCard();
                    if (secondRound.userScore == 21) {
                        break;
                    } else if (secondRound.userScore > 21) {
                        break;
                    } else if (secondRound.userScore < 21) {
                        PrisonerSays.each();
                        ConsoleEnter.fromConsStringName();
                        if (ConsoleEnter.saidAnsw.equalsIgnoreCase("n") ||
                                ConsoleEnter.saidAnsw.equalsIgnoreCase("т")) {
                            // System.out.println("Арестант: Моя очередь");
                            break;
                        }
                    }
                }
            }
        }

    }
}



