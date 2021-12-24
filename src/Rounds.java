public class Rounds {


    static int userPoints = 0;
    static int prisonerPoints = 0;




    public  void doFirstRound() throws InterruptedException {
        PlayersDistribution rounds = new PlayersDistribution();

        rounds.getUserDistribution();

        if (rounds.firstRound.userScore > 21) {
            System.out.println("Арестант: Перебор. Я выиграл.");
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println();
            prisonerPoints++;
        } else {
            System.out.println("Давай две");
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println();

            rounds.getPrisonerDistribution();

            if (rounds.firstRound.userScore > 21) {
                System.out.println("Арестант: Перебор. Ты проиграл.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                userPoints++;
            } else if (rounds.firstRound.prisonerScore > 21) {
                System.out.println("Арестант: У меня перебор. Ты выиграл.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                userPoints++;
            } else if (rounds.firstRound.prisonerScore > rounds.firstRound.userScore) {
                System.out.println("Арестант: Я выиграл");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                prisonerPoints++;
            } else if (rounds.firstRound.prisonerScore < rounds.firstRound.userScore) {
                System.out.println("Арестант: У меня меньше. Я проиграл.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                userPoints++;
            } else if (rounds.firstRound.prisonerScore == rounds.firstRound.userScore) {
                System.out.println("Арестант: Поровну. Ничья.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
            }
        }
    }

    public void doSecondRound() throws InterruptedException {
        PlayersDistribution dealSecondRound = new PlayersDistribution();

        dealSecondRound.getPrisonerDistributionWhenPrisonerFirst();
        if (dealSecondRound.secondRound.prisonerScore > 21) {
            System.out.println("Арестант: Перебор. Этот раунд за тобой.");
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println();
            userPoints++;
        } else {
            System.out.println("Арестант: Мне хватит. Твоя очередь.");
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println();
            dealSecondRound.getUserDistributionWhenUserSecond();
            if (dealSecondRound.secondRound.userScore > 21) {
                System.out.println("Арестант: Переборище у тебя. Я выиграл.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                prisonerPoints++;
            } else if (dealSecondRound.secondRound.prisonerScore > dealSecondRound.secondRound.userScore) {
                System.out.println("Арестант: У меня больше. Я одолел.");
            } else if(dealSecondRound.secondRound.prisonerScore < dealSecondRound.secondRound.userScore){
                System.out.println("Арестант: Хм... Не везет в игре мне, повезет в любви. Ты выиграл.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                userPoints++;
            } else if (dealSecondRound.secondRound.prisonerScore == dealSecondRound.secondRound.userScore) {
                System.out.println("Арестант: ничья.");
                System.out.println();
                System.out.println("---------------------------------------------------");
                System.out.println();
                userPoints++;
            }
        }
    }
}
