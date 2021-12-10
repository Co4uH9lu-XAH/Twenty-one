public class Rounds {


    static int userPoints = 0;
    static int prisonerPoints = 0;




    public  void doFirstRound() throws InterruptedException {
        PlayersDistribution dealFirstRound = new PlayersDistribution();
        //int userScoreFoFirstRound = dealFirstRound.firstRound.userScore;
        //int prisonerScoreFoFirstRound = dealFirstRound.firstRound.prisonerScore;

        dealFirstRound.getUserDistribution();

        if (dealFirstRound.firstRound.userScore > 21) {
            System.out.println("Арестант: Перебор. Я выиграл.");
            prisonerPoints++;
        } else {
            System.out.println("Давай две");

            dealFirstRound.getPrisonerDistribution();

            if (dealFirstRound.firstRound.userScore > 21) {
                System.out.println("Арестант: Перебор. Ты проиграл.");
                userPoints++;
            } else if (dealFirstRound.firstRound.prisonerScore > 21) {
                System.out.println("Арестант: У меня перебор. Ты выиграл.");
                userPoints++;
            } else if (dealFirstRound.firstRound.prisonerScore > dealFirstRound.firstRound.userScore) {
                System.out.println("Арестант: Я выиграл");
                prisonerPoints++;
            } else if (dealFirstRound.firstRound.prisonerScore < dealFirstRound.firstRound.userScore) {
                System.out.println("Арестант: У меня меньше. Я проиграл.");
                userPoints++;
            } else if (dealFirstRound.firstRound.prisonerScore == dealFirstRound.firstRound.userScore) {
                System.out.println("Арестант: Поровну. Ничья.");
            }
        }
    }

    public void doSecondRound() throws InterruptedException {
        PlayersDistribution dealSecondRound = new PlayersDistribution();
        //int userScoreForSecondRound = dealSecondRound.secondRound.userScore;
        //int prisonerScoreForSecondRound = dealSecondRound.secondRound.prisonerScore;

        dealSecondRound.getPrisonerDistributionWhenPrisonerFirst();
        if (dealSecondRound.secondRound.prisonerScore > 21) {
            System.out.println("Арестант: Перебор. Этот раунд за тобой.");
            userPoints++;
        } else {
            System.out.println("Арестант: Мне хватит. Твоя очередь.");
            dealSecondRound.getUserDistributionWhenUserSecond();
            if (dealSecondRound.secondRound.userScore > 21) {
                System.out.println("Арестант: Переборище у тебя. Я выиграл.");
                prisonerPoints++;
            } else if (dealSecondRound.secondRound.prisonerScore > dealSecondRound.secondRound.userScore) {
                System.out.println("Арестант: Я одолел.");
            } else if(dealSecondRound.secondRound.prisonerScore < dealSecondRound.secondRound.userScore){
                System.out.println("Арестант: Хм... Не везет в игре мне, повезет в любви.");
                userPoints++;
            } else if (dealSecondRound.secondRound.prisonerScore == dealSecondRound.secondRound.userScore) {
                System.out.println("Арестант: ничья.");
                userPoints++;
            }
        }
    }
}
